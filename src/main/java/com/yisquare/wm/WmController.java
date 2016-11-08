package com.yisquare.wm;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yisquare.domain.ErrorMsg;
import com.yisquare.domain.User;
import com.yisquare.service.ErrorMsgService;
import com.yisquare.service.UserService;

@RestController
@RequestMapping("/wm")
public class WmController {
	
	@Autowired
	ErrorMsgService errorMsgService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/error/", method=RequestMethod.POST)
	public void addErrorMsg(@RequestBody List<ErrorMsg> errorMsgs, HttpServletResponse response) {
		User user = new User();
		user.setEnvironment(errorMsgs.get(0).getEnvironment());
		user.setUserName(errorMsgs.get(0).getUserName());
		Long userId = userService.getUserId(user);
		for(ErrorMsg errorMsg : errorMsgs)
			errorMsg.setUserId(userId);
		errorMsgService.batchAdd(errorMsgs);
		response.setStatus(200);
	}
}
