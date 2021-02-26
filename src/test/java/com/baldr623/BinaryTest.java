package com.baldr623;

import org.junit.Test;
import org.junit.Assert;

public class BinaryTest {
	
	Binary bin = new Binary();

	@Test
	public void testBinaryConvertIterative() {
		//Tests method for passing zero
		Assert.assertEquals("0", bin.convertIterative(0));
		
		//Tests method for passing one
		Assert.assertEquals("1", bin.convertIterative(1));
		
		//Test calculation of method for values 2,3,175 and 289457
		Assert.assertEquals("10", bin.convertIterative(2));
		Assert.assertEquals("11", bin.convertIterative(3));
		Assert.assertEquals("10101111", bin.convertIterative(175));
		Assert.assertEquals("1000110101010110001", bin.convertIterative(289457));
		
		//Test method for passing a negative number
		Assert.assertEquals("No negative values allowed", bin.convertIterative(-1));
		Assert.assertEquals("No negative values allowed", bin.convertIterative(-175));
		
	}
	
	@Test
	public void testBinaryConvertRecursive() {
		//Tests method for passing zero
		Assert.assertEquals("0", bin.convertRecursive(0));
		
		//Tests method for passing one
		Assert.assertEquals("1", bin.convertRecursive(1));
		
		//Test calculation of method for values 2,3,175 and 289457
		Assert.assertEquals("10", bin.convertRecursive(2));
		Assert.assertEquals("11", bin.convertRecursive(3));
		Assert.assertEquals("10101111", bin.convertRecursive(175));
		Assert.assertEquals("1000110101010110001", bin.convertRecursive(289457));
		
		//Test method for passing a negative number
		Assert.assertEquals("No negative values allowed", bin.convertIterative(-1));
		Assert.assertEquals("No negative values allowed", bin.convertIterative(-175));
	}

}