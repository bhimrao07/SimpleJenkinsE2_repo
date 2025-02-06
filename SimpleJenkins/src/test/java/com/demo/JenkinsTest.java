package com.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	public void sample()
	{
		Reporter.log("Jenkins Test class Executed, Good to see",true);
	}

}
