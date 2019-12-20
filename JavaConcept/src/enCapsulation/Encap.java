package enCapsulation;

public class Encap {

	private int ssn;
	private String name;
	private int age;

	public void Sample() {

	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		Encap en = new Encap();
		en.setSsn(123456);
		en.setName("Uday");
		en.setAge(20);

		System.out.println(en.getName());
		System.out.println(en.getSsn());
		System.out.println(en.getAge());

	}

}
