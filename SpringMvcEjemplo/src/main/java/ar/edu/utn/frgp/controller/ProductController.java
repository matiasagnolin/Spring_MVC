package ar.edu.utn.frgp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.utn.frgp.model.Product;

@Controller
public class ProductController {

	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView products(){
		List<String> prods = new ArrayList<String>();
		prods.add("Heladera");
		prods.add("Televisor");
		return new ModelAndView("products", "products", prods);
	}
	
	@RequestMapping(value="addProduct")
	public ModelAndView addProduct(){
		return new ModelAndView("addProduct", "command", new Product());
	}
	
	@RequestMapping(value="addProductSuccess", method=RequestMethod.POST)
	public ModelAndView addProductSuccess(@ModelAttribute("addProductSuc") Product product, ModelMap model){
		return new ModelAndView("addProductSuccess", "result", product.getDescription());
	}
	
	public String result(Model model){
		String resultado = "El producto se agrego con exito";
		model.addAttribute("name", resultado);
		return "result";
	}
}
