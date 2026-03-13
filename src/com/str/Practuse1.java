package com.str;

import java.util.Arrays;
import java.util.List;

public class Practuse1 {
	
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		l.stream().sorted((n1,n2)->n2.compareTo(n1)).limit(2).skip(1).forEach(System.out::println);
	}
}
