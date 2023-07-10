package com.redhat.demo.springbootjavaquickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World - Spring boot demo on OpenShift";
    }
}
