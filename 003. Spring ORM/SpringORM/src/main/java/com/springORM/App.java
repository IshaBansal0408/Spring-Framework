package com.springORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.dao.SingerDao;
import com.springORM.entity.Singer;

import antlr.collections.List;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("MainConfig.xml");
		SingerDao singerDao = applicationContext.getBean("singerDao", SingerDao.class);
		
//		Inserting Data
//		Singer s1 = new Singer(1,"Taylor","London");
		Singer s1 = new Singer(2,"Selena","America");
		int insertData = singerDao.insertData(s1);
//		System.out.println(insertData);
		
//		Updating Data
		Singer s2 = new Singer(1,"Taylor","America");
		singerDao.updateData(s2);
		
//		Get a particular singer
		System.out.println(singerDao.getSinger(1));
		
//		Get all Singers
		System.out.println(singerDao.getAllSingers());
		
//		Delete Singer
		singerDao.deleteData(2);
		System.out.println(singerDao.getAllSingers());
		
	}
}
