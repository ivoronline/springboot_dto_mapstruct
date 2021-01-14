package com.ivoronline.springboot_dto_mapstruct.controllers;

import com.ivoronline.springboot_dto_mapstruct.DTO.AuthorBookDTO;
import com.ivoronline.springboot_dto_mapstruct.entities.Author;
import com.ivoronline.springboot_dto_mapstruct.entities.Book;
import com.ivoronline.springboot_dto_mapstruct.mappers.AuthorBookMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("addAuthorBook")
  public String addAuthorBook(@RequestBody AuthorBookDTO authorBookDTO) {

    //INSTANTIATE MAPPER
    AuthorBookMapper authorBookMapper = AuthorBookMapper.INSTANCE;

    //MAP AUTHORBOOKDTO TO AUTHOR & BOOK.
    Book   book   = authorBookMapper.mapToBook  (authorBookDTO);
    Author author = authorBookMapper.mapToAuthor(authorBookDTO);

    //RETURN SOMETHING
    return author.name + " has written: " + book.title;

  }

}

