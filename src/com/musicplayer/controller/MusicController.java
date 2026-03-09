package com.musicplayer.controller;

import com.musicplayer.model.SongChanger;

public class MusicController {

	SongChanger songChange=new SongChanger();
	int songIndex=-1;
	
	public MusicController() {
		songChange.addSongs();
	}
	
	public void previousSong() throws IndexOutOfBoundsException, Exception {
		if(songIndex>-1) {
			songChange.playSongs(--songIndex);
		}
		else {
			songIndex=-1;
			System.out.println("End of playList");
		}
	}
	
	public void nextSong() throws IndexOutOfBoundsException, Exception {
		
		if(songIndex<10) {
			songChange.playSongs(++songIndex);
		}
		else {
			songIndex=10;
			System.out.println("End of playList");
		}
	}
	
	public void stop() {
		songChange.stopSong();
	}
	
}
