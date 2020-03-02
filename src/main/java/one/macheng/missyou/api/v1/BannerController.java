package one.macheng.missyou.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BannerController {
    //    @GetMapping("/test")
    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})

    // 如果每个方法都需要ResponseBody 可以提取到类上
    // 如果@Controller 和 @ResponseBody 可以合为 @RestController
    public String test() {
        return "hello 世界1234567";
    }
}
