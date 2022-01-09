package com.example.firstproj.bookstore.mapper;

import com.example.firstproj.bookstore.dao.BookEntity;
import com.example.firstproj.bookstore.model.Book;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
