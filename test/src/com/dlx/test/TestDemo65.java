class Student {
	int age;
	String name;

	public Student(int age, String name) {
		name = this.name;
		age = this.age;
	}

	public void show() {
		System.out.println("姓名：" + name + "年龄：" + age);
	}
}

class Undergraduate extends Student {
	String degree;

	public Undergraduate(int age, String name, String degree) {
		super(age, name);
		this.degree = degree;
	}

	public void Student(int a, String b, String c, int age) {
		age = age;
		name = name;
		degree = c;
	}

	public void show() {
		System.out.println("姓名：" + super.name + " 年龄：" + super.age + " 学位："
				+ degree);
	}

}

public class TestDemo65 {
	public static void main(String[] args) {
		Student p1 = new Student(18, "李三");
		Undergraduate p2 = new Undergraduate(18, "李四", "硕士");
		p1.show();
		p2.show();
	}

}

