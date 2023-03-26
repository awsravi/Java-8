package com.java8.quescol;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindMinMax {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6,2,3,4 };
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		// min
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println(min);

		// max
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);

		//sum
		
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		
		//avarage
		
		double avarage=Arrays.stream(arr).average().getAsDouble();
		System.out.println(avarage);
		
		//sorting
		Arrays.stream(arr).sorted().forEach(System.out::println);
		
		//reverseorder
		
		//remove duplicate
		Arrays.stream(arr).distinct().forEach(System.out::println);

		//
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
