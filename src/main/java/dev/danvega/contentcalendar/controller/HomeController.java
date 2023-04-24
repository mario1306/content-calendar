package dev.danvega.contentcalendar.controller;

import dev.danvega.contentcalendar.config.ContentCalendarProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }
    

//    @Value("${cc.welcomeMessage: Default Welcome Message}")
//    private String welcomeMessage;
//
//    @GetMapping("/")
//    public String home() {
//    	return welcomeMessage;
//    }
    
    @GetMapping("/")
    public ContentCalendarProperties home() {
        return properties;
    }

}
