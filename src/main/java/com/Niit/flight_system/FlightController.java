package com.Niit.flight_system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;

@Controller
// NOTE : Use @Controller for UI, not @RestController
public class FlightController {

    @GetMapping("/")
    public String getFlights(Model model) {

        // Mock data to simulate our Flight System
        model.addAttribute("username", "Instructor wisdom");

        model.addAttribute("systemStatus", "Operational");

        List<String> flights = Arrays.asList(
                "NIIT-001 (LAGOS)",
                "NIIT-002 (DUBAI)",
                "NIIT-003 (LONDON)"
        );

        model.addAttribute("activeFlights", flights);

        return "index"; // This will render the index.html template
    }
}