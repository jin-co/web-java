package com.management.semi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.semi.dao.ProgrammerDAO;
import com.management.semi.vo.Programmer;

@Service
public class ProgrammerServiceImplement implements ProgrammerService {
	@Autowired
	private ProgrammerDAO programmerDAO;
	
	@Override
	public List<Programmer> searchAll() throws Exception {
		List<Programmer> programmers = programmerDAO.selectProgrammers();
		if (programmers == null) throw new Exception("조회실패");
		return programmers;
	}

	@Override
	public void registerWorker(Programmer programmer) throws Exception {
		Programmer programmerFound = programmerDAO.selectProgrammer(
				programmer.getId());
		if (programmerFound != null) throw new Exception("아이디 중복");
		if (programmerDAO.insertProgrammer(programmer) == 0)
			throw new Exception("프로그래머 등록실패");
	}

	@Override
	public Programmer searchProgrammer(String id) throws Exception {
		Programmer programmer = programmerDAO.selectProgrammer(id);
		if (programmer == null) throw new Exception("검색실패");
		return programmer;
	}

	// update
	@Override
	public void updateWorker(Programmer programmer, String id) throws Exception {
		Programmer foundProgrammer = programmerDAO.selectProgrammer(id);
		if (foundProgrammer == null) throw new Exception("아이디가 존재하지않습니다.");
		if (programmerDAO.updateProgrammer(programmer) == 0)
			throw new Exception("프로그래머 갱신실패");
	}

	@Override
	public void deleteWorker(String id) throws Exception {
		Programmer programmer = programmerDAO.selectProgrammer(id);
		if (programmer == null) throw new Exception("아이디가 존재하지않습니다.");
		if (programmerDAO.deleteProgrammer(programmer) == 0)
			throw new Exception("프로그래머 삭제실패");
	}
}
