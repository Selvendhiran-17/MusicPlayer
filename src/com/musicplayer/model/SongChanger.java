package com.musicplayer.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SongChanger {

	File folder =new File("C:\\ECLIPSE-WORKSPACE\\MusicPlayer\\resource\\audio");
	List<File> songs = new ArrayList<>();
	Clip clip ;

	public void addSongs(){
		for(File file:folder.listFiles()) {
			if(file.getName().endsWith(".wav")) {
				songs.add(file);
			}
		}
	}

	public void playSongs(int index) throws IndexOutOfBoundsException,Exception {

		if (clip != null) {
			clip.stop();
			clip.close();  
		}

		File musicFile =new File(songs.get(index).toString());
		AudioInputStream audio = AudioSystem.getAudioInputStream(musicFile);
		clip = AudioSystem.getClip();
		clip.open(audio);
		clip.start();
		System.out.println("Song Name :"+musicFile.getName());
		System.out.println("Music playing...");

	}

	public void stopSong() {

		if (clip != null) {
			clip.stop();   
			clip.close();  
			System.out.println("Music Stopped... :)");
		}
		else {
			System.out.println("Music not playing");
		}

	}

	public List<File> showSongs() {
		return songs;
	}
}
//file handling multithreading --> project