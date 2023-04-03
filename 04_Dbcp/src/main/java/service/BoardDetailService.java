package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import repository.BoardDAO;

public class BoardDetailService implements IBoardService {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		// BoardAddService에 있는 BoardDAO dao = BoardDAO.getInstance()와 아예 똑같다.
		BoardDAO dao = BoardDAO.getInstance();
		
		return null;
	}

}