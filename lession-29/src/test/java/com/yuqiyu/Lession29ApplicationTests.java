package com.yuqiyu;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
@Slf4j
public class Lession29ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testLombok()
	{
		//测试Getter/Setter
		UserBean user = new UserBean();
		user.setName("测试lombok");
		user.setAge(10);
		user.setAddress("测试地址");

		UserBean u = new UserBean("构造lombok",1,"测试地址");

		log.info(u.toString());
	}

}
