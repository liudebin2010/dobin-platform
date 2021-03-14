package com.v51das.dobin.admin.service;

import java.util.List;

import com.v51das.dobin.admin.model.SysConfig;
import com.v51das.dobin.core.service.CurdService;

/**
 * 系统配置管理
 * @author Dobin
 * @date March 14, 2021
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
