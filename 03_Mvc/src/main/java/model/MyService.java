package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MyService {
	public String execute(HttpServletRequest request, HttpServletResponse response);
}