//Gururaj Sambhaji Yadav
//This is task 2
//Number guessing game
//java devlopment


package com.tasks.Number_Guess;


import java.util.*;
public class Task2_Number_Guess {
	public static void Num_Guessing()
	{
		
		Scanner sc = new Scanner(System.in);
		int num=1+(int)(100*Math.random()); //this is random function and will select random number
		int trys=5;
		int guess,i,a,points=0;
		
		System.out.println("hello!! Welcome to Guess the Number game..");
		System.out.println("number is between 1 to 100");
		
		
		for(i=0;i<5;i++) {
			System.out.println("\nTry to Guess a number..");
			guess=sc.nextInt();
			
			
			
			if(guess>100 || guess<0) {
				System.out.println("Sorry!! You have to enter only number between 1 to 100");
			}
			else if(guess==num) 
			{
				System.out.println("Congrats!! You guessed right");
				points+=10;
				System.out.println("Your score is "+points);
				break;
			}
			else if (guess>num && i!=trys-1) {
				System.out.println("Oops! Number is less than"+guess);
			}
			else if(guess<num && i!=trys-1) {
				System.out.println("Oops! Number is greater than"+guess);
			}
		}
		
		if(trys==i) {
			System.out.println("\nyou have completed round successfully");
			System.out.println("\nThe number is "+num);
			System.out.println("\n\nDo you want to continue..");
			System.out.println("Enter 1 for continue...");
			a=sc.nextInt();
			
			
			if(a==1) {
				Num_Guessing(); 
			}
			else {
				System.out.println("Thank You!!!!! See You Again....");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		Num_Guessing();
	}
}