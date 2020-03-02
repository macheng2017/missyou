package one.macheng.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BannerController {
    @GetMapping("/test")
    public void test(HttpServletResponse resp) throws IOException {
        resp.getWriter().write("hello 世界");

    }// hello ??
}
