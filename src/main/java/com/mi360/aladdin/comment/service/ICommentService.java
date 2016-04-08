package com.mi360.aladdin.comment.service;

import java.util.List;

import com.mi360.aladdin.comment.domain.Comment;


public interface ICommentService {

	List<Comment> getCommentNoDeletedList(int productID,int pageIndex,int pageSize,String requestID);
	Comment getCommentDetail(int orderProdID,String requestID);
	int comment(Comment comment,String requestID);
	int getCountNoDeletedByProductID(int productID,String requestID);
	
}
