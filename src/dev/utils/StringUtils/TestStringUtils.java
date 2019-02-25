package dev.utils.StringUtils;

import org.junit.Test;
import org.junit.Assert;

public class TestStringUtils{
	
	@Test
	public void testTrue(){
		CharSequence lhs = "aviron";
		CharSequence rhs = "avion";
		StringUtils stringUtils = new StringUtils();
		Assert.assertTrue(stringUtils.levenshteinDistance(lhs, rhs) == 1);
	}
	
	@Test
	public void testFalse(){
		CharSequence lhs = "aviron";
		CharSequence rhs = "avion";
		StringUtils stringUtils = new StringUtils();
		Assert.assertTrue(stringUtils.levenshteinDistance(lhs, rhs) == 1);
	}
}
