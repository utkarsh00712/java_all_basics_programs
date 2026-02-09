package COmparatorInterface;

import java.util.Comparator;

public class Ascending implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		return a.compareTo(b);
	}

}
