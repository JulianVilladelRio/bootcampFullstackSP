package curso;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2.A
		/*
		String option;
		String textstring = " ";
		
		option = JOptionPane.showInputDialog("Please enter the type of the numeric string (A=54 or B=08)");
		
		if (option.contentEquals("A")) {
			textstring = "54";
			for (int i=0;i<8;i++) {
				textstring = textstring + (int) Math.round(Math.random()*10);
			}
		}
		else if (option.contentEquals("B")) {
			textstring = "08";
			for (int i=0;i<8;i++) {
				textstring = textstring + (int) Math.round(Math.random()*10);
			}
		}
		else {
			System.out.println("Please enter A or B");
		}
		
		System.out.println("Generated text-type numeric string: " + textstring);
		*/
		//2.B
		
		String entry;
		
		/* If I want to input the list values
		
		int lng = Integer.parseInt(JOptionPane.showInputDialog("Please enter the list extension "));
		
		String [] List = new String[lng];
		
		for (int i=0;i<List.length;i++) {
			entry = JOptionPane.showInputDialog("Please enter a string value ");
			List[i] = entry;
			System.out.println("Registered string: " + List[i]);
		}
		*/
		String [] List = {"Blue", "Red", "Yellow", "Green", "Black", "White"};
		
		entry = JOptionPane.showInputDialog("Please enter a string value ");

		if (Arrays.asList(List).contains(entry)==true) { 
			System.out.println(false);
		}
		else {
			System.out.println(true);
		}
	
	}

}
