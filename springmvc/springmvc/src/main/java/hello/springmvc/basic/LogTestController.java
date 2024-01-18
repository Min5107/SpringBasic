package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("log-test")
    public String logTest(){
        String name = "Spring";
        System.out.println("LogTestController.logTest : " + name);
        // 기본적으로 출력하지 않음 (debug 같은경우 디버그 할때만 출력)
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        // 기본적으로 전부 출력
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);
        return "ok";
    }
}
