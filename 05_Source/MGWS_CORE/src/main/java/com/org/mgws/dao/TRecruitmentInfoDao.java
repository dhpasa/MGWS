package com.org.mgws.dao;

import java.util.List;
import java.util.Map;

import com.org.mgws.base.page.Pagination;
import com.org.mgws.base.page.PagingResult;
import com.org.mgws.entity.TRecruitmentInfo;

public interface TRecruitmentInfoDao {
	/**
	 * 根据主键删除记录
	 */
	int deleteByPrimaryKey(TRecruitmentInfo record);

	/**
	 * 保存记录,不管记录里面的属性是否为空
	 */
	int insert(TRecruitmentInfo record);

	/**
	 * 根据主键查询记录
	 */
	TRecruitmentInfo selectByPrimaryKey(Long no);

	/**
	 * 根据主键更新记录
	 */
	int updateByPrimaryKey(TRecruitmentInfo record);

	/**
	 * 获取所有的招聘信息
	 */
	List<TRecruitmentInfo> getAllTRecruitmentInfo();

	List<TRecruitmentInfo> getAllTRecruitmentInfoForPre();

	PagingResult<Map<String, Object>> queryByPage(Pagination page);

}