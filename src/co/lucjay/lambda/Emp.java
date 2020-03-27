package co.lucjay.lambda;

public class Emp {
	String name;
	int age;

	public Emp() {
	}

	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}

}
