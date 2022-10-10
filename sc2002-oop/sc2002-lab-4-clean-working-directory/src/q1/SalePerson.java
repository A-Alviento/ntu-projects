package q1;

public class SalePerson implements Comparable {
	
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String s1, String s2, int a) {
		this.firstName = s1;
		this.lastName = s2;
		this.totalSales = a;
	}
	
	public String getFirstName() {
	
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public int getTotalSales() {
		
		return totalSales;
	}
	
	public boolean equals(Object o) {
		
		SalePerson  O = (SalePerson) o;
		String a = O.getFirstName();
		String b = O.getLastName();
		String c = this.getFirstName();
		String d = this.getLastName();
		
		String str1 = a + b;
		String str2 = c + d;
		
		return str1.equals(str2);
	}
	
	public int compareTo(Object o) {
		
		SalePerson  O = (SalePerson) o;
		String a = this.getLastName();
		String b = O.getLastName();
		int c = this.getTotalSales();
		int d = O.getTotalSales();
	
		if (c < d)
			return -1;
		
		if (c > d)
			return 1;
		
		if (a.compareTo(b) < 0)
			return 1;
		
		return -1;
		
	}
	

}
