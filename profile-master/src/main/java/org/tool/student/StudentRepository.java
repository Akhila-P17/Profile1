package org.tool.student;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;






@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
	
	boolean existsStudentEntityByEmail(String email);
	String findByName(String name);

}
