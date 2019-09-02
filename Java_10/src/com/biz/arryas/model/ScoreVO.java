package com.biz.arryas.model;

public class ScoreVO {

	public String strNum; // 학번
	public int intKor; // 국어점수
	public int intEng; // 영어점수
	public int intMath; // 수학점수

	private int intSum; // 점수합계
	private int intAvg; // 평균
	private int intRank; // 석차

	public int Sum() {
		intSum = intKor + intEng + intMath;
		return intSum; // int형 intSum을 메소드 종료시 Sum() 메소드에 저장해서 넘겨줌
	}
}
/* 
ScoreVO에 멤버 변수인 intSum은 입력된 과목점수에 의해 계산되어져 값을 보관하는 변수
intSum을 계산하기 위해 Sum() Method를 생성해 두었다
public으로 선언한 intSum을 Sum() Method 없이 호출하면 초기화된 0값만이 리턴되고 메소드는 의미없어진다
Sum 메소드를 호출하지 않고 intSum값을 외부에서 읽는다면 public을 써야한다
private으로 외부에서 읽어서 무결성을 훼손하지 않고 Sum 메소드로 변수 값을 외부로 return 시킨다
외부 사용에서는 Sum 메소드가 리턴해준 값을 받아서 알아서 사용  
 */