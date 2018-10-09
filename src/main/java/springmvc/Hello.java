package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Hello 
{
    @RequestMapping("/hello")
    public String hello(Model model)
    {
        model.addAttribute("msg","hello springmvc!");
        return "hello";
    }
}