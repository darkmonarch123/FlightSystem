package com.niit.flightsystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller // Note: Use @Controller for UI, not @RestController
public class FlightController {

    @GetMapping("/")
    public String viewDashboard(Model model) {
        // Mock data to simulate our Flight system
        model.addAttribute("username", "Instructor Wisdom");
        model.addAttribute("systemStatus", "Operational");
        
        List<String> flights = Arrays.asList("NIIT-101 (Lagos)", "NIIT-202 (London)", "NIIT-303 (Dubai)");
        model.addAttribute("activeFlights", flights);

        return "index"; // This looks for index.html in the templates folder
    }
}