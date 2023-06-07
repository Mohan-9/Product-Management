package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.entity.Product;
import com.product.model.ProductModel;
import com.product.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService prodService;

	@RequestMapping("/")
	public String home(Model model) {
		ProductModel pro = new ProductModel();
		model.addAttribute("pros", pro);

		return "prodform";
	}

	@RequestMapping("/save")
	public String save(@ModelAttribute Product product,

			Product pro, Model model) {
			
		Product prod = prodService.saveProduct(product);
		return "success";
	}

	@RequestMapping("/viewpros")
	public String viewAllUsers(Model model) {
		model.addAttribute("products",prodService.getAll());
		
		return "proview";
	}

	@RequestMapping("/edit/{cid}")
	public String editUser(@PathVariable int cid, Model model) {

		Product pros = prodService.updateProduct(cid);
		model.addAttribute("command", pros);
		return "editprod";

	}
//
//	@RequestMapping(value = "/editu", method = RequestMethod.POST)
//	public String editsave(@RequestParam int cid, @RequestParam String cname, @RequestParam String mobile,
//			@RequestParam String pname, @RequestParam double price, @RequestParam int quantity,
//
//			Product pro, Model model) {
//		pro.setCid(cid);
//		pro.setCname(cname);
//		pro.setMobile(mobile);
//		pro.setPname(pname);
//		pro.setPrice(price);
//		pro.setQuantity(quantity);
//
//		proRepo.save(pro);
//		return "editsuccess";
//	}
//
	@RequestMapping("/delete/{cid}")
	public String deleteUser(@PathVariable int cid) {
		 prodService.deleteProduct(cid);
		return "proview";

	}

}
