package com.v51das.dobin.admin.service;

import java.util.List;

import com.v51das.dobin.admin.model.SysDept;
import com.v51das.dobin.core.service.CurdService;

/**
 * 机构管理
 * @author Dobin
 * @date March 14, 2021
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @return
	 */
	List<SysDept> findTree();
}
