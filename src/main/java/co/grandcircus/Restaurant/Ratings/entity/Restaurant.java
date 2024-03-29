package co.grandcircus.Restaurant.Ratings.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurants")

public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String name;
	private Integer rating;

	public Restaurant() {
		super();
	}

	public Restaurant(Long id, String name, Integer rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

}
