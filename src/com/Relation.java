package com;

import java.util.Scanner;

// Main Class which executes/shows the relation
public class Relation {
	//	Main Function
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);		//	Scanner to get the user input
		Honda honda = new Honda();		//	Creating the Specific Bike object and setting the data from the user. We are getting these because of "is a" relation
		
		System.out.print("Enter a BIKE name : ");
		honda.setBikeName(userInput.nextLine());
		
		System.out.print("Enter Engine CC : ");
		honda.setCc(userInput.nextLine());
		
		System.out.print("Enter Top Speed : ");
		honda.setTopSpeed(userInput.nextInt());
		
		System.out.println("------------------------------------------------------------");
		honda.bikeData();	//	To print the bike info
		
		System.out.println("------------------------------------------------------------");
		honda.bikeStartTest(honda.getBikeName());
		honda.bikeStopTest(honda.getBikeName());
		
		//	Note : "HAS-A" relation is better than "IS-A" relation as because "HAS-A" is loose coupled and has better code re-usability. 
		//	Further "IS-A" tightly coupled and any change in the superclass affects its hierarchy to subclasses.  
		userInput.close();
	}
}