package org.dionazani.mapping.domain.master.activity;

import org.dionazani.mapping.infrastructures.entity.ActivityEntity;
import org.springframework.stereotype.Service;

@Service
public interface ActivityService {

	public ActivityEntity addNewToEntity(ActivityDto activityDto);
	public ActivityDto addNewToDto(ActivityEntity activityEntity);
	public Boolean checkBoolean(Boolean b);
}
