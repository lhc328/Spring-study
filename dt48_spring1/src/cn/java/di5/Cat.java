package cn.java.di5;

public class Cat {
	private String name;
	
	private Integer age;
	
	private Float weight;
	
	public Cat() {
		System.out.println("无参构造");
	}
	
	
	
	public Cat(String name, Integer age, Float weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println("有参构造");
	}



	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}
	
}
