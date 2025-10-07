package edu.illinois.library.cantaloupe.resource;

import edu.illinois.library.cantaloupe.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.*;

/*
 * Controller for the main (index) page.
 */
@Controller
public class MainController {
    @GetMapping("/")
  	public String index(ModelMap model) {
      model.addAttribute("version", Application.getVersion());
  		return "index";
  	}

}
