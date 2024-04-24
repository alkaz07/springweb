package alkaz.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.util.Scanner;

@Controller
public class MyController1 {
    @GetMapping("/hello")
    public String greeting()
    {
        return "hello";
    }

    @GetMapping("/sayname")
    public String say(@RequestParam(name="name", required=false)String name, Model model)
    {
        System.out.println("получен параметр "+name);
        model.asMap().put("name", name);
        int age = (int) (Math.random()*99)+1;
        model.asMap().put("age", age);
        return "sayname";
    }
    @GetMapping("/readfile")
    public String readfile(@RequestParam(name="fname") String fname, Model model){
        model.asMap().put("fname", fname);
        try {
            fname = "src//main//resources//files//"+fname;
            Scanner scanner = new Scanner(new File(fname));
            String s = scanner.nextLine();
            scanner.close();
            model.addAttribute("first_line", s);
        }
        catch (Exception e){
            model.addAttribute("error", e.getMessage());
        }
        return "readfile";
    }

}
