package com.deploysoft.graphql.infrasctructure.mapper;


import com.deploysoft.graphql.dto.PostDTO;
import com.deploysoft.graphql.infrasctructure.repository.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface IPostMapper extends IMapperGeneric<Post, PostDTO> {

}

