package com.spring.basic.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope("prototype")
//@Scope("singleton")
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int[] binarySearch(int[] numbers, int numberToSearchFor) {
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		for(int i=0; i < sortedNumbers.length; i++){  
            System.out.print(sortedNumbers[i] + " \n");  
		}
		
		//binary search
		
		int first = 0,last = sortedNumbers.length-1;
		int mid = (first + last)/2;  
		while( first <= last ){  
			if ( sortedNumbers[mid] < numberToSearchFor ){  
				first = mid + 1;     
		    }else if ( sortedNumbers[mid] == numberToSearchFor ){  
		    	System.out.println("Element is found at index: " + mid);  
		        break;  
		    }else{  
		        last = mid - 1;  
		    }  
		    mid = (first + last)/2;  
		 }  
		    
		if( first > last ){  
		      System.out.println("Element is not found!");  
		}
		
		//end binary search
		
		return sortedNumbers;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct...........................................");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy.............................................");
	}
}
