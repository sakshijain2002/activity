package com.example.courseservice.controller;


import com.example.courseservice.entity.SubjectEntity;
import com.example.courseservice.service.SubjectService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/subjects")
public class SubjectController {

	//	@Autowired
	private final SubjectService subjectService;
	
	public SubjectController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

	@GetMapping("/{id}")
	public SubjectEntity getAllSubjects(@PathVariable("id") String id){
		return subjectService.getSubject(id);
	}
	
	@PostMapping
	public void addSubject(@RequestBody SubjectEntity subject) {
		subjectService.addSubject(subject);
	}
	
	@PutMapping("/{id}")
	public void updateSubject(@PathVariable("id") String id, @RequestBody SubjectEntity subject) {
		subjectService.updateSubject(id,subject);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSubject(@PathVariable("id") String id) {
		subjectService.deleteSubject(id);
	}
}
