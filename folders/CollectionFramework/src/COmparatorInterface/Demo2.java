package COmparatorInterface;

import java.util.Comparator;

public class Demo2 implements Comparator<Employee> {
public int compare(Employee o1, Employee o2) {
	return o1.name.compareTo(o2.name);
}
}
