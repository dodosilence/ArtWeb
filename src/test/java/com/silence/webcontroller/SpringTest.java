package com.silence.webcontroller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.silence.illustration.dao.UserDao;
import com.silence.illustration.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/root-context.xml")
public class SpringTest {
	@Autowired
	private UserDao userDao;
	@Resource
	private DataSource dataSource;

	@Test
	public void test1() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(userDao);
		
//		
//		
		System.out.println("sadas");
		int count=userDao.addOneUser(new User("asd", "love201314", "nome", "123456789", "asdasd"));
		System.out.println(count);
	}

}


