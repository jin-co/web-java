package com.management.semi.service;

import java.util.List;

import com.management.semi.vo.Programmer;

public interface ProgrammerService {
	List<Programmer> searchAll() throws Exception;
	void registerWorker(Programmer programmer) throws Exception; 
	Programmer searchProgrammer(String id) throws Exception;
	// update
	void updateWorker(Programmer programmer, String id) throws Exception;
	void deleteWorker(String id) throws Exception;
}
