package dev.exception.CalculException;

public class CalculException extends Exception{
	
	public void invalide(String expression){
		System.out.println("L'expression "+expression+" est invalide");
	}
	
}
