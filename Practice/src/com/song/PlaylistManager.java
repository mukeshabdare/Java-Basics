package com.song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlaylistManager {

	public static void main(String[] args) {
		ArrayList<Song> songList = new ArrayList<Song>();
		songList.add(new Song("Abc", 2.5));
		songList.add(new Song("bbc", 5.5));
		songList.add(new Song("zzz",7.2));
		
		Album alphaAlbum = new Album("Alpha", songList);
		
		ArrayList<Song> songList1 = new ArrayList<Song>();
		songList1.add(new Song("111", 2.5));
		songList1.add(new Song("222", 5.5));
		songList1.add(new Song("333",7.2));
		
		Album numAlbum = new Album("Numeric", songList1);
		
		
		LinkedList<Song> playList = new LinkedList<Song>();
		
		playList.add(alphaAlbum.getSongs().get(2));
		playList.add(numAlbum.getSongs().get(0));
		playList.add(alphaAlbum.getSongs().get(1));
		playList.add(numAlbum.getSongs().get(2));
		playList.add(alphaAlbum.getSongs().get(0));
		managePlayList(playList);
	}

	private static void managePlayList(LinkedList<Song> playList) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean flag = true;
		boolean goingForward = true;
		ListIterator<Song> itr = playList.listIterator();
		showMenu();
		while(flag) {

			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				
			case 0 : System.out.println("Showing menu\n");
			showMenu();
			break;
			
			case 1:
			if(!goingForward) {
				if(itr.hasNext()) {
					itr.next();
					goingForward = true;
				}
			}
			if(itr.hasNext()) {
				System.out.println("Now Playing : "+itr.next());
			} else {
				System.out.println("Last song is playing!");
			}
			showMenu();
			break;
			
			case 2:
				
			if(goingForward) {
				if(itr.hasPrevious()) {
					itr.previous();
					goingForward = false;
				}
			}	
			if(itr.hasPrevious()) {
				System.out.println("Now Playing : "+itr.previous());
			} else {
				System.out.println("First song is playing!");
			}
			showMenu();
			break;
			
			case 3:
			if(goingForward) {
				if(itr.hasPrevious()) {
					System.out.println("Re-Playing : "+itr.previous());
					goingForward = false; 
				} 
			} else {
				if(itr.hasNext()) {
					System.out.println("Re-Playing : "+itr.next());
					goingForward = true; 
				}
			}
			
			showMenu();
			break;
			
			case 4 : System.out.println("Exiting music player!");
			flag = false;
			sc.close();
			break;
			}
		}
		
	}

	private static void showMenu() {

		System.out.println("\n 0: Show menu"+
							"\n 1: Play next song"+
							"\n 2: Play previous song"+
							"\n 3: Replay current song"+
							"\n 4: Quit\n");
	}

}
