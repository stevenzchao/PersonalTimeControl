package com.example.demo.pageable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.pageable.model.Product;
import com.example.demo.pageable.service.ProductService;

@Controller
@SessionAttributes(names={"totalPages" ,"totalElements"})
public class PageableController {
	
	@Autowired
	private ProductService productService;

	@GetMapping(value="example")
	public String getPage() {
		
		return "Pageable";
	}
	
	@PostMapping(value="examplePageable/{pageNo}")
	@ResponseBody
	public List<Product> getPageable(
			@PathVariable(name="pageNo") Integer pageNo,
			Model m) {
		int pageSize = 4;
		Pageable pageable = PageRequest.of(pageNo-1,pageSize);
		Page<Product> page = productService.findAllByList(pageable);
		m.addAttribute("totalPages",page.getTotalPages());
		m.addAttribute("totalElements",page.getTotalElements());
		return page.getContent();
	}
}
