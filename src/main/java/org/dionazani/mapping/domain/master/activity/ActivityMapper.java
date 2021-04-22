package org.dionazani.mapping.domain.master.activity;

import org.dionazani.mapping.infrastructures.entity.ActivityEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface ActivityMapper {

	ActivityDto entityToDto(ActivityEntity entity);
	ActivityEntity dtoToEntity(ActivityDto dto);
}
