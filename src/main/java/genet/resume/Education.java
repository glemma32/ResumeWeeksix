package genet.resume;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import genet.resume.Person;

@Entity
public class Education {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eduId;
	
	private String degree;
	private String university;
	private LocalDateTime gradYear;
	private Long id;
	
	@ManyToMany(mappedBy = "educations", fetch = FetchType.LAZY)
	private Set<Person> people;
	
	public Long getEduId() {
		return eduId;
	}
	public void setEduId(Long eduId) {
		this.eduId = eduId;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public LocalDateTime getGradYear() {
		return gradYear;
	}
	public void setGradYear(LocalDateTime gradYear) {
		this.gradYear = gradYear;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Person> getPeople() {
		return people;
	}
	public void setPeople(Set<Person> people) {
		this.people = people;
	}
	

}
