package com.ivoronline.springboot_dto_mapstruct.mappers;

import com.ivoronline.springboot_dto_mapstruct.DTO.AuthorBookDTO;
import com.ivoronline.springboot_dto_mapstruct.entities.Author;
import com.ivoronline.springboot_dto_mapstruct.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorBookMapper {

  AuthorBookMapper INSTANCE = Mappers.getMapper(AuthorBookMapper.class);

  @Mapping(source = "authorName", target = "name")  //For additional Properties with different names
  @Mapping(source = "authorAge" , target = "age")   //For additional Properties with different names
  Author mapToAuthor(AuthorBookDTO authorBookDTO);

  Book mapToBook(AuthorBookDTO authorBookDTO);      //It will map Properties with the same name

}
