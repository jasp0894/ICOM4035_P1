package testerClasses;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import strategyClasses.FrequencyCounter;
import strategyClasses.SequentialFD;

/**
 * SequentialTester class tests the sequential strategy for determining the frequency distribution of a data set.
 * @author J.A. Sanchez Perez
 *
 */
public class SequentialTester<E extends Comparable<E>> extends strategyTester<E>{
	
	public SequentialTester(FrequencyCounter<E> freqCounter, String fileName) {
		super(freqCounter, fileName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		
		
		SequentialTester<Integer> integerlistTesting = new SequentialTester<Integer>(new SequentialFD<>(),"integerData.txt");
		integerlistTesting.showResults();
		
		SequentialTester<String> stringlistTesting = new SequentialTester<String>(new SequentialFD<>(),"stringData.txt");
		System.out.println("");
		stringlistTesting.showResults();
	}
	
}
