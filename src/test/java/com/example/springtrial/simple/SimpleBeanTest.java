package com.example.springtrial.simple;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class SimpleBeanTest {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	public void testConstructorBasedInjection() {
		Assert.assertEquals(simpleBean.getName(), "SimpleBeanName");
	}

	@Test
	public void testPropertyBasedInjection() {
		Assert.assertEquals(simpleBean.getOrder(), 5);
	}
	
	@Test
	public void testApplicationContextAwareness() {
		Assert.assertTrue(simpleBean.hasApplicationContext());
	}
}
