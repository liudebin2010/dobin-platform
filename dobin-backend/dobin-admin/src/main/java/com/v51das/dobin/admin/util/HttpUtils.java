package com.v51das.dobin.admin.util;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.alibaba.fastjson.JSONObject;
import com.v51das.dobin.core.http.HttpResult;

/**
 * HTTP工具类
 * @author Dobin
 * @date March 14, 2021
 */
public class HttpUtils {

	/**
	 * 获取HttpServletRequest对象
	 * @return
	 */
	public static HttpServletRequest getHttpServletRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	/**
	 * 输出信息到浏览器
	 * @param response
	 * @param msg
	 * @throws IOException
	 */
	public static void print(HttpServletResponse response, int code, String msg) throws IOException {
		response.setContentType("application/json; charset=utf-8");
        HttpResult result = HttpResult.error(code, msg);
        String json = JSONObject.toJSONString(result);
        response.getWriter().print(json);
        response.getWriter().flush();
        response.getWriter().close();
	}
	
}
