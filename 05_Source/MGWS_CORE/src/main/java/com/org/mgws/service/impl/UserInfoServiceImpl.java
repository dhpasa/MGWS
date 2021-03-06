/**
 * 
 */
package com.org.mgws.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.org.mgws.dao.TEnterpriseBasicInfoDao;
import com.org.mgws.dao.TIndividualBasicInfoDao;
import com.org.mgws.dto.UserBasicInfo;
import com.org.mgws.entity.TEnterpriseBasicInfo;
import com.org.mgws.entity.TIndividualBasicInfo;
import com.org.mgws.service.BaseService;
import com.org.mgws.service.UserInfoService;

/**
 * @author x-wang
 *
 */
@Service
public class UserInfoServiceImpl extends BaseService implements UserInfoService {

	@Resource
	TIndividualBasicInfoDao tIndividualBasicInfoDao;
	@Resource
	TEnterpriseBasicInfoDao tEnterpriseBasicInfoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.org.mgws.service.UserInfoService#getBasicInfo(java.lang.String)
	 */
	@Override
	public UserBasicInfo getBasicInfo(String customerNo, String division) {
		UserBasicInfo userBasicInfo = new UserBasicInfo();
		if ("0".equals(division)) {
			TIndividualBasicInfo tIndividualBasicInfo = tIndividualBasicInfoDao.selectByCustomerNo(customerNo);
			userBasicInfo.setCustomerNo(customerNo);
			if (tIndividualBasicInfo != null) {
				userBasicInfo.setId(tIndividualBasicInfo.getNo());
				userBasicInfo.setCnSurName(tIndividualBasicInfo.getCnSurName());
				userBasicInfo.setCnGivenName(tIndividualBasicInfo.getCnGivenName());
				userBasicInfo.setSex(tIndividualBasicInfo.getSex());
			}
		} else {
			TEnterpriseBasicInfo tEnterpriseBasicInfo = tEnterpriseBasicInfoDao.selectByCustomerNo(customerNo);
			userBasicInfo.setCustomerNo(customerNo);
			if (tEnterpriseBasicInfo != null) {
				userBasicInfo.setCnName(tEnterpriseBasicInfo.getCnName());
				userBasicInfo.setId(tEnterpriseBasicInfo.getNo());
			}
		}
		return userBasicInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.org.mgws.service.UserInfoService#updateBasicInfo(com.org.mgws.dto.
	 * UserBasicInfo)
	 */
	@Override
	public void updateBasicInfo(UserBasicInfo userBasicInfo) {
		if ("0".equals(userBasicInfo.getDivision())) {
			TIndividualBasicInfo tmp = tIndividualBasicInfoDao.selectByCustomerNo(userBasicInfo.getCustomerNo());
			TIndividualBasicInfo tIndividualBasicInfo = new TIndividualBasicInfo();
			tIndividualBasicInfo.setNo(userBasicInfo.getId());
			tIndividualBasicInfo.setCustomerNo(userBasicInfo.getCustomerNo());
			tIndividualBasicInfo.setCnSurName(userBasicInfo.getCnSurName());
			tIndividualBasicInfo.setCnGivenName(userBasicInfo.getCnGivenName());
			tIndividualBasicInfo.setSex(userBasicInfo.getSex());

			if (tmp != null) {
				tIndividualBasicInfoDao.updateByPrimaryKeySelective(tIndividualBasicInfo);
			} else {
				tIndividualBasicInfo.setDeleteFlg("0");
				tIndividualBasicInfoDao.insertSelective(tIndividualBasicInfo);
			}
		} else {
			TEnterpriseBasicInfo tEnterpriseBasicInfo = new TEnterpriseBasicInfo();
			tEnterpriseBasicInfo.setCnName(userBasicInfo.getCnName());
			tEnterpriseBasicInfo.setNo(userBasicInfo.getId());
			tEnterpriseBasicInfo.setCustomerNo(userBasicInfo.getCustomerNo());

			TEnterpriseBasicInfo tmp = tEnterpriseBasicInfoDao.selectByCustomerNo(userBasicInfo.getCustomerNo());
			if (tmp != null) {
				tEnterpriseBasicInfoDao.updateByPrimaryKeySelective(tEnterpriseBasicInfo);
			} else {
				tEnterpriseBasicInfo.setDeleteFlg("0");
				tEnterpriseBasicInfoDao.insertSelective(tEnterpriseBasicInfo);
			}

		}
	}

}
