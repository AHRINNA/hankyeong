package com.biz.classes.model;

/* 학생의 성적처리에 사용할 VO 클래스를 디자인
 * 클래스에 어떤 변수, 메소드가 들어갈지 생각 = 추상화
 * 추상화를 실제 클래스로 만든다 = prototype (코드) 작성
 * 
 * 추상화 : 필요한 멤버변수가 무엇일까
 * 학번, 국어점수, 영어점수, 수학점수, 총점, 평균
 * 
 * 총점과 평균은 연산으로 나올 수 있으니 나머지는 일일이 입력해야하는 데이터이므로 멤버 변수이고
 * 총점과 평균은 메소드가 된다
 * 
 */
public class GradeScoreVO {

	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;
	
	public int total;
	public float average;
	
	
	public void total() {
		total = intKor + intEng + intMath;
//		int sum = intKor + intEng + intMath;
//		System.out.println(sum);
	}
	
	public void average() {
		int sum = intKor + intEng + intMath;
		average = sum / 3.0f;
//		float avg = sum / 3.0f;
//		System.out.println(avg);
	}
	
}
