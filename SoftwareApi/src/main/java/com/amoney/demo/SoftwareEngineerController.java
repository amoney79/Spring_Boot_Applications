package com.amoney.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        // Logic to retrieve all software engineers
        return List.of(
            new SoftwareEngineer(
                1, 
                "John Doe", 
                "Js, node, react,tailwindcss"
            ),
            new SoftwareEngineer(
                 2, 
                "Jane Smith",
                 "java, spring,spring boot,tailwindcss"
                )
        );
            
    }
    
}
