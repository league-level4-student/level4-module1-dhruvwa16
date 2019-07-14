package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("hi");
		}
		switch(choice) {
		case "Monday":
			System.out.println("hello");
		}
		switch(choice) {
		case "Tuesday":
			System.out.println("hey");
		}
		switch(choice) {
		case "Wednesday":
			System.out.println("hola");
		}
		switch(choice) {
		case "Thursday":
			System.out.println("bonjour");
		}
		switch(choice) {
		case "Friday":
			System.out.println("hi");
		}
		switch(choice) {
		case "Saturday":
			System.out.println("hey");
		}
			
		}
	}

