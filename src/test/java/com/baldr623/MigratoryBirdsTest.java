package com.baldr623;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MigratoryBirdsTest {
	
	MigratoryBirds mb = new MigratoryBirds();
	
	@Test
	public void mbTest() {
		Assert.assertEquals(1, mb.migratoryBirds(Arrays.asList(1, 2, 3, 4, 5)));
		Assert.assertEquals(1, mb.migratoryBirds(Arrays.asList(1, 3, 2, 1, 1, 2)));
		Assert.assertEquals(2, mb.migratoryBirds(Arrays.asList(1, 3, 2, 1, 2, 2, 5, 4, 4, 3, 4)));
		Assert.assertEquals(3, mb.migratoryBirds(Arrays.asList(1, 3, 2, 5, 3, 5, 4, 4)));
		Assert.assertEquals(5, mb.migratoryBirds(Arrays.asList(1, 5, 3, 5, 2, 5, 1, 5, 1, 5, 2, 5)));
	}

}
