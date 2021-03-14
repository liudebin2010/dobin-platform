package com.v51das.dobin.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v51das.dobin.admin.model.SysLoginLog;
import com.v51das.dobin.admin.service.SysLoginLogService;
import com.v51das.dobin.core.http.HttpResult;
import com.v51das.dobin.core.page.PageRequest;

/**
 * 登录日志控制器
 * @author Dobin
 * @date March 14, 2021
 */
@RestController
@RequestMapping("loginlog")
public class SysLoginLogController {

	@Autowired
	private SysLoginLogService sysLoginLogService;

	@PreAuthorize("hasAuthority('sys:loginlog:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysLoginLogService.findPage(pageRequest));
	}
	
	@PreAuthorize("hasAuthority('sys:loginlog:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysLoginLog> records) {
		return HttpResult.ok(sysLoginLogService.delete(records));
	}
}
