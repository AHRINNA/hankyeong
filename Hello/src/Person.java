
public class Person {
	int age;
	String name;
	String job;
	
	
	public void helloNumber(int num1)    // 반환값 없음, int형 매개변수 한 개 지정
	{
	    System.out.printf("Hello, %d\n", num1);    // Hello, 와 매개변수를 조합하여 문자열 출력
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
	
	public void sleep(int num) {
		System.out.println(num);
	}
}
