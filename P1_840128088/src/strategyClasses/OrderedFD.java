/**
 * 
 */
package strategyClasses;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Implements method computeFDList inside parent class to compute the frequency
 * distribution of a given dataset.
 * 
 * @author J.A. Sanchez Perez
 *
 */
public class OrderedFD<E extends Comparable<E>> extends FrequencyCounter<E> {

	public OrderedFD() {
		super("Ordered");
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Entry<E, Integer>> computeFDList(ArrayList<E> dataSet) {
		// TODO Auto-generated method stub
		ArrayList<E> dsCopy = (ArrayList<E>) dataSet.clone();
		Collections.sort((List<E>) dsCopy);

		ArrayList<Map.Entry<E, Integer>> results = new ArrayList<Map.Entry<E, Integer>>();

		Map.Entry<E, Integer> firstEntry = new AbstractMap.SimpleEntry<E, Integer>(dsCopy.get(0), 1);
		results.add(firstEntry);
		int entryIndex = 0;
		for (int i = 1; i < dsCopy.size(); i++) {
			if (dsCopy.get(i).equals(dsCopy.get(i - 1)))
				results.get(entryIndex).setValue(results.get(entryIndex).getValue() + 1);
			else {
				results.add(new AbstractMap.SimpleEntry<E, Integer>(dsCopy.get(i), 1));
				entryIndex++;
			}

		}

		return results;
	}

}
