package test.com.mysite.sh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController{
    @GetMapping("/sh")
    @ResponseBody
    public void index(){
        System.out.println("index");
    }
}
