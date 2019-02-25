package dev.utils.StringUtils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * This class is for try what return we have on the class StringUtils.java
 * @author Diginamic
 *
 */
public class StringUtilsTest{

	/**
	 * This function try if the return distance is true
	 */
	@Test
	public void testDistance1(){
		CharSequence lhs = "aviron";
		CharSequence rhs = "avion";
		StringUtils stringUtils = new StringUtils();
		assertEquals(1, stringUtils.levenshteinDistance(lhs, rhs));
	}
	
	@Test
	public void testDistance7(){
		CharSequence lhs = "azertyui";
		CharSequence rhs = "a";
		StringUtils stringUtils = new StringUtils();
		assertEquals(7, stringUtils.levenshteinDistance(lhs, rhs));
	}

	/**
	 * This function try what happened if the left value is null
	 */
	@Test
	public void testValueLeftNull(){
		CharSequence lhs = null;
		CharSequence rhs = "avion";
		StringUtils stringUtils = new StringUtils();
		assertEquals(50, stringUtils.levenshteinDistance(lhs, rhs));

	}

	/**
	 * This function try what happened if the right value is null
	 */
	@Test
	public void testValueRightNull(){
		CharSequence lhs = null;
		CharSequence rhs = null;
		StringUtils stringUtils = new StringUtils();
		assertEquals(0, stringUtils.levenshteinDistance(lhs, rhs));
	}
}
