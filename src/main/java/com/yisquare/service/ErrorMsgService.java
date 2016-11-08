package com.yisquare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yisquare.domain.ErrorMsg;
import com.yisquare.mapper.ErrorMsgMapper;

@Service
public class ErrorMsgService {
	
	@Autowired
	ErrorMsgMapper errorMsgMapper;
	
	public Integer batchAdd(List<ErrorMsg> errorMsgs) {
		try {
			return errorMsgMapper.batchAddMsg(errorMsgs);
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<ErrorMsg> getAll() {
		try {
			return errorMsgMapper.getAllErrorMsg();
		} catch (Exception e) {
			return null;
		}
	}
	
	public ErrorMsg getOne(Long id) {
		try {
			return errorMsgMapper.getErrorMsgById(id);
		} catch (Exception e) {
			return null;
		}
	}
	
}
