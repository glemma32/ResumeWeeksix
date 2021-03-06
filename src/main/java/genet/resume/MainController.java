package genet.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import genet.resume.Person;
import genet.resume.Education;
import genet.resume.Job;
import genet.resume.Skill;

@Controller
public class MainController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private SkillRepository skillRepository;
	
	@RequestMapping(value="/addinformation", method = RequestMethod.GET)
    public String addInformation(Model model){
        model.addAttribute("person", new Person());
        return "personform";
    }
    @RequestMapping(value="/addinformation", method = RequestMethod.POST)
    public String processInput(@ModelAttribute Person person, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "personform";
        }
        personRepository.save(person);
        return "redirect:/addeducation";
    }
    
    @RequestMapping(value="/addeducation", method = RequestMethod.GET)
    public String addEducation(Model model){
        model.addAttribute("education", new Education());
        return "educationform";
    }
    @RequestMapping(value="/addeducation", method = RequestMethod.POST)
    public String processInput(@ModelAttribute Education education, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
        	
            return "educationform";
        }
   
        educationRepository.save(education);
        return "redirect:/addjob";
    }
    
    @RequestMapping(value="/addjob",method = RequestMethod.GET )
    public String addJob(Model model){
        model.addAttribute("job", new Job());
        return "jobform";
    }
    @RequestMapping(value="/addjob", method = RequestMethod.POST)
    public String processInput(@ModelAttribute Job job, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "jobform";
        }
       jobRepository.save(job);
        return "redirect:/addskill";
    }
    
    @RequestMapping(value="/addskill", method = RequestMethod.GET)
    public String addSkill(Model model){
        model.addAttribute("skill", new Skill());
        return "skillform";
    }
    @RequestMapping(value="/addskill", method = RequestMethod.POST)
    public String processInput(@ModelAttribute Skill skill, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "skillform";
        }
        skillRepository.save(skill);
        return "redirect:/display";
    }
    
    /*@RequestMapping(value="/display", method = RequestMethod.POST)
    public String displayResume(Model model){
        model.addAttribute("Person", personRepository.findAll());
        return "displayform";
    }*/
    
    @RequestMapping(value="/display/{id}" , method = RequestMethod.GET)
	public String displayResume(@PathVariable("id") Long id, Model resumeModel){
		
    	Person per = personRepository.findById(id);
    	Iterable<Education> edu = educationRepository.findById(id);
    	Iterable<Job> j = jobRepository.findById(id);
    	Iterable<Skill> skil = skillRepository.findById(id);
    	resumeModel.addAttribute("per", per);
        resumeModel.addAttribute("edu", edu);
        resumeModel.addAttribute("j", j);
        resumeModel.addAttribute("skil", skil);
        return "displayform";
    	
	}
    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchPeople(Model model){
        model.addAttribute(new Person());
        return "searchform";
    }
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String SearchPostName(@ModelAttribute Person person, Model model,String firstname){
       
        Iterable<Person> people= personRepository.findByFirstname(firstname);
        model.addAttribute("people", people);
        return "resultform";
    }
    

}
