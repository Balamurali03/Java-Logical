package com.test;



import org.junit.Assert;
import org.junit.Test;

import com.impl.Loginpage;





public class Apptest {
	@Test
	public void testlog()
	{
		Loginpage lp=new Loginpage();
		Assert.assertEquals(0, lp.login("abc", "bab"));
	}

}
