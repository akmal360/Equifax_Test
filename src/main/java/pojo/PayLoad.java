package pojo;

public class PayLoad {

	private int id;
	private String name;
	private String last;
	private int age;
	private String gender;

	public PayLoad() {

	}

	public PayLoad(int id, String name, String last, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.last = last;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
//		if (id < 10) {
//			System.out.println("value should not greter then zero");
//		}
		return id;
	}

	public void setId(int id) {
		this.id = id;
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("value should not greter then zero");
//		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
