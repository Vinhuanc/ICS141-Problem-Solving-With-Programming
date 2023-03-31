package musicapp;

public class Pop extends Music {
	private int year;
	private String location;
	
	public Pop(String title, String artist, double length, int year, String location) {
		super(title, artist, length);
		this.year = year;
		this.location = location;
	}

	@Override
	public String toString() {
		return super.toString() + " year: " + year + ", " + "location: " + location + ".";
	}

	public int increaseVolume() {
		int volume = super.increaseVolume();
		return  volume *= 2;
	}
	
	public String nameThatTune() {
		return super.getTitle();
	}
	
	

	
}
