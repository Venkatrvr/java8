package com.epam.java8;

import java.util.Arrays;
import java.util.List;


public class Average {
	public static double findAverage(List<Integer> list)
	{
		int sum=list.stream().mapToInt(number->number.intValue()).sum();
        double avg=sum/list.size();
        return avg;
	}
	public static void main(String[] args)
	{
		List<Integer> intList = Arrays.asList(10,30,45,66,45,69);
        System.out.println(findAverage(intList));
	}
}
