package com.sathya.hibernate.dao;

import com.sathya.hibernate.model.Book;

public interface BookDAO {
	
	void saveBook(Book b);
	Book readBook(int bookId);

}
