package my.test.reflact.TestProxy;

public class Programmer implements Person {

	//名字
	private String name;
	
	//年龄
	private int age;
	
	@Override
	public void eating() {
		System.out.println("吃饭...");
	}

	@Override
	public void sleeping() {
		System.out.println("睡觉...");
	}

	@Override
	public void work() {
		System.out.println("工作！敲代码...");
	}
	
	private void privatePoint(String point){
		System.out.println("程序员干得多、用得少、死得早！特点：" + point);
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
}