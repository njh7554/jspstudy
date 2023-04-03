package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import repository.BoardDAO;

public class BoardAddService implements IBoardService {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		/*
		
		BoardDAO의 getInstance()호출하기
		
		메소드 호출
		
		객체로 호출하기 <- 이방법은 못 씀
		객체.메소드()
		
		클래스로 호출하기
		클래스.메소드()
		
		*/
		
		BoardDAO dao =  BoardDAO.getInstance();
		
		return null;
	}

}