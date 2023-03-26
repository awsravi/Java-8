package com.java8.quescol;

import java.util.Arrays;
import java.util.List;

public class CountStringsGrateThan3 {
public static void main(String[] args) {
	
	 List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
	long count= stringList.stream().filter(s ->s.length() > 4).count();
	System.out.println(count);
	
	String[] str= {"ravi","kumar","viswa","kula"};
	long count1=Arrays.stream(str).filter( s ->s.length() > 4).count();
	System.out.println(count1);
	
}
}
