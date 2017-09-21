import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		JOptionPane.showMessageDialog(null, "For the next question choose either a dog,duck,cow,cat,or llama");
for (int i = 0; i < 100000; i++) {
	

		String animal= JOptionPane.showInputDialog("What animal do you like?");
		if (animal.equals("cow")){
				playMoo();
				
				
				
		}
		if (animal.equals("duck")) {
			playQuack();
			
			
			
		}
		if (animal.equals("dog")) {
			playWoof();
			
			
		}
		if (animal.equals("cat")) {
			playmeow();
		}
		if (animal.equals("llama"));
		playLlama();
		}
	}
		
		
		
		/* 2. Make it so that the user can keep entering new animals. */
	

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}
	void playmeow() {
		playNoise(meowFile);
	}
	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}


