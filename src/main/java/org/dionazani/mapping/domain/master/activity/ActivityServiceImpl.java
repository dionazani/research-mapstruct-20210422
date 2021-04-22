package org.dionazani.mapping.domain.master.activity;

import java.util.Optional;

import org.dionazani.mapping.infrastructures.entity.ActivityEntity;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class ActivityServiceImpl implements ActivityService {

	@Override
	public ActivityEntity addNewToEntity(ActivityDto activityDto) {
		
		ActivityMapper activityMapper = Mappers.getMapper(ActivityMapper.class);
		return activityMapper.dtoToEntity(activityDto);
	}

	@Override
	public ActivityDto addNewToDto(ActivityEntity activityEntity) {
		
		ActivityMapper activityMapper = Mappers.getMapper(ActivityMapper.class);
		return activityMapper.entityToDto(activityEntity);
	}

	@Override
	public Boolean checkBoolean(Boolean b) {
		
		return Optional.ofNullable(b).orElse(false);
	}

}
