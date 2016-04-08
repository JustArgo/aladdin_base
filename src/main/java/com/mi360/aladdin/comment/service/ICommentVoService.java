package com.mi360.aladdin.comment.service;

import com.mi360.aladdin.comment.vo.CommentVo;

public interface ICommentVoService {

	//根据评论id获得 评论的封装对象
	CommentVo getCommentVo(Integer commentID, String requestID);
	
}
