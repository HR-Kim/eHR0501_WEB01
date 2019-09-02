package kr.co.ehr.user.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ehr.cmn.DTO;
import kr.co.ehr.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	public final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Override
	public DTO get_selectOne(DTO dto) {
		LOG.debug("=======================");
		LOG.debug("=@Service get_selectOne="+dto);
		LOG.debug("=======================");
		return userDaoImpl.get_selectOne(dto);
	}

}
