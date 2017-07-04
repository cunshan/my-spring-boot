package com.example.controller;

import com.example.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by GL on 2017/2/24.
 */
@Controller
@RequestMapping("/")
public class TestController {

  @Resource
  private TestService testService;

  @RequestMapping("/index")
  @ResponseBody
  public String index(String name) throws Exception {
    this.testService.insert(name);
    return "111";
  }

  @RequestMapping("/query")
  @ResponseBody
  public String query() throws InterruptedException {
    return "111";
  }


}
