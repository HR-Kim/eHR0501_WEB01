package kr.co.ehr.user.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ehr.user.service.UserService;
import kr.co.ehr.user.service.UserVO;
import kr.co.ehr.user.service.impl.UserServiceImpl;

@Controller
public class UserController {
	public final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("user/get_selectone_view.do")
	public String get_selectOneView() {
		LOG.debug("*****************");
		LOG.debug("*@Controller get_selectOneView*");
		LOG.debug("*****************");
		return "user/user_mng";
	}
	
	//http://localhost:8080/ehr/user/get_selectone.do?name=ehr&age=8&sex=m&tel=010-8888-8888
	@RequestMapping(value="user/get_selectone.do",method = RequestMethod.GET)
	public String get_selectOne(UserVO inVO,Model model) {


		LOG.debug("*****************");
		LOG.debug("*@Controller param*"+inVO);
		LOG.debug("*****************");
		
		model.addAttribute("vo", userService.get_selectOne(inVO)) ;
		
		return "user/user_mng";
	}
	
	//http://localhost:8080/ehr/user/get_selectone.do?name=ehr&age=8&sex=m&tel=010-8888-8888
//	@RequestMapping(value="user/get_selectone.do",method = RequestMethod.GET)
//	public String get_selectOne(HttpServletRequest req,Model model) {
//
//		UserVO inVO=new UserVO(); 
//		inVO.setName(req.getParameter("name"));
//		inVO.setAge(req.getParameter("age"));
//		inVO.setSex(req.getParameter("sex"));
//		inVO.setTel(req.getParameter("tel"));
//		LOG.debug("*****************");
//		LOG.debug("*@Controller param*"+inVO);
//		LOG.debug("*****************");
//		
//		model.addAttribute("vo", userService.get_selectOne(inVO)) ;
//		
//		return "user/user_mng";
//	}
	
}
