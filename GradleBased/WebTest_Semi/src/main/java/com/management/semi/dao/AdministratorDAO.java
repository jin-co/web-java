package com.management.semi.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.management.semi.vo.Administrator;

@Mapper
@Repository
public interface AdministratorDAO {
	Administrator selectAdmin(Administrator administrator) throws Exception;
}
