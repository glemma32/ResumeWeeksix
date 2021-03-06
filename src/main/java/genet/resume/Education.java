package genet.resume;




import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;


@Entity
public class Education {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eduId;
	
	private String degree;
	private String university;
	private String gradYear;
	private Long id;
	
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
	public String getGradYear() {
		return gradYear;
	}
	public void setGradYear(String gradYear) {
		this.gradYear = gradYear;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
