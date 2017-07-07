package genet.resume;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
	
	List<Job> findById(Long id);
	Job findByCompany(String company);

}
