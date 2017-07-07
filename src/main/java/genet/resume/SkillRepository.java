package genet.resume;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Long> {
	
	Skill findBySkillset(String skillset);
	List<Skill> findById(Long id);
	

}
