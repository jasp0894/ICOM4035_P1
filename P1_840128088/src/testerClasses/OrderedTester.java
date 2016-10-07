package testerClasses;

import strategyClasses.FrequencyCounter;
import strategyClasses.OrderedFD;

/**
 * OrderedTester class tests the ordered strategy for determining the frequency
 * distribution of a data set.
 * 
 * @author J.A. Sanchez Perez
 *
 */
public class OrderedTester<E extends Comparable<E>> extends strategyTester<E> {

	public OrderedTester(FrequencyCounter<E> freqCounter, String fileName) {
		super(freqCounter, fileName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		OrderedTester<Integer> integerlistTesting = new OrderedTester<Integer>(new OrderedFD<>(), "integerData.txt");
		integerlistTesting.showResults();

		OrderedTester<String> stringlistTesting = new OrderedTester<String>(new OrderedFD<>(), "stringData.txt");
		System.out.println("");
		stringlistTesting.showResults();
	}

}
