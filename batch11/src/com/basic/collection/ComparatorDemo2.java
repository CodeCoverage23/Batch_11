package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class Movie2 {

	private String name;
	private int releaseYear;
	private double rating;

	public Movie2(String name, int releaseYear, double rating) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie2 [name=" + name + ", releaseYear=" + releaseYear + ", rating=" + rating + "]";
	}

}

// DESC
class RatingComparator implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 o1, Movie2 o2) {
		return Double.compare(o2.getRating(), o1.getRating());
	}

}

class YearComparator implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 o1, Movie2 o2) {
		return o2.getReleaseYear() - o1.getReleaseYear();
	}

}

public class ComparatorDemo2 {

	public static void main(String[] args) {

		List<Movie2> list = new ArrayList<>();
		list.add(new Movie2("RRR", 2024, 9.50));
		list.add(new Movie2("Lord", 2023, 7.50));
		list.add(new Movie2("Kantara", 2025, 9.70));
		list.add(new Movie2("Animal", 2024, 6.70));

		Collections.sort(list, new YearComparator());

		for (Movie2 m : list) {
			System.out.println(m);
		}

	}
	
	Map m;

}
