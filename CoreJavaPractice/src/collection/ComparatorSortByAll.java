 package collection;

import java.util.Comparator;

public class ComparatorSortByAll implements Comparator<ComparatorPOJO> {

	@Override
	public int compare(ComparatorPOJO o1, ComparatorPOJO o2) {
		 
		 if (o1.getId() == o2.getId() && o1.getName().equals(o2.getName())) {
	            return o1.getSalary() - o2.getSalary();
	        } else if (o1.getId() == o2.getId()) {
	            return o1.getName().compareTo(o2.getName());
	        } else {
	            return o1.getId() - o2.getId();
	        }
	}
}