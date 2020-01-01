package com.deploysoft.graphql.infrasctructure.mapper;


import com.deploysoft.graphql.dto.AuthorDTO;
import com.deploysoft.graphql.infrasctructure.repository.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface IAuthorMapper extends IMapperGeneric<Author, AuthorDTO> {

}

