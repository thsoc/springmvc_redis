package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloTwo")
public class HelloTwo {
	@RequestMapping("/hello")
    public String hello(Model model)
    {
        model.addAttribute("msg","hello springmvcTwo!");
        return "hello";
    }
}
