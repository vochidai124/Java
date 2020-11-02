package com.checongbinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.checongbinh.entity.NhanVien;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
	
	@GetMapping
	public String Default(){
		
		return "chitiet";
	}
	@PostMapping
	public String Dislay(@ModelAttribute NhanVien nv,ModelMap modelMap){
		
		modelMap.addAttribute("nv",nv);
		return "chitiet";
	}
}
