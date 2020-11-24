package com.laptrinhjavaweb.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.dto.NewsDTO;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.INewService;

@Controller(value = "newControllerOfAdmin")
public class NewController {
	
	@Autowired
	private INewService newService;
	
	@Autowired
	private ICategoryService categoryService;

	@RequestMapping(value = "/quan-tri/bai-viet/danh-sach", method = RequestMethod.GET)
	public ModelAndView showList(@RequestParam("page") int page,
								@RequestParam("limit") int limit) {
		ModelAndView mav = new ModelAndView("admin/new/list");
		NewsDTO newsDTO = new NewsDTO();
		newsDTO.setPage(page);
		newsDTO.setLimit(limit);
		Pageable pageable = new PageRequest(page-1,limit); 
		newsDTO.setListResult(newService.findAll(pageable));
		newsDTO.setTotalItem(newService.getTotalItem());
		newsDTO.setTotalPage((int) Math.ceil((double) newsDTO.getTotalItem() / newsDTO.getLimit()));
		//newsDTO.setListResult(newService.findAll());
		mav.addObject("model", newsDTO);
		return mav;
	}
	
	@RequestMapping(value = "/quan-tri/bai-viet/chinh-sua", method = RequestMethod.GET)
	public ModelAndView editNew(@RequestParam(value = "id", required = false) Long id) {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		if(id != null) {
			NewsDTO newsDTO = newService.findById(id);
			List<CategoryDTO> categories = categoryService.findAll();
			mav.addObject("model",newsDTO);
			mav.addObject("categories",categories);
		}
		return mav;
	}
}
