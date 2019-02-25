package dev.console;

import java.util.Scanner;

import dev.exception.CalculException.CalculException;
import dev.service.CalculService;

public class App {

	private Scanner scanner;
	private CalculService calculatrice;
	public App(Scanner scanner, CalculService calculatrice) { 
		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}

	protected void afficherTitre() {
		System.out.println("**** Application Calculatrice ****");
	}

	public void demarrer() {
		afficherTitre();
	}

	protected void evaluer(String expression) {
		
		try {
			int result = calculatrice.additionner(expression);
		} catch (CalculException e) {
			// TODO Auto-generated catch block
			e.invalide(expression);
		}
		
	}

}