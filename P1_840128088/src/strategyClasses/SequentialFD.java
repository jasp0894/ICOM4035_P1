/**
 * 
 */
package strategyClasses;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/**
 * An object of this,determines the frequency distribution of the elements in a
 * dataSet utilizing a valid strategy.
 * 
 * @author J.A. Sanchez Perez
 *
 */
public class SequentialFD<E extends Comparable<E>> extends FrequencyCounter<E> {

	public SequentialFD() {
		super("Sequential");
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
		ArrayList<Map.Entry<E, Integer>> results = new ArrayList<Map.Entry<E, Integer>>();
		for (E e : dataSet) {
			boolean entryFound = false;
			for (int i = 0; i < results.size() && !entryFound; i++) {
				Map.Entry<E, Integer> entry = results.get(i);

				if (entry.getKey().equals(e)) {
					entry.setValue(entry.getValue() + 1);
					entryFound = true;
				}
			}
			if (!entryFound) {
				// need to create a new entry for the first instance found
				// of object e
				results.add(new AbstractMap.SimpleEntry<E, Integer>(e, 1));
			}

		}
		return results;
	}

}
