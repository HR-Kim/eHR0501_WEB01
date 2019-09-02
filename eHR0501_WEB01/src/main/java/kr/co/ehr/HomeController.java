package kr.co.ehr;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
private Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping("main/main.do")
	public String hello(Model model) {
		model.addAttribute("msg", "Hello world.");
		LOG.debug("*********************");
		LOG.debug("*hello*");
		LOG.debug("*********************");
		return "main/main";//return url -->/main/main.jsp
	}

	
	
}
