package com.jutem.temp.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IPMatchTest
{
	@Test
	public void IPMatch()
	{
		String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";

		assertTrue("no match",ip.matches(regex));
	}

	private String ip="192.168.21.1";
}
