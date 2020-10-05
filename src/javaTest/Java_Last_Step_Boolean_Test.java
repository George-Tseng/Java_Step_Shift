package javaTest;

import java.util.Scanner;

public class Java_Last_Step_Boolean_Test {
	public static void main(String[] args) {
		String replyString = "";
		boolean[] gates = {true, false, false, false, false};
		System.out.println("Start");
		boolean gate = true;
		Scanner inputScanner = new Scanner(System.in);
		do{
			if(gates[0]){
				System.out.println("Step 1");
				System.out.println("Continue? 1 for Go, -1 for Back");
				replyString = inputScanner.nextLine();

				if(replyString.equals("-1")) {
					gates[0] = true;
				}
				if(replyString.equals("1")) {
					gates[0] = false;
					gates[1] = true;
				}
			}
			if(gates[1]){
				System.out.println("Step 2");
				System.out.println("Continue? 1 for Go, -1 for Back");
				replyString = inputScanner.nextLine();

				if(replyString.equals("-1")) {
					gates[0] = true;
					gates[1] = false;
				}
				else if(replyString.equals("1")) {
					gates[1] = false;
					gates[2] = true;
				}
			}
			if(gates[2]){
				System.out.println("Step 3");
				System.out.println("Continue? 1 for Go, -1 for Back");
				replyString = inputScanner.nextLine();

				if(replyString.equals("-1")) {
					gates[1] = true;
					gates[2] = false;
				}
				else if(replyString.equals("1")) {
					gates[2] = false;
					gates[3] = true;
				}
			}
			if(gates[3]){
				System.out.println("Step 4");
				System.out.println("Continue? 1 for Go, -1 for Back");
				replyString = inputScanner.nextLine();

				if(replyString.equals("-1")) {
					gates[2] = true;
					gates[3] = false;
				}
				else if(replyString.equals("1")) {
					gates[3] = false;
					gates[4] = true;
				}
			}
			if(gates[4]){
				System.out.println("Step 5");
				System.out.println("Continue? 1 for Go, -1 for Back");
				replyString = inputScanner.nextLine();

				if(replyString.equals("-1")) {
					gates[3] = true;
					gates[4] = false;
				}
				else if(replyString.equals("1")) {
					gates[4] = false;
					gate = false;
				}
			}
		}while(gate);
		System.out.println("End");
		inputScanner.close();
	}
}
