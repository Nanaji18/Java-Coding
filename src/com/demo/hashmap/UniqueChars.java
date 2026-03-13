package com.demo.hashmap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueChars {
	
	public static void main(String[] args) {
		
		String str="abcd ABCD aBcD AbCd";
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).filter(c-> c!= ' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
	}

}
