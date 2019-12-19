package com.song;

import java.util.ArrayList;

public class Album {

	private String name;
	private ArrayList<Song> songs;
	/**
	 * @param name
	 * @param songs
	 */
	public Album(String name, ArrayList<Song> songs) {
		this.name = name;
		if(this.songs==null) {
			this.songs = new ArrayList<Song>();
		}
		this.songs = songs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "Album [name=" + name + ", songs=" + songs + "]";
	}
	
}
