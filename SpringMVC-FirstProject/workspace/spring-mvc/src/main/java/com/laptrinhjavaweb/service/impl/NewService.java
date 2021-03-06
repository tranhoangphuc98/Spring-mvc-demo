package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.NewConverter;
import com.laptrinhjavaweb.dto.NewsDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
	
	@Override
	public List<NewsDTO> findAll(Pageable pageable) {
		List<NewsDTO> newsDTOs= new ArrayList<NewsDTO>();
		List<NewEntity> newsEntitys = newRepository.findAll(pageable).getContent();
		for(NewEntity newEntity : newsEntitys) {
			NewsDTO newsDTO = NewConverter.toDto(newEntity);
			newsDTOs.add(newsDTO);
		}
		return newsDTOs;
	}

	@Override
	public int getTotalItem() {
		return (int) newRepository.count();
	}

	@Override
	public NewsDTO findById(long id) {
		return NewConverter.toDto(newRepository.findOne(id));
	}
}
