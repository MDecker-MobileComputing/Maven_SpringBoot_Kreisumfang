package de.eldecker.dhbw.spring.kreisumfang.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Controller für Thymeleaf-Templates.
 */
@Controller
public class ThymeleafWebController {

    @GetMapping("/pfad/{radius}")
    public String methode( @PathVariable double radius,
                           Model model ) {

    	final double umfang = 2 * radius * Math.PI;

    	model.addAttribute( "umfang", umfang );

    	return "ergebnis";
    }

}
