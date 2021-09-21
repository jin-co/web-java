package com.management.semi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.management.semi.vo.Programmer;

@Mapper
@Repository("programmerDAO")
public interface ProgrammerDAO {
	List<Programmer> selectProgrammers() throws Exception;
	Programmer selectProgrammer(String id) throws Exception;
	int insertProgrammer(Programmer programmer) throws Exception;
	//delete
	int deleteProgrammer(Programmer programmer) throws Exception;
	// update
	int updateProgrammer(Programmer programmer)throws Exception;
	
	
}
