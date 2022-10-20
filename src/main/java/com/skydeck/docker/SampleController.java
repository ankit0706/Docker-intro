package com.skydeck.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * A sample controller for Restful service which will simply return a Hello World message
 * @author ankit
 *
 */

@RestController
public class SampleController {
    
    @RequestMapping("/user")
    public String ping(@RequestParam String name) {
        return "hello " + name;
    }
}
