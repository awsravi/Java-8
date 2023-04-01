package com.java8.quescol;


import java.util.Random;
import java.util.stream.Stream;

public class GenerateMethodRandom {
public static void main(String[] args) {
	
	
	Stream<Integer> str=Stream.of(1,2,3,4,5,6);
	str.forEach(System.out::println);
	
	Stream<Integer> num =Stream.generate(new Random()::nextInt).limit(4);
	num.forEach(System.out::println);
	
	int ran=(int)( Math.random()*999)+100;
	
	String numbers=String.valueOf(ran);
	System.out.println(numbers);
	
	
	
	
	
	
}
}
