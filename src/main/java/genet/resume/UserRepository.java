package genet.resume;

import org.springframework.data.repository.CrudRepository;

import genet.resume.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUsername(String username);

}
