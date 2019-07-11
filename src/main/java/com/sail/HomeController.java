package com.sail;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhangjiawei
 * @date 2019/6/17 9:46
 */
@Controller
//@RequestMapping("/test" )
//@RestController
//@RequestMapping({"/","/homepage"})
public class HomeController {
    //log 级别  debug> info > warn > error> fatal
    private static final Logger logger = LogManager.getLogger(HomeController.class.getName());

    /**
     * 处理"/"对应的get请求
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    @ResponseBody //添加此注解，不再跳转home.jsp页面
    public String home() {
        /**
         * 视图名为home
         */
//        logger.debug("debug，日志记录");
        logger.info("info，日志记录");
//        logger.error("error，日志记录");
//        return "/WEB-INF/templates/home.html"; //在dispatcherServlet中配置视图解析器（InternalResourceViewResolver）
        return "home";
    }
}
