package edu.illinois.library.cantaloupe.resource.iiif.v2;

import edu.illinois.library.cantaloupe.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/*
 * Controller for the main (index) page.
 */
@Controller("iiifV2LandingController")
@RequestMapping("/iiif/2")
public class LandingController {
    @GetMapping("/")
  	public String index(ModelMap model) {
      	model.addAttribute("version", Application.getVersion());
  		return "iiif_v2/index";
  	}

}
