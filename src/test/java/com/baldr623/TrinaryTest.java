package com.baldr623;

import org.junit.Assert;
import org.junit.Test;

public class TrinaryTest {
	
	Trinary tri = new Trinary();

	@Test
	public void testTrinaryConvertIterative() {
		Assert.assertEquals("0", tri.convertIterative(0));
		
		Assert.assertEquals("1", tri.convertIterative(1));
		
		Assert.assertEquals("2", tri.convertIterative(2));
		Assert.assertEquals("10", tri.convertIterative(3));
		Assert.assertEquals("122", tri.convertIterative(17));
		Assert.assertEquals("20111", tri.convertIterative(175));
		Assert.assertEquals("211022212220", tri.convertIterative(439503));
		
		Assert.assertEquals("No negative values allowed", tri.convertIterative(-1));
		Assert.assertEquals("No negative values allowed", tri.convertIterative(-17));
	}

}
