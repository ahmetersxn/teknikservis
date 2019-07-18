package com.ahmetersin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class index {

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "develop";
    }

    @RequestMapping(value={"/pcs","/index.html"})
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}
