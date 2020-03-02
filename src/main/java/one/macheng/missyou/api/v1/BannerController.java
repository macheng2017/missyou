package one.macheng.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BannerController {
    @GetMapping("/test")
    @ResponseBody
    // 直接使用这个注解可以直接使用return返回字符串的方式,写入到response当中
    // 并且解决了字符串编码问题,真方便
    public String test() {
        return "hello 世界";
    }// hello ??
}
