package com.biz.var;

public class Float_Int_02 {
	public static void main(String[] args) {
		int intKor=90, intEng=80, intMath=78, intSum=intKor+intEng+intMath;
		float fAvg=intSum/3;
		float fAvg2=(float)intSum/3;
		System.out.println("총점 : "+intSum);
		System.out.println("평균(정수) : "+fAvg);
		System.out.println("평균(실수) : "+fAvg2);
	}
}
