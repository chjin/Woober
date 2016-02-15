package com.main.model;

import com.common.model.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cjw on 2016-02-15.
 */
public class IndexModel implements Model {
    @Override
    public String handlerRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String strPage=httpServletRequest.getParameter("page");
        if(strPage==null){
            strPage="1";
        }

        Map map=new HashMap();


        return null;
    }
}






















