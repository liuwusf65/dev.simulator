package com.hyron.example.dev.simulator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/login")

  public String index() {
    return "login";
  }
}
