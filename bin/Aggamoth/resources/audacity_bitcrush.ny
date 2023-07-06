;nyquist plug-in
;version 4
;type process
;preview linear
;name "BitCrusher"
;debugbutton false
;author "Steve Daulton"
;release "3.0.2-2"
;copyright "Released under terms of the GNU General Public License version 2 or later"


;; Released under terms of the GNU General Public License version 2 or later:
;; http://www.gnu.org/licenses/old-licenses/gpl-2.0.html


;control bits "Bits per sample" int "" 8 1 16
;control rate "Sample Rate" int "kHz" 8 1 40
;control order "Process order" choice "Crush->Resample,Resample->Crush,Crush Only,Resample Only" 0
;control mix "Mix:        Dry" float "Wet" 100 0 100
;control gain "Output level" float "" 0.9 0  1


(setf rate (* rate 1000))
(setf mix (/ mix 100))


(defun abs-quantize (sig bits)
  (let ((steps (power 2 bits))
        factor offset)
    ;; Integer bit depth, so clip at +/- 1
    (setf sig (clip sig 1))
    ;; Nyquist QUANTIZE has +1 steps (steps above and below zero)
    ;; 'steps' must be an integer.
    (setf steps (round (1- steps)))
    ;; To achieve desired number of bits:
    ;; 1. Offset to +ve values
    (setf sig (sum 1 sig))
    ;; 2. Scale to -1 bit
    (setf factor (/ (- steps 1.0) steps))
    (setf offset (/ factor 2.0))
    ;; 1 bit can only  be 1 or 0
    (if (> steps 1)
        (setf sig (mult 0.5 sig factor))
        (setf sig (mult 0.5 sig)))
    (setf sig (quantize sig steps))
    ; scale and fit to range +/-1
    (if (> steps 1)
        (mult (/ 2.0 factor) (sum (- offset) sig))
        sig)))


(defun qrate (sig hz)
  (resample (resample sig hz) *sound-srate*))


(defun process (sig mode)
  (case mode
      (0 (qrate (abs-quantize sig bits) rate))
      (1 (abs-quantize (qrate sig rate) bits))
      (2 (abs-quantize sig bits))
      (t (qrate sig rate))))


(let ((wet (mult mix (process *track* order)))
      (dry (mult (- 1 mix) *track*)))
  (mult gain (sim wet dry)))
