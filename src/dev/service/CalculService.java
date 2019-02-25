package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException.CalculException;

public class CalculService {

	private static final Logger LogCalculService = LoggerFactory.getLogger(CalculService.class);
	public int additionner(String expression) throws CalculException{

		//TODO Ajouter un log en niveau DEBUG affichant "Evaluation de l'expression <expression>".
		LogCalculService.debug("Evaluation de l'expression <"+expression+">");
		
		//TODO par exemple "Evaluation de l'expression 1+4"
		int result = Character.getNumericValue(expression.charAt(0));
		for(int i = 1; i < expression.length(); i++){
			if(("+".charAt(0)) == (expression.charAt(i))){
				i++;
				result += Character.getNumericValue(expression.charAt(i));				
			}else if(("-".charAt(0)) == (expression.charAt(i))){
				i++;
				result -= Character.getNumericValue(expression.charAt(i));				
			}
		}		
		return result;
	}

}

