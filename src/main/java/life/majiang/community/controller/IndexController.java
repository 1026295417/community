package life.majiang.community.controller;
import life.majiang.community.mapper.UserMapper;
import life.majiang.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

//@controller
//public class helloController {
//     @GetMapping("/hello")
//     public String hello(@RequestParam(name = "name") String name, Model model) {
//          model.addAttribute("name", name);
//          return "hello";
//     }
//}
@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        //System.out.println("hi");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if(user != null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }
        return "index";
    }
}
