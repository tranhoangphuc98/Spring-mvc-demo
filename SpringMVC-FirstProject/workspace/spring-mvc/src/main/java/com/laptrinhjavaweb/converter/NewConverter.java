package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.NewsDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.entity.NewEntity;

@Component
public class NewConverter {

	public static NewsDTO toDto(NewEntity newEntity) {
		NewsDTO newsDTO = new NewsDTO();
		newsDTO.setId(newEntity.getId());
		newsDTO.setTitle(newEntity.getTitle());
		newsDTO.setThumbnail(newEntity.getThumbnail());
		newsDTO.setShortDescription(newEntity.getShortDescription());
		newsDTO.setContent(newEntity.getContent());
		newsDTO.setCategoryCode(newEntity.getCategory().getCode());
		return newsDTO; 
	}
	
	public static NewEntity toEntity(NewsDTO newsDTO) {
		NewEntity newsEntity = new NewEntity();
		newsEntity.setTitle(newsDTO.getTitle());
		newsEntity.setThumbnail(newsDTO.getThumbnail());
		newsEntity.setShortDescription(newsDTO.getShortDescription());
		newsEntity.setContent(newsDTO.getContent());
		
		newsEntity.setCategory(new CategoryEntity());
		return newsEntity; 
	}
}