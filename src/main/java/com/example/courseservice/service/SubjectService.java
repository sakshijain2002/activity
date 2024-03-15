package com.example.courseservice.service;

import com.example.courseservice.entity.SubjectEntity;
import com.example.courseservice.repository.SubjectRepository;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

	//	@Autowired
	private final SubjectRepository subjectRepos;
	
	public SubjectService(SubjectRepository subjectRepos) {
		this.subjectRepos = subjectRepos;
	}

	public void addSubject(SubjectEntity subject) {
		subjectRepos.save(subject);	
	}

	public void updateSubject(String id, SubjectEntity subject) {
		subjectRepos.save(subject);	
	}
	
	public void deleteSubject(String id) {
		subjectRepos.deleteById(id);	
	}

	public SubjectEntity getSubject(String id) {
		return subjectRepos.findById(id).get();
	}

	
}
