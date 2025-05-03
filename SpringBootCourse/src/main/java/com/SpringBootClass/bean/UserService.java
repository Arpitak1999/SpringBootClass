package com.SpringBootClass.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.user.UserDao;

@Component
public class UserService {
		private UserDao userDao;
		public UserService() {
			//System.out.println( "UserService .....Constructor");
			System.out.println( "0 Param .....Constructor");
		}
		@Autowired
		public void setUserDao(UserDao userDao) {
			System.out.println("setter is called");
			this.userDao= userDao;
		}
		@Autowired
		public UserService(UserDao userDao) {
			System.out.println( "Param .....Constructor");
			this.userDao= userDao;
		}
		public void printName(int id) {
			//UserDao dao = new UserDao();
			String nameById =userDao.findByName(100);
			System.out.println(nameById);
		}
}
