package com.biz.var;

public class intVar_02 {
	public static void main(String[] args) {
		/* main() method는 JVM이 intVar_02.main() 형태로 호출하여 사용함
		 * 
		 * 만약 만든 클래스에 main() method가 없으면 아무 일도 일어나지 않는다
		 * 
		 * C언어는 초기화하지 않으면 메모리에 쓰레기값이 있는것과 다르게
		 * Java는 반드시 어떠한 값으로 초기화해야 인식한다
		 */
		int intNum1=0, intNum2=0, intSum=0;
		
		intNum1=40;
		intSum=intNum1+intNum2;
		// Micro Operation의 일종
		// =의 오른쪽부터 실행. 덧셈연산자는 연산자의 왼쪽항부터 가져와서 연산
		
	}
}
