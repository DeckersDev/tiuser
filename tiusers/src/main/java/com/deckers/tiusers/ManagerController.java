package com.deckers.tiusers;
import com.deckers.tiusers.repositories.ManagerRepository;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.deckers.tiusers.entities.Manager;


@Controller
public class ManagerController  implements WebMvcConfigurer {
private final ManagerRepository managerRepository;

@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		   registry.addViewController("/home").setViewName("home");
	        registry.addViewController("/").setViewName("home");
	        registry.addViewController("/hello").setViewName("hello");
	        registry.addViewController("/login").setViewName("login");
	        registry.addViewController("/manager").setViewName("manager");
	        registry.addViewController("/show").setViewName("show");
	}
	

    @Autowired
	ManagerService managerService;
    Database database;
public ManagerController (ManagerRepository managerRepository) {
	this.managerRepository=managerRepository;
}
@GetMapping("/manager")
public String showaddForm(Manager Manager) {
	return "manager";
}
@PostMapping("/manager")
public String addManager(@Valid Manager manager, BindingResult result, Model model) {
    if (result.hasErrors()) {
//    	jdbcTemplate.execute("UPDATE ManagerS SET FIRST_NAME= 'A'  WHERE ID = 1;" );
        return "manager";
    }
    
    managerRepository.save(manager);
    model.addAttribute("managers", managerRepository.findAll());

    return "home";
}
@GetMapping("/delete/{id}")
public String  deleteManage(@PathVariable("UserID") int UserID, Model model) {
	 database.DeleteManager(UserID);
	return "home";
}
@RequestMapping(value = "show", method = RequestMethod.GET)
public String show(  Model model) {
	model.addAttribute("search", managerRepository.findAll());
	return "show";
}
}
