package musicapp;

public class Jazz extends Music {
	private String rhythm;
	private String instrument;
	
	public Jazz(String title, String artist, double length, String rhythm, String instrument) {
		super(title, artist, length);
		this.rhythm = rhythm;
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		
		return super.toString() + " rhythm: " + rhythm + ", " + "instruments: " + instrument  + ".";
	}
	
	public String nameThatTune() {
		return super.getTitle();
	}
}
