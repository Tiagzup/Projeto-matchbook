package com.br.zup.matchbook.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class LoginTest {
	private Login login;
	
	@Before
	public void preparar () {
		login = new Login();
		
		login.getId();
		login.setId(null);
		login.getNickname();
		login.setNickname("Robô");
		login.getEmail();
		login.setEmail("Robo@zup.com.be");
		login.getPassword();
		login.setPassword("123456");
	}
	@Test
	public void setNickname () {
		assertEquals("Robô", login.getNickname());
		
	}
	@Test
	public void getNickname () {
		assertEquals(login.getNickname(), "Robô");
	}

}
