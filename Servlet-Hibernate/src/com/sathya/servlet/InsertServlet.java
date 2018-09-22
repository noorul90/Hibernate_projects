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

public class InsertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read input
		String bookName = request.getParameter("bname");
		String strPrice = request.getParameter("price");
		//wrap
		double price = Double.parseDouble(strPrice);
		
		//create POJO class object
		Book book = new Book();
		book.setBookName(bookName);
		book.setPrice(price);
		
		//read dao object
		BookDAO dao = BookDAOFactory.getInstance();
		
		PrintWriter pw = response.getWriter();
		
		try{
			dao.saveBook(book);
			pw.println("<h1>Book is saved to database<h1>");
		}
		
		catch(Exception e){
			pw.println("<h1>Sorry, A problem is accured to save the book in database<h1>");
		}
		
		pw.close();
		
	}//end of doGet()

}//end of class
