package com.v51das.dobin.admin.service;

import java.util.List;

import com.v51das.dobin.admin.model.SysMenu;
import com.v51das.dobin.admin.model.SysRole;
import com.v51das.dobin.admin.model.SysRoleMenu;
import com.v51das.dobin.core.service.CurdService;

/**
 * 角色管理
 * @author Dobin
 * @date March 14, 2021
 */
public interface SysRoleService extends CurdService<SysRole> {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);

	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);

	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	List<SysRole> findByName(String name);

}
