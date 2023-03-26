
package com.java8.quescol;

import java.util.Random;
import java.util.stream.IntStream;

public class Random1 {

	public static void main(String[] args) {
		 Random random = new Random();
		// normal way
		// for(int i=0; i<10; i++) {
		// System.out.println(random.nextInt(10)+1);
		// }
		// Using java8
		 random.ints().limit(2).forEach(System.out::println);
		// math.random

		int ran = (int) (Math.random() * 999) + 1000;

		String out = String.valueOf(ran);
		System.out.println(out);

	}

}
