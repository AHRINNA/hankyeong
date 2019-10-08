package com.biz.single.exec;

import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);

		System.out.print("문자 >> ");
		String st1 = s1.nextLine();
		s1.close();

		System.out.print("문자 >> ");
		String st2 = s2.nextLine();

		System.out.print("문자 >> ");
		String st3 = s3.nextLine();
		
		System.out.println(st1 + " : " + st2 + " : " + st3);
		s2.close();
		s3.close();
	}
}
