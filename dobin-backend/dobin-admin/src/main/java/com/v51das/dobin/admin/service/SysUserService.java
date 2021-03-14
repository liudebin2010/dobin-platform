package com.v51das.dobin.admin.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import com.v51das.dobin.admin.model.SysUser;
import com.v51das.dobin.admin.model.SysUserRole;
import com.v51das.dobin.core.page.PageRequest;
import com.v51das.dobin.core.service.CurdService;

/**
 * 用户管理
 * @author Dobin
 * @date March 14, 2021
 */
public interface SysUserService extends CurdService<SysUser> {

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userId
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

	/**
	 * 生成用户信息Excel文件
	 * @param pageRequest 要导出的分页查询参数
	 * @return
	 */
	File createUserExcelFile(PageRequest pageRequest);

}