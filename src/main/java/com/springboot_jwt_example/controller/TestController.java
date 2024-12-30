package com.springboot_jwt_example.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        log.info("method hello() accesed");
        return ResponseEntity.ok("HELLO SAYA FAJAR");
    }

}
