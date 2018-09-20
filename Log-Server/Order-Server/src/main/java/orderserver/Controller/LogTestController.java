package orderserver.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by Administrator on 2018/9/20.
 */
@RestController
public class LogTestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogTestController.class);
    @RequestMapping("/logtest")
    public  void  logToConsole(){
        LOGGER.debug("logback的--debug日志--输出了");
        LOGGER.info("logback的--info日志--输出了");
        LOGGER.warn("logback的--warn日志--输出了");
        LOGGER.error("logback的--error日志--输出了");
    }
}
