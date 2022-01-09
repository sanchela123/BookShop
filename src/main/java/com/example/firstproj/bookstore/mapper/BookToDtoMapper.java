package com.example.firstproj.bookstore.mapper;

import com.example.firstproj.bookstore.model.Book;
import com.example.firstproj.bookstore.model.BookRequest;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
    Book EditBookRequestToBook(Long id, BookRequest bookRequest);
}
