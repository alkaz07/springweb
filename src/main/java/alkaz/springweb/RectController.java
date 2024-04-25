package alkaz.springweb;

import alkaz.springweb.entities.Rectangle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class RectController {

    @GetMapping("/rect")//цепляет функцию к адресу страницы на сайте
    //метод возвращает шаблон и принимает на вход 2 параметра из запроса
    public String sum(@RequestParam(name = "a", defaultValue = "0") String a,
                      @RequestParam(name = "b", defaultValue = "0") String b,
                      Model model/*дополнительный парметр - словарь для испоьзования в шаблоне*/) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            Rectangle rectangle = new Rectangle(x, y);

            model.addAttribute("perimeter", rectangle.getPerim());
            model.addAttribute("area", rectangle.getArea());
        } catch (NumberFormatException e) {
            model.addAttribute("errorMsg", "это было не число");
        } catch (Exception e) {
            model.addAttribute("errorMsg", "не удалось создать прямоугольник");
        }
        return "rect";
    }
}
