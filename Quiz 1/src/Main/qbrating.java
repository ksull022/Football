package Main;

import java.util.Scanner;

public class qbrating {
	public static void main(String[] args){
		
		//Ask for all user input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first name of player: ");
		String First = input.next();
		
		System.out.println("Please enter the last name of player: ");
		String Last = input.next();
		
		System.out.println("Enter number of touchdowns: ");
		Float TD = input.nextFloat();
		
		while (TD < 0){
			System.out.println("Number of touchdowns must be greater than or equal to 0 please reenter");
			TD = input.nextFloat();}
		
		System.out.println("Enter total number of yards: ");
		Float YD = input.nextFloat();
		
		while (YD < 0){
			System.out.println("Total number of yards must be greater than or equal to 0 please reenter");
			YD = input.nextFloat();}
		
		System.out.println("Enter number of Interceptions: ");
		Float INT = input.nextFloat();
		
		while (INT < 0){
			System.out.println("Number of interceptions must be greater than or equal to 0 please reenter");
			INT = input.nextFloat();}
		
		System.out.println("Enter total number of completions: ");
		Float COMP = input.nextFloat();
		
		while (COMP < 0){
			System.out.println("Total number of completions must be greater than or equal to 0 please reenter");
			COMP = input.nextFloat();}
		
		System.out.println("Enter total number of attempted passes: ");
		Float ATT = input.nextFloat();
		
		while (ATT < 0){
			System.out.println("Total number of attemped passes must be greater than or equal to 0 please reenter");
			ATT = input.nextFloat();}
		
		double a = (COMP/ATT - .3) * 5;
		double b = (YD/ATT - 3) * .25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - (INT/ATT * 25);
		
		if (a<0){
			a=0;}
		if (b<0){
			b=0;}
		if (c<0){
			c=0;}
		if (d<0){
			d=0;}
		if (a>2.375){
			a=2.375;}
		if (b>2.375){
			b=2.375;}
		if (c>2.375){
			c=2.375;}
		if (d>2.375){
			d=2.375;}
		double pr = 100*(a+b+c+d)/6;
		System.out.printf(First+" "+ Last + "'s QB passer rating is %3.1f", pr);
		input.close();
	}
}
