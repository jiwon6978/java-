package CH01;


class Person{
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";}
	
}

public class C10Ex {

	
	//원시타입의 자료형(데이터값)
	public static void func1(int num) {          
		System.out.println(num);
	}
	
	//참조자료형의 자료형(위치값)
	public static void func2(Object obj) {
		System.out.println(obj);
	}
	
	
	public static Object func3(String name,int age) {
		return new Person(name,age); //업캐스팅 , 하위객체인데 Object는 상위클래스
	}
	
	
	
	public static void main(String[] args) {
		
		func1(10);
		func2(new Person("홍길동",10));
		Object ob = func3("티모",100);
		
		
		
		
		
		
	}

}
