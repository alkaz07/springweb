package alkaz.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController2 {
    //метод, который умеет выводить форму с кнопкой
    @GetMapping("/entername")
    public String entername(){
        return "entername";
    }
    //метод, который умеет выводить форму с кнопкой И обрабатывать запрос на этой кнопке
    @GetMapping("/enterandsay")
    public String enterandsay(@RequestParam (name="name", required = false)String n, Model model){
        model.addAttribute("name", n);
        return "enter_and_say";
    }
}
