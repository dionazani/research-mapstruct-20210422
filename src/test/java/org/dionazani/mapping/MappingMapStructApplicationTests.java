package org.dionazani.mapping;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.dionazani.mapping.domain.master.activity.ActivityDto;
import org.dionazani.mapping.domain.master.activity.ActivityService;
import org.dionazani.mapping.infrastructures.entity.ActivityEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MappingMapStructApplicationTests {

	@Autowired
	private ActivityService activityService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void shouldDisplayEntity() throws Exception {
		
		// let's create DTO.
		ActivityDto dto = new ActivityDto();
		dto.setId(1);
		dto.setActivityName("My Adventure");
		dto.setDestination("Rinjani Entity");
		
		try {
			ActivityEntity entity = activityService.addNewToEntity(dto);
			assertEquals(dto.getActivityName(), entity.getActivityName());
		}
		catch(Exception ex) {
			assertThat(ex)
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(ex.getMessage());
		}
	}
	
	@Test
	public void shouldDisplayDto() throws Exception {
		
		// let's create DTO.
		ActivityEntity entity = new ActivityEntity();
		entity.setId(1);
		entity.setActivityName("My Journey");
		entity.setDestination("Rinjani Dto");
		
		try {
			ActivityDto dto = activityService.addNewToDto(entity);
			assertEquals(dto.getActivityName(), entity.getActivityName());
		}
		catch(Exception ex) {
			assertThat(ex)
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(ex.getMessage());
		}
	}
	
	@Test
	public void shouldShowNullBoolean() {
		
		try {
			Boolean result = this.activityService.checkBoolean(null);
			Boolean expected = false;
			assertEquals(expected, result);
		}
		catch(Exception ex) {
			assertThat(ex)
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(ex.getMessage());
		}
	}
}
