/**
 *
 */
package com.z.gateway.web;

import com.z.gateway.handler.OpenApiAcceptHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 */
@Controller
public class GateWayController {
    @Autowired
    private OpenApiAcceptHandler acceptHandler;
    private static final Logger logger = LoggerFactory.getLogger(GateWayController.class);

    /***
     * 通用外部接口入口
     * @param request
     * @param response
     */
    @RequestMapping(value = "index", method = {RequestMethod.POST, RequestMethod.GET})
    public void service(HttpServletRequest request, HttpServletResponse response) {
        logger.info("begin.................................................");
        this.acceptHandler.acceptRequest(request, response);
        logger.info("end.................................................");
    }

    //这个供内部使用
    @RequestMapping(value = "getToken", method = {RequestMethod.POST, RequestMethod.GET})
    public void getToken(HttpServletRequest request, HttpServletResponse response) {
        this.acceptHandler.acceptRequest(request, response);
    }

    //这个供内部使用
    @RequestMapping(value = "indexInner", method = {RequestMethod.POST, RequestMethod.GET})
    public void serviceInner(HttpServletRequest request, HttpServletResponse response) {
        this.acceptHandler.acceptRequest(request, response);
    }
}
