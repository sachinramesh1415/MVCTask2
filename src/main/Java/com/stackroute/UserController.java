package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class UserController {
    private User user;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView setForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        user = new User();
        return new ModelAndView("form","user",user);
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ModelAndView submitForm(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user1) throws Exception {
        user.setName(user1.getName());
        user.setPassword(user1.getPassword());
        return new ModelAndView("index","user",user);
    }
}
