package com.ita.training.java.conditional;

public class SwitchDemo {

	
	
	public static void main(String[] args) {
		System.out.println("--- Percentage of Marks ----");
		String grade = "E";
		
		switch (grade) {
		case "A":
				System.out.println("Passed with about 90%");
			break;
		case "B":
				System.out.println("Passed with about 80%");
			break;
		case "C":
				System.out.println("Passed with about 70%");
			break;
		case "D":
				System.out.println("Passed with about 50%");
			break;

		default:
			System.out.println("---Please contact your HEAD MASTER---");
			break;
		}
	}
}
