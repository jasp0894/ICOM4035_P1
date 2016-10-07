/**
 * 
 */
package strategyClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * Implements method computeFDList inside parent class to compute the frequency
 * distribution of a given dataset.
 * 
 * @author J.A. Sanchez Perez
 *
 */
public class MapFD<E extends Comparable<E>> extends FrequencyCounter<E> {

	/**
	 * @param name
	 */
	public MapFD() {
		super("Map");
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see strategyClasses.FrequencyCounter#computeFDList(java.util.ArrayList)
	 */
	@Override
	public ArrayList<Entry<E, Integer>> computeFDList(ArrayList<E> dataSet) {
		// TODO Auto-generated method stub
		Hashtable<E, Integer> freqList = new Hashtable<>();
		ArrayList<Map.Entry<E, Integer>> results = new ArrayList<Map.Entry<E, Integer>>();

		for (E e : dataSet) {
			if (freqList.containsKey(e))
				freqList.replace(e, freqList.get(e) + 1);
			else
				freqList.put(e, 1);
		}

		java.util.Iterator<Map.Entry<E, Integer>> iter = freqList.entrySet().iterator();
		while (iter.hasNext())
			results.add(iter.next());

		return results;
	}

}
