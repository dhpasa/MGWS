package com.org.mgws.dao.impl;

import org.springframework.stereotype.Repository;

import com.org.mgws.base.dao.BaseDao;
import com.org.mgws.dao.TIndividualBasicInfoDao;
import com.org.mgws.entity.TIndividualBasicInfo;

@Repository
public class TIndividualBasicInfoDaoImpl extends BaseDao implements TIndividualBasicInfoDao {

    public int deleteByPrimaryKey(Long no) {
        return update("com.org.mgws.dao.TIndividualBasicInfoDao.deleteByPrimaryKey", no);
    }

    public int insert(TIndividualBasicInfo record) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int insertSelective(TIndividualBasicInfo record) {
        return insert("com.org.mgws.dao.TIndividualBasicInfoDao.insertSelective", record);
    }

    public TIndividualBasicInfo selectByPrimaryKey(Long no) {
        // TODO Auto-generated method stub
        return null;
    }

    public int updateByPrimaryKeySelective(TIndividualBasicInfo record) {
        return update("com.org.mgws.dao.TIndividualBasicInfoDao.updateByPrimaryKeySelective", record);
    }

    public int updateByPrimaryKey(TIndividualBasicInfo record) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public TIndividualBasicInfo selectBaseInfoByCustomerNo(String customerNo) {
        return selectOne("com.org.mgws.dao.TIndividualBasicInfoDao.selectIndividualBasicInfoByCustomerNo", customerNo);
    }

}
