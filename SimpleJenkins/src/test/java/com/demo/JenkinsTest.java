package com.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test
	public void sample()
	{
		Reporter.log("Test class Executed",true);
	}

}
