package site.muzhi.hero.web.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lichuang
 * @date 2022/05/08
 * @description 控制页面跳转
 */
@Controller
public class PageController {

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.setViewName("main");
        return view;
    }
}
