package com.common.model;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by cjw on 2016-02-15.
 * 공통사용
 */
public interface Model {
    public String handlerRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
        throws Exception;
}


