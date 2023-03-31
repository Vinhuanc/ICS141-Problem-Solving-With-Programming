package musicapp;

public class PlaylistDriver {

	public static void main(String[] args) {
			// one datatype of Music
			Music musicSong = new Music("Nowdays", "lil skies", 3.25);
			System.out.println(musicSong.getLength());
			musicSong.setLength(3.55);
			System.out.println(musicSong.getTitle());
			musicSong.setTitle("Nowdays - Life of a dark rose");
			musicSong.addMinutes(1);
			System.out.println("volume is: " + musicSong.increaseVolume());
			System.out.println(musicSong.toString());
			System.out.println();

			
			// one datatype of Pop
			// Subclass#1 is able to call the methods from the Music class
			// Music class isn't able to call the child class as its not the main class.
			// One way to do so is through a method, such as this: 
//			public void test(Music m) {
//				if(m instanceof Jazz) {
//					((Jazz)m).method();
//				}
//			}
			// otherwise, it would return an error
		
			
			Pop popSong = new Pop("Toxic", "Brittany Spears", 3.32, 2003, "LA, CA");
			System.out.println(popSong.getLength());
			popSong.setLength(4.25);
			System.out.println(popSong.getTitle());
			popSong.setTitle("Toxic - Brittany Spears");
			popSong.addMinutes(2);
			System.out.println("volume is: " + popSong.increaseVolume());
			System.out.println(popSong.toString());
			System.out.println(popSong.nameThatTune());
			System.out.println();
			
			// one datatype of Jazz
			Jazz jazzSong = new Jazz("What a wonderful world", "Louis Armstrong", 2.19, "free-versed", "violin, drum, flute, double bass, and many others..." );
			System.out.println(jazzSong.getLength());
			jazzSong.setLength(2.15);
			System.out.println(jazzSong.getTitle());
			jazzSong.setTitle("What a wonderful world - Louis Armstrong");
			jazzSong.addMinutes(1);
			System.out.println("volume is: " + jazzSong.increaseVolume());
			System.out.println(jazzSong.toString());
			System.out.println(jazzSong.nameThatTune());
			System.out.println();
			
			// Instantiating music object and assigning to subclass #1
			// still a music declare type, with a reference to the pop
			// no errors for this one
			musicSong = new Pop("Nowdays", "lil skies", 3.25, 2020, "LA");
			System.out.println(musicSong.getLength());
			musicSong.setLength(3.55);
			System.out.println(musicSong.getTitle());
			musicSong.setTitle("Nowdays - Life of a dark rose");
			musicSong.addMinutes(1);
			System.out.println("volume is: " + musicSong.increaseVolume());
			System.out.println(musicSong.toString());
			System.out.println();
			
			// instantiating the subclass #2 object and assigning to the music reference variable 
			// error of: Type mismatch: cannot convert from Music to Jazz
			// throws a ClassCastException error
		//	jazzSong = (Jazz) new Music("What a wonderful world", "Louis Armstrong", 2.19);
			Music music1 = jazzSong;
			Jazz rv = (Jazz) music1;
			System.out.println(jazzSong.getLength());
			jazzSong.setLength(2.15);
			System.out.println(jazzSong.getTitle());
			jazzSong.setTitle("What a wonderful world - Louis Armstrong");
			jazzSong.addMinutes(1);
			System.out.println("volume is: " + jazzSong.increaseVolume());
			System.out.println(jazzSong.toString());
			System.out.println(jazzSong.nameThatTune());
			System.out.println();
			
			System.out.println("Program done by: Cindy Chen");

	}

}
