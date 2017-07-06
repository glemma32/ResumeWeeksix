package genet.resume;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import genet.resume.Person;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long skillId;
	
	private String skill;
	private String rating;
	
	@ManyToMany(mappedBy = "skills", fetch = FetchType.LAZY)
	private Set<Person> people;
	
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Set<Person> getPeople() {
		return people;
	}
	public void setPeople(Set<Person> people) {
		this.people = people;
	}
	
	

}
