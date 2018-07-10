package org.sko.controller;

import javax.validation.Valid;

import org.sko.form.TweetForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TweetController {

    @RequestMapping("/tweet")
    public String twitter(Model model, @Valid TweetForm tweetForm) {

        return "tweet/index";
    }
}
