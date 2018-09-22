package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathya.hibernate.dao.BookDAO;
import com.sathya.hibernate.dao.BookDAOFactory;
import com.sathya.hibernate.model.Book;

public class SelectServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read inpur
		String strBookId = request.getParameter("bid");
		//wrap
		int bookId = Integer.parseInt(strBookId);
		
		//read dao object
		BookDAO dao = BookDAOFactory.getInstance();
		Book b = dao.readBook(bookId);
		
		PrintWriter pw = response.getWriter();
		if(b==null){
			pw.println("<h1>Sorry, the given bookId does not exist</h1>");
		}
		
		else{
			pw.println("<h1>");
			pw.println("BookId : "+b.getBookId());
			pw.println("<br>");
			pw.println("BookName : "+b.getBookName());
			pw.println("<br>");
			pw.println("Price : "+b.getPrice());
			pw.println("</h1>");
		}
		
		//close the object
		pw.close();
		
	}//end of doGet()

}//end of class


