package Aggamoth.displays;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer {
	static Clip clip;
	static AudioInputStream audioInputStream;
	static String filePath;
	
	public Clip getClip() {
		return clip;
	}
	public void setClip(Clip clip) {
		this.clip = clip;
	}
	public AudioInputStream getAudioInputStream() {
		return audioInputStream;
	}
	public void setAudioInputStream(AudioInputStream audioInputStream) {
		this.audioInputStream = audioInputStream;
	}
	public String getFilePath() {
		return filePath;
	}
	public static void setFilePath(String filePath) {
		AudioPlayer.filePath = filePath;
	}
	
	public static void AudioPlayerChoseTrack(String filePath)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		AudioPlayer.audioInputStream = 
				AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
		AudioPlayer.clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		AudioPlayer.filePath = filePath;
	}
	
	public static void play()
	{
		//start the clip
		clip.start();
	}
	
	public static void stop() throws UnsupportedAudioFileException,
	IOException, LineUnavailableException
	{
		clip.stop();
		clip.close();
	}
	
	
	
	
}
