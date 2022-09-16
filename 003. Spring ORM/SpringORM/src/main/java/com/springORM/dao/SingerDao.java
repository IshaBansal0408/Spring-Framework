package com.springORM.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springORM.entity.Singer;

public class SingerDao {

	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// Insert Row in Database
	@Transactional
	public int insertData(Singer singer) {
		int saveValue = (Integer) this.hibernateTemplate.save(singer);
		return saveValue;
	}

//	Update Row in Database
	@Transactional
	public void updateData(Singer singer) {
		hibernateTemplate.update(singer);
	}
	
//	Get Singer Data
	public Singer getSinger(int id) {
		Singer singer = hibernateTemplate.get(Singer.class,id);
		return singer;
	}
	
//	Get All Singers
	public List<Singer> getAllSingers(){
		List<Singer> allSingers = hibernateTemplate.loadAll(Singer.class);
		return allSingers;
	}
	
//	Deleting Data
	@Transactional
	public void deleteData(int id) {
		Singer singer = hibernateTemplate.get(Singer.class,id);
		hibernateTemplate.delete(singer);
	}
}
