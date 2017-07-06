package genet.resume;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	 @RequestMapping("/")
	    public String index(){
	        return "indexform";
	    }

	    @RequestMapping("/login")
	    public String login(){
	        return "loginform";
	    }
	    
	    
	    @RequestMapping("/logout")
	    public String logOut(){
	        return "indexform";
	    }
	    
	   @RequestMapping("/loginerror")
	    public String loginError(Model model) {
	        model.addAttribute("loginError", true);
	        return "loginform";
	        }


}
