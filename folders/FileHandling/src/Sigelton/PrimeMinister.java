package Sigelton;

public class PrimeMinister {
 private static PrimeMinister primeMinister = null;
	String name;
	String party;
	int age;
	int term;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	private PrimeMinister(String name, String party, int age, int term) {
		super();
		this.name = name;
		this.party = party;
		this.age = age;
		this.term = term;
	}
	
	public static PrimeMinister getInstance(String name, String party, int age, int term) {
		if(primeMinister == null) {
			primeMinister = new PrimeMinister(name, party, age, term);
		}
		return primeMinister;
	}
	
	
}
