package com.example.React_Crud;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")

public class DemoController {
    
    
    @GetMapping ("/greet")
    public @ResponseBody ResponseEntity<Map<String, Object>> greetings(){
        Map<String, Object> msg = new HashMap<>();
        msg.put("message", "Welcome Manu !! We are trying with OpenID Security using OKTA.");
        return ResponseEntity.ok(msg);
    }

}
