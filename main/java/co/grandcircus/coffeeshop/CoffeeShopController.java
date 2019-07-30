package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;






	@Controller
public class CoffeeShopController {

		@Autowired
private  ProductDao productdao;
private  UserDao userdao;

		
		@RequestMapping("/")
		public ModelAndView listP() {
			List<Product> leListOfProducts = productdao.findAll();
			System.out.println(leListOfProducts);
			return new ModelAndView("products","price", leListOfProducts);
		}
		
//		@RequestMapping("/register/add")
//		public ModelAndView listU() {
//			List<User> leListOfUsers = userdao.findAll();
//			return new ModelAndView("users", "id", leListOfUsers);
//		}
		
//		@PostMapping("/register/edit")
//		public ModelAndView save(@RequestParam("id") Long id, User user) {
//			user.setId(id);
//			userdao.update(user);
//			
//			
//			return new ModelAndView("redirect:/register/id=" + id);
//		}
		
		@RequestMapping("/register/add")
		public ModelAndView add() {		
			return new ModelAndView("/register");
		}
		
		@PostMapping("/register/add")
		public ModelAndView addSubmit(User user) {
			//userdao.create(user);
			return new ModelAndView("/thanks");
		}
		
//		@RequestMapping("/register/delete")
//		public ModelAndView remove(@RequestParam("id") Long id) {
//			userdao.delete(id);
//			return new ModelAndView("redirect:/");
//		}

}
