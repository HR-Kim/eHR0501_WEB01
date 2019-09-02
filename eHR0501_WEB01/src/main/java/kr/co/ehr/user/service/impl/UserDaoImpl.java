/**
 *<pre>
 * kr.co.ehr.user.service.impl
 * @Class Name : UserDaoImpl.java
 * @Description : 
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2019-09-02           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2019-09-02 
 * @version 1.0
 * @see
 *
 *  Copyright (C) by H.R. KIM All right reserved.
 * </pre>
 */
package kr.co.ehr.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ehr.cmn.DTO;
import kr.co.ehr.cmn.WorkDiv;
import kr.co.ehr.user.service.UserVO;

/**
 * @author sist
 *
 */
@Repository
public class UserDaoImpl implements WorkDiv {

	@Override
	public int do_update(DTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int do_delete(DTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int do_save(DTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DTO get_selectOne(DTO dto) {
		UserVO outVO=new UserVO();
		outVO.setName("SpringMVC");
		outVO.setAge("8");
		outVO.setSex("M");
		outVO.setTel("010-1234-8888");
		LOG.debug("==========================");
		LOG.debug("=@Repository="+outVO);
		LOG.debug("==========================");
		return outVO;
	}

	@Override
	public List<?> get_retrieve(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> get_excelDown(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
