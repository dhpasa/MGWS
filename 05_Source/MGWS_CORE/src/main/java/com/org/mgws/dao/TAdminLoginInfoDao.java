package com.org.mgws.dao;

import java.util.List;

import com.org.mgws.entity.TAdminLoginInfo;

public interface TAdminLoginInfoDao {
    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Long no);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    TAdminLoginInfo insert(TAdminLoginInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(TAdminLoginInfo record);

    /**
     * 根据主键查询记录
     */
    TAdminLoginInfo selectByPrimaryKey(Long no);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(TAdminLoginInfo record);

    /**
     * 根据主键更新记录
     */
    TAdminLoginInfo updateByPrimaryKey(TAdminLoginInfo record);
    
    /**
     * 根据AdminNo查询
     */
    TAdminLoginInfo findByAdminNo(String adminNo);
    
    List<TAdminLoginInfo> findAll();
}