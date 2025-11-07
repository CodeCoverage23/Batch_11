package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {

	private String name;
	private int releaseYear;
	private double rating;

	public Movie(String name, int releaseYear, double rating) {
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
		return "Movie [name=" + name + ", releaseYear=" + releaseYear + ", rating=" + rating + "]";
	}

	/*
	 * Sorting based on release year
	 * 
	 * @Override public int compareTo(Movie o) { return this.releaseYear -
	 * o.getReleaseYear(); }
	 */

	/*
	 * // Sorting based on rating in ASC
	 * 
	 * @Override public int compareTo(Movie o) { return (int) (this.rating -
	 * o.getRating()); }
	 */

	// Sorting based on String in DESC
	@Override
	public int compareTo(Movie o) {
		return o.getName().compareTo(this.name);
	}

}

public class ComparableDemo {

	public static void main(String[] args) {

		List<Movie> list = new ArrayList<>();
		list.add(new Movie("RRR", 2024, 9.50));
		list.add(new Movie("Lord", 2023, 7.50));
		list.add(new Movie("Kantara", 2025, 9.70));
		list.add(new Movie("Animal", 2024, 6.70));

		Collections.sort(list);

		for (Movie m : list) {
			System.out.println(m);
		}

	}

}
