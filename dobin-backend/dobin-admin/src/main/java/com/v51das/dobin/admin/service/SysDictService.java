package com.v51das.dobin.admin.service;

import java.util.List;

import com.v51das.dobin.admin.model.SysDict;
import com.v51das.dobin.core.service.CurdService;

/**
 * 字典管理
 * @author Dobin
 * @date March 14, 2021
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
