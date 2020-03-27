package one.macheng.missyou.api.v1;

import one.macheng.missyou.sample.hero.Diana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/banner/")
//用一个通用的method @RequestMapping还可以用作前缀
// 使用http://localhost:8080/v1/banner/test访问,这个就是restFul api 的自描述性
public class BannerController {
    @Autowired
    private Diana diana;

    @GetMapping("/test")
    public String test() {
        diana.q();
        return "hello 世界1234567";
    }
}
