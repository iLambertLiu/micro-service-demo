package com.icode.controller;

/**
 * @author LiuLin
 * @Created 2019-09-20 10:11
 **/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloController {
   @GetMapping("hello")
   public String hello(){
      return "hello world!";
   }
}
