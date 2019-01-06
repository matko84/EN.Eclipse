package matko;

import javax.annotation.processing.RoundEnvironment;
import javax.swing.JOptionPane;

public class E4Z9 {

	public static void main(String[] args) {


		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj sekundi"));
				
		// 1h 3600 s
		// 1min 60 s
			
		int h=(a-a%3600)/3600;
		int min=a%3600/60;
		int sec=a%60;
		
		System.out.println("Time: " + h + ":" + min + ":" + sec);
	}

}
