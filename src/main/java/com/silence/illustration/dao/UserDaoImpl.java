package com.silence.illustration.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.silence.illustration.pojo.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	private SqlSession session;

	@Resource
	private void getSession(SqlSessionFactory sessionFactory) {
		this.session = sessionFactory.openSession();
	}

	@Override
	public int addOneUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("1");
		String statement = "com.silence.illustration.mapper.UserMapper.addUser";
		int count = session.insert(statement, user);
		System.out.println("2");
		return count;
	}

}
