package com.br.zup.matchbook.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.br.zup.matchbook.models.Login;
import com.br.zup.matchbook.models.User;
import com.br.zup.matchbook.repositories.LoginRepository;

@RunWith(SpringRunner.class)
public class LoginServiceTest {
	@Autowired
	private LoginService loginService;
	
	@MockBean
	private LoginRepository loginRepository;
	
	private Login login;
	
	private User user;
	
	@Before
	public void prepare () {
		login = new Login ();
		user = new User ();
		
		login.setId(null);
		login.setNickname("Lula");
		login.setEmail("lula@livre.com.br");
		login.setPassword("123456");
		login.setUser(user);
	}
	
	@Test
	public void registerLogin () throws Exception {
		assertEquals(loginService.registerLogin(user, login), "Login cadastrado");
	}
	public void findByNicknameAndPassword () throws Exception {
		assertEquals(loginService.findByNickAndPass(login), login.getNickname());
	}
}





