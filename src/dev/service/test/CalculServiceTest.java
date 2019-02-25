package dev.service.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException.CalculException;
import dev.service.CalculService;

/**
 * Test unitaire de la classe dev.service.CalculService.
 */

public class CalculServiceTest {

	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);

	
	@Test
	public void testAdditionner() throws Exception {
		
		LOG.info("Etant donné, une instance de la classe CalculService"); 
		CalculService calculService = new CalculService();

		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4"); // TODO
		int somme = calculService.additionner("1+3+4");
		
		LOG.info("Alors j'obtiens le résultat 8");
		assertThat(somme).isEqualTo(8); 
	}
	
	@Test
	public void testAdditionnerException() {
		LOG.info("Etant donné, une instance de la classe CalculService"); 
		CalculService calculService = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression invalide 1*a*4");		
		LOG.info("Alors j'obtiens une CalculException.");
		assertThatThrownBy(() -> { calculService.additionner("1*a*4"); }).isInstanceOf(CalculException.class);
	}

}