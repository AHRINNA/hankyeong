package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;

public class GSEx_01 {

	public static void main(String[] args) {

		GradeScoreVO[] gsVO = new GradeScoreVO[10];
		for (int i = 0; i < gsVO.length; i++) {
			gsVO[i] = new GradeScoreVO();
		}

		gsVO[0].strNum = "001";
		gsVO[0].intKor = 88;
		gsVO[0].intEng = 77;
		gsVO[0].intMath = 94;
		gsVO[0].total();
		gsVO[0].average();

		gsVO[1].strNum = "002";
		gsVO[1].intKor = 66;
		gsVO[1].intEng = 88;
		gsVO[1].intMath = 37;
		gsVO[1].total();
		gsVO[1].average();

		gsVO[2].strNum = "003";
		gsVO[2].intKor = 71;
		gsVO[2].intEng = 63;
		gsVO[2].intMath = 84;
		gsVO[2].total();
		gsVO[2].average();
		
		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("-----------------------------------------------------");
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");

		for(int i = 0; i < gsVO.length; i++)
		{
			System.out.print(gsVO[i].strNum + "\t");
			System.out.printf("%3d\t", gsVO[i].intKor);
			System.out.printf("%3d\t", gsVO[i].intEng);
			System.out.printf("%3d\t", gsVO[i].intMath);
			System.out.printf("%3d\t", gsVO[i].total);
			System.out.printf("%5.2f\n", gsVO[i].average);
		}
		System.out.println("=====================================================");
		System.out.println();
	}

}
