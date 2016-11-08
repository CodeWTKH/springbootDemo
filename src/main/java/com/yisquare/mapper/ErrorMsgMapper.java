package com.yisquare.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yisquare.domain.ErrorMsg;

@Mapper
public interface ErrorMsgMapper {
	
	@Select("select * from ERROR_MSG")
	public List<ErrorMsg> getAllErrorMsg();
	
	@Select("select * from ERROR_MSG where MSGID = #{id}")
	public ErrorMsg getErrorMsgById(@Param("id") Long id);
	
	@Insert("<script> insert into ERROR_MSG(USERID, AUDITTIMESTAMP, TIMESTAMP, ERRORMESSAGE, ERRSTACKTRACE, SERVICENAME, SERVICESTACK) values <foreach collection=\"list\" item=\"item\" index=\"index\" separator=\",\"> (#{item.userId}, #{item.auditTimestamp}, #{item.timestamp}, #{item.errorMessages}, #{item.errStackTrace}, #{item.serviceName}, #{item.serviceStacks}) </foreach> </script>")
	public int batchAddMsg(List<ErrorMsg> errorMsgs);
}
