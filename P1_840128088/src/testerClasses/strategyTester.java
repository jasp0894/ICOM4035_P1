package testerClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import strategyClasses.FrequencyCounter;

/**
 * StrategyTester defines and implements a data type for testing different strategies implementation. These strategies
 * aim to find the frequency distribution in a given dataset. 
 * @author J.A. Sanchez Perez
 *
 * @param <E> Type of the dataset elements.
 */
public class strategyTester<E extends Comparable<E>> {
	protected ArrayList<E> dataSet;
	protected FrequencyCounter<E> strategy;
	protected ArrayList<Map.Entry<E, Integer>> results;
	protected String fileName;

	public strategyTester(FrequencyCounter<E> freqCounter, String fileName) {
		strategy = freqCounter;
		dataSet = new ArrayList<E>();
		results = new ArrayList<Map.Entry<E, Integer>>();
		this.fileName="inputData/"+File.separator+ fileName;
	}

	/**
	 * Reads data from an external .txt file and store it in an arraylist
	 */
	@SuppressWarnings("unchecked")
	private void dataSetReader() {
		try {
			
			Scanner inputFile = new Scanner(new File(fileName));
			int i = 0;
			while (inputFile.hasNextLine()) {
				dataSet.add(i,(E)(Object) inputFile.nextLine());
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " Not found");
		}
	}
	//executes computeFDList of FrequencyComparator
	private void computeFD(){
		results = strategy.computeFDList(dataSet);
	}

	/**
	 * Display test results. The dataset where the strategy is tested on is showed and then the frequency distribution.
	 */
	public void showResults(){
		
		dataSetReader();
		computeFD();
		
		System.out.println("Testing " + strategy.getname() + " strategy for\n" + "the following data set: \n" + dataSet
				+ "\n\nFrequency Distribution of list elements: ");
		for(Map.Entry<E,Integer> e: results)
			System.out.print(e.getKey() + "\t"+ e.getValue()+"\n");
	
		
	}
}
