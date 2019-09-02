/**
 *<pre>
 * kr.co.ehr.cmn
 * @Class Name : WorkDiv.java
 * @Description : 공통Dao
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
package kr.co.ehr.cmn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sist
 *
 */
public interface WorkDiv {
	public final Logger LOG = LoggerFactory.getLogger(WorkDiv.class);
	
	public int do_update(DTO dto);

	public int do_delete(DTO dto);

	public int do_save(DTO dto);

	public DTO get_selectOne(DTO dto);

	public List<?> get_retrieve(DTO dto);

	public List<?> get_excelDown(DTO dto);

}
