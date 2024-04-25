package alkaz.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MyController3 {
    @GetMapping("/simplelist")
    public String showSimpleList(Model model){
        ArrayList<String> list = new ArrayList<>();
        list.add("первая строка");
        list.add("вторая строка");
        list.add("третья строка");
        model.addAttribute("spisok", list);
        return "simple_list";
    }
}
