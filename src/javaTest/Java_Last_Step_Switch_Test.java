package javaTest;

import java.util.Scanner;

public class Java_Last_Step_Switch_Test {

	public static void main(String[] args) {
		int status = 0;
		boolean gate = true;
		String replyString = "";
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Start");
		do {
			switch(status) {
				case 0:
					System.out.println("Step 1");
					System.out.println("Continue? 1 for Go, -1 for Back");
					replyString = inputScanner.nextLine();
					
					if(replyString.equals("-1")) {
						status = 0;
					}
					else if(replyString.equals("1")) {
						status++;
					}
					break;
				case 1:
					System.out.println("Step 2");
					System.out.println("Continue? 1 for Go, -1 for Back");
					replyString = inputScanner.nextLine();
					
					if(replyString.equals("-1")) {
						status--;
					}
					else if(replyString.equals("1")) {
						status++;
					}
					break;
				case 2:
					System.out.println("Step 3");
					System.out.println("Continue? 1 for Go, -1 for Back");
					replyString = inputScanner.nextLine();
					
					if(replyString.equals("-1")) {
						status--;
					}
					else if(replyString.equals("1")) {
						status++;
					}
					break;
				case 3:
					System.out.println("Step 4");
					System.out.println("Continue? 1 for Go, -1 for Back");
					replyString = inputScanner.nextLine();
					
					if(replyString.equals("-1")) {
						status--;
					}
					else if(replyString.equals("1")) {
						status++;
					}
					break;
				default:
					System.out.println("Step 5");
					System.out.println("Continue? 1 for Go, -1 for Back");
					replyString = inputScanner.nextLine();
					
					if(replyString.equals("-1")) {
						status--;
					}
					else if(replyString.equals("1")) {
						status++;
						gate = false;
					}
					break;
			}
		}while(gate);
		System.out.println("End");
		inputScanner.close();
	}
}
