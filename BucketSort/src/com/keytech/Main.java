package com.keytech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };
		
		bucketSort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	private static void bucketSort(int[] input) {
		List<Integer>[] buckets = new List[10];
		
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<Integer>();
		}
		
		for(int i = 0; i < input.length; i++) {
			buckets[hash(input[i])].add(input[i]);
		}
		
		for(List bucket : buckets) {
			/*
			 * Uses an adaptive merge sort
			 * */
			Collections.sort(bucket);
		}
		
		int j = 0;
		for(int i = 0; i < buckets.length; i++) {
			for(int value : buckets[i]) {
				input[j++] = value;
			}
		}
	}
	
	private static int hash(int value) {
		return value / (int) 10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
