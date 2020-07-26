package com.epam.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartALetter {
	public static List<String> stringsWitha(List<String> list)
	{
		List<String> listOfStringsStartWitha=list.stream().filter(str-> str.startsWith("a") && str.length()==3).collect(Collectors.toList());
		return listOfStringsStartWitha;
	}
	public static void main(String[] args) {
		String[] strArray= {"","abc","bbc","aaa","asfasf","ttt","as","aop"};
		List<String> str=Arrays.asList(strArray);
		System.out.println(stringsWitha(str));
	}
}
