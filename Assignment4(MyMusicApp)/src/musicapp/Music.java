/*
 * Date: 3/3/23
 * Description: Assignment #4, assignment to practice inheritance
 * Due Date: 3/29/23
 * Course: ICS 141-02
 * Name: Cindy Chen
 */
package musicapp;

import java.text.DecimalFormat;

public class Music {
	private String title;
	private String artist;
	private double length;
	private int volume;
	DecimalFormat df = new DecimalFormat("#0.00");

	public Music(String title, String artist, double length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
		this.volume = 2;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * A method to add extra minutes to the song's length
	 * 
	 * @param extraMinutes
	 */
	public void addMinutes(int extraMinutes) {

		df.format(this.length += extraMinutes);
	}

	/**
	 * A method to increase the volume of the music
	 */
	public int increaseVolume() {
		return this.volume *= 5;
	}

	@Override
	public String toString() {
		return  "title: " + title + ", "+ "artist: " + artist + ", " + "length: " + df.format(length) + ", " + "volume: " + df.format(volume);
	}
	
}