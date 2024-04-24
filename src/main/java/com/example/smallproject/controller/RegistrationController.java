package com.example.smallproject.controller;


import com.example.smallproject.UserRegistration;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @RequestMapping("/regform")
    public String register(){
        return "Registration";
    }

    @RequestMapping("/userDetails")
    public ModelAndView userInfo(UserRegistration userObj){
        ModelMap map = new ModelMap();
        map.addAttribute("name",userObj.getUName());
        map.addAttribute("email",userObj.getEmail());
        map.addAttribute("gender",userObj.getGender() == Integer.parseInt("1") ? "Male" : "Female");
        map.addAttribute("hobbies",userObj.getHobby());
        ModelAndView mv = new ModelAndView("User-details");
        mv.addObject("user", map);
        return mv;
    }

    @RequestMapping("/operations")
    public String operation(){
        return "OperationForm";
    }

}
