package testerClasses;

import strategyClasses.FrequencyCounter;
import strategyClasses.MapFD;

/**
 * Map class tests the map strategy for determining the frequency distribution
 * of a data set.
 * 
 * @author J.A. Sanchez Perez
 *
 */
public class MapTester<E extends Comparable<E>> extends strategyTester<E> {

	public MapTester(FrequencyCounter<E> freqCounter, String fileName) {
		super(freqCounter, fileName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MapTester<Integer> integerlistTesting = new MapTester<Integer>(new MapFD<>(), "integerData.txt");
		integerlistTesting.showResults();

		MapTester<String> stringlistTesting = new MapTester<String>(new MapFD<>(), "stringData.txt");
		System.out.println("");
		stringlistTesting.showResults();
	}

}
