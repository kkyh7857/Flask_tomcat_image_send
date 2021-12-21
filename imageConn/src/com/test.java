package com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("전송확인....");
		int maxSize = 100 * 1024 * 1024;
		String save_path = getServletContext().getRealPath("upload");

		MultipartRequest multi = new MultipartRequest(request, save_path, maxSize, "utf-8",
				new DefaultFileRenamePolicy());
		
		
	}
}