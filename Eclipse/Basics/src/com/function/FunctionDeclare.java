package com.function;

public class FunctionDeclare {
	static void getMovieDetail(String movieName,String movieDes, int movieDuration, String movieLanguage, String movieRelease, String movieCountry, String movieGenre) {
		System.out.println("Movie Titel : "+movieName);
		System.out.println("Movie Description : "+movieDes);
		System.out.println("Movie Duration : "+ movieDuration);
		System.out.println("Movie Language"+movieLanguage);
		System.out.println("Movie Release : "+movieRelease);
		System.out.println("Movie Country : "+movieCountry);
		System.out.println("Movie Genre : "+movieGenre);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movieName = "AAA";
		String movieDes = "Dramaof1945";
		int movieDuration = 3; 
		String movieLanguage = "English"; 
		String movieRelease = "17/02/2026";
		String movieCountry = "XYZ";
		String movieGenre = "THRILLER";
		System.out.println("________Movie Details________");
		getMovieDetail(movieName,movieDes,movieDuration,movieLanguage,movieRelease,movieCountry,movieGenre);
		System.out.println("-----------------------------");

	}

}
