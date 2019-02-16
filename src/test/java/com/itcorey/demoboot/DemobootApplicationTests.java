package com.itcorey.demoboot;

import com.itcorey.demoboot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemobootApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Test
	public void testUser(){
		User user = new User();
		user.setAge(18);
		user.setName("葫芦娃");
	}

}

