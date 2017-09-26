package com;
	
//	Class "Honda" "is a" (relation) specific type of Bike which is extended the same
public class Honda extends Bike{
	
	// The below methods uses the "Engine" Class methods which exhibits "has a" (relation) 
	public void bikeStartTest(String bikeName) {
		Engine hondaEngine = new Engine();
		hondaEngine.startEngine(bikeName);
	}
	
	public void bikeStopTest(String bikeName) {
		Engine hondaEngine = new Engine();
		hondaEngine.stopEngine(bikeName);
	}
}
