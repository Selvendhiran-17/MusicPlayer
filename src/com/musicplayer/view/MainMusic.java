package com.musicplayer.view;



import java.util.InputMismatchException;
import java.util.Scanner;


import com.musicplayer.controller.MusicController;

public class MainMusic {

	public static void main(String[] args) {
		MusicController musicControl=new MusicController();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to music player");
		System.out.println();
		while(true) {
			System.out.println("______________________________");
			System.out.println("Please enter your option");
			System.out.println("1--->previous song");
			System.out.println("2--->stop music");
			System.out.println("3--->next song");
			System.out.println("4--->Exit");
			try {
				
				byte option = scanner.nextByte();
				
				if(option==1) {
					musicControl.previousSong();
				}
				else if(option==2) {
					musicControl.stop();
				}
				else if(option==3){
					musicControl.nextSong();
				}
				else {
					musicControl.stop();
					break;
				}
				
			}
			catch(InputMismatchException e) {
				System.out.println("please enter valid input");
				scanner.nextLine();
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("End of an playlist");
			}
			
			catch(Exception e) {
				System.out.println(e);
				scanner.nextLine();
			}
		}
		scanner.close();
	}
}
