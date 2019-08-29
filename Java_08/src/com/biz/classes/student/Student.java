package com.biz.classes.student;

public class Student {

	/* main() method가 없는 클래스
	 * 정보(데이터)처리를 하기 위해서 데이터를 보관하고, 읽기, 쓰기 등을 수행하는 클래스
	 * 혼자는 아무 일도 하지 못한다. 반드시 어딘가에 있는 main() 메소드에서 불러줘야한다
	 * 인스턴스 변수로 선언, 생성, 초기화하고 멤버 변수에 값을 쓰기, 읽기를 수행하고 포함된 method를 호출하여 수행
	 * 
	 * Class를 만드는 규칙
	 * 한개의 파일(클래스)에는 class가 특별한 경우가 아니면 1개만 존재하게 만든다
	 * 파일의 이름은 클래스 이름과 같다. 클래스의 첫 글자는 대문자로
	 * 
	 * 메소드가 없는 클래스는 멤버 변수만을 가질 수 있다. 명령문, 계산식 등이 멤버 변수에 있으면 syntax 오류
	 * 
	 * 학생 정보에는 학번, 이름, 입학년도, 전공, 학년 항목 학년은 2019 - 입학년도 학생 개인의 정보보기, 학생 리스트 보기
	 */

	public int hakbun, iphak;
	public String strName, strMajor;
	// haknyeon = calendar.get(Calendar.YEAR) - iphak; 계산식은 멤버 변수 영역에 올릴 수 없다

	public void studentInfo() {
		System.out.printf("%s 학생의 개인정보를 열람합니다\n--------------------------------------\n", strName);
		
		System.out.println("학번\t이름\t입학\t전공\t학년");
		System.out.printf("%d\t%s\t%d\t%s\t%d\n", hakbun, strName, iphak, strMajor, 2019 - iphak + 1);
	}

	public void studentList() {
		System.out.printf("%d\t%s\n", hakbun, strName);
	}

}
