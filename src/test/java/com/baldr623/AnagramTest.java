package com.baldr623;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
	
	Anagram anag = new Anagram();
	
	@Test
	public void anagramTest() {
		Assert.assertEquals(0, anag.anagramTest("melon","lemon"));
		Assert.assertEquals(3, anag.anagramTest("apple","pear"));
		Assert.assertEquals(4, anag.anagramTest("ss","ssssss"));
		Assert.assertEquals(5, anag.anagramTest("sssssss","ss"));
		Assert.assertEquals(6, anag.anagramTest("car","fox"));
		Assert.assertEquals(6, anag.anagramTest("bear","banana"));
	}

}
