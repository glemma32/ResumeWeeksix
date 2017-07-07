package genet.resume;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
	
	Person findById(Long id);
	List<Person> findByFirstname(String firstname);

}
