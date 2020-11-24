package com.laptrinhjavaweb.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.entity.NewEntity;

@Component
public class CategoryConverter {
	
	public static CategoryDTO toDto(CategoryEntity categoryEntity) {
		CategoryDTO result = new CategoryDTO();
		result.setName(categoryEntity.getName());
		result.setCode(categoryEntity.getCode());
		return result;
	}
	
	public static CategoryEntity toEntity(CategoryDTO categoryDto) {
		CategoryEntity result = new CategoryEntity();
		result.setName(categoryDto.getName());
		result.setCode(categoryDto.getCode());
		List<NewEntity> news = new ArrayList<>();
		result.setNews(news);
		return result;
	}
}
