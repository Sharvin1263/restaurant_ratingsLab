package co.grandcircus.Restaurant.Ratings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Restaurant.Ratings.dao.RestaurantRepository;
import co.grandcircus.Restaurant.Ratings.entity.Restaurant;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantRepository restaurantDao;

	@RequestMapping("/")
	public ModelAndView home() {

		List<Restaurant> restaurants = restaurantDao.findByOrderByRatingDesc();
		ModelAndView mv = new ModelAndView("restaurant-list");
		mv.addObject("restaurants", restaurants);
		return mv;

	}

	@RequestMapping("/upvote")
	public ModelAndView upvote(@RequestParam("id") Long id) {

		Restaurant restaurants = restaurantDao.findById(id).get();
		restaurants.setRating(restaurants.getRating() + 1);

		restaurantDao.save(restaurants);
		return new ModelAndView("redirect:/");
	}

}
