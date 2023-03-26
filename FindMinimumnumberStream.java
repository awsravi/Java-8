package com.java8.quescol;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMinimumnumberStream {
public static void main(String[] args) {
 	 Integer min=Stream.of(1,2,3,4,5,6).min(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(min);
	Integer max =Stream.of(1,2,3,4,5,6).max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(max);
}
}
