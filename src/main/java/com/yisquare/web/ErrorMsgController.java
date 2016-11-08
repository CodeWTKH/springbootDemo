package com.yisquare.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yisquare.domain.ErrorMsg;
import com.yisquare.service.ErrorMsgService;

@Controller
@RequestMapping("/errormsg")
public class ErrorMsgController {
	
	@Autowired
	ErrorMsgService errorMsgService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String errorMsg(ModelMap model) {
		List<ErrorMsg> errorMsgs = errorMsgService.getAll();
		model.addAttribute("errorMsgs", errorMsgs);
		return "errorMsg";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String detail(ModelMap model, @PathVariable("id") Long id) {
		ErrorMsg errorMsg = errorMsgService.getOne(id);
		model.addAttribute("errorMsg", errorMsg);
		return "detail";
	}
}
