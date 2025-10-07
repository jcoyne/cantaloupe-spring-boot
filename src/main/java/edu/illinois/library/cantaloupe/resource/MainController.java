package edu.illinois.library.cantaloupe.resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Main Spring Controller that handles all requests, replacing the HandlerServlet.
 * This controller uses the existing Route and AbstractResource system to maintain
 * compatibility with the current Cantaloupe architecture.
 */
@RestController
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
  	public String index() {
  		return "Pool";
  	}

}
