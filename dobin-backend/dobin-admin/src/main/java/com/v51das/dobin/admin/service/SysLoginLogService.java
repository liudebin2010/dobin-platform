package com.v51das.dobin.admin.service;

import com.v51das.dobin.admin.model.SysLoginLog;
import com.v51das.dobin.core.service.CurdService;

/**
 * 登录日志
 * @author Dobin
 * @date March 14, 2021
 */
public interface SysLoginLogService extends CurdService<SysLoginLog> {

	/**
	 * 记录登录日志
	 * @param userName
	 * @param ip
	 * @return
	 */
	int writeLoginLog(String userName, String ip);
}
