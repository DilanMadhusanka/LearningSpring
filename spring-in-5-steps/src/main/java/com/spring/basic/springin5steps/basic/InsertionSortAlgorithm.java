package com.spring.basic.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary	//If this is exist when Qualifier annotation here the code is run without error
@Qualifier("insertion")
public class InsertionSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		
		int n = numbers.length; 
        for (int i = 1; i < n; ++i) { 
            int key = numbers[i]; 
            int j = i - 1; 
  
            /* Move elements of numbers[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && numbers[j] > key) { 
                numbers[j + 1] = numbers[j]; 
                j = j - 1; 
            } 
            numbers[j + 1] = key; 
        }
		
		return numbers;
	}
}
