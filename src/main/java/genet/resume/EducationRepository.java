package genet.resume;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EducationRepository extends CrudRepository<Education, Long> {
	
	List<Education> findById(Long id );
	Education findByUniversity(String university );

}
