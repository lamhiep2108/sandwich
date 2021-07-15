package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sandwich {
    @GetMapping
    public ModelAndView showIndex(){
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }
    @PostMapping
    public String save(@RequestParam("condiment") String []condiment, Model choose,Model show){
        String a="";
        String b="you want to add :";
        for (String i:condiment) {
            a+=i;
        }
        choose.addAttribute("as",a);
        show.addAttribute("ab",b);
        return "index";
    }
}
