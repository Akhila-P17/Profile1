package org.tool.teacher;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TeacSubjectRepository extends CrudRepository<TeacSubjectEntity, String> {

	boolean existsTeacSubjectEntityById(String id);
	
	TeacSubjectEntity findTeacSubjectEntityById(String id);
}
