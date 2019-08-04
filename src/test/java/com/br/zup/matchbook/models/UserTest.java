package com.br.zup.matchbook.models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserTest {
	private User user;
	@Before
	public void prepare () {
		user = new User ();
		
		user.getId();
		user.setId(null);
		user.getName();
		user.setName("Zeca");
		user.getLastName();
		user.setLastName("Urubu");
		user.getAge();
		user.setAge(33);
		user.getCity();
		user.setCity("Rio de Janeiro");
		user.getGender();
		user.setGender("Masculino");
		
	}
	@Test
	public void getAge () {
		assertEquals(user.getAge(), 33);
	}
	@Test
	public void setAge () {
		assertEquals(33, user.getAge());
	}
}
