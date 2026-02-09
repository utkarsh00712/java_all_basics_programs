package ComparableInterface;

public class CustomString implements Comparable<CustomString> {
private String str;

public CustomString(String str) {
	this.str = str;
}

@Override
public int compareTo(CustomString o) {
	if(this.str.equals(o.str)) {
		return 0;
	} else {
		return this.str.compareTo(o.str);
	}
}

@Override
	public String toString() {
		
		return str ;
	}


}
