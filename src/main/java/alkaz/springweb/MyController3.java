package alkaz.springweb;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class MyController3 {
    @GetMapping("/simplelist")//цепляет функцию к адресу страницы на сайте
    //метод возвращает шаблон и принимает на вход 2 параметра из запроса
    public String showSimpleList(Model model){
        ArrayList<String> list = new ArrayList<>();
        list.add("первая строка");
        list.add("вторая строка");
        list.add("третья строка");
        model.addAttribute("spisok", list);
        return "simple_list";
    }
}
