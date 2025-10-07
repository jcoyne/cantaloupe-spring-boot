package edu.illinois.library.cantaloupe.resource.iiif.v3;

import edu.illinois.library.cantaloupe.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/*
 * Controller for the main (index) page.
 */
@Controller("iiifV3LandingController")
@RequestMapping("/iiif/3")
public class LandingController {
    @GetMapping("/")
  	public String index(ModelMap model) {
      	model.addAttribute("version", Application.getVersion());
  		return "iiif_v3/index";
  	}

}
