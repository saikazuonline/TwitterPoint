package org.sko.controller;

import java.util.List;

import org.sko.domain.User;
import org.sko.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping
    public String index(Model model) {
        List<User> list = userMapper.selectAll();
        model.addAttribute("users", list);

        return "index";
    }
}
