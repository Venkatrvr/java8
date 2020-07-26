package com.epam.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome {
	public static List<String> findPalindromeStrings(List<String> list,Predicate<String> predicate)
	{
		List<String> finalList=new ArrayList<>();
		for(String str:list)
		{
			if(predicate.test(str))
				finalList.add(str);
		}
		return finalList;
	}
	public static void main(String[] args)
	{
		String[] strArr= {"aba","abc","strrts","epam","epammape","a"};
		List<String> strList=Arrays.asList(strArr);
		List<String> palindromeList=findPalindromeStrings(strList,(String str)->{String rev=new StringBuffer(str).reverse().toString();return str.equals(rev);});
		System.out.println(palindromeList);
	}

}
