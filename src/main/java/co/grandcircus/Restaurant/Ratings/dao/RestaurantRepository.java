package co.grandcircus.Restaurant.Ratings.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.Restaurant.Ratings.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

	List<Restaurant> findByNameContainingIgnoreCase(String name);

	List<Restaurant> findAllByOrderByRatingAsc();

	List<Restaurant> findByOrderByRatingDesc();

}
