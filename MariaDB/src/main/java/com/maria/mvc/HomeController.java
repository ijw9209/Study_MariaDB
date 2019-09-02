package com.maria.mvc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maria.mvc.model.biz.BoardBiz;
@Controller
public class HomeController {
	
	@Autowired
	private BoardBiz biz;
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String selectList(Model model) {
		
		model.addAttribute("list", biz.selectList());
		
		return "boardlist";
	}
	
}
