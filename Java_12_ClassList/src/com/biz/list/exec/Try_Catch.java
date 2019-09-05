package com.biz.list.exec;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 = 0, n3 = 0;
		/*
		 * n1 = Integer.valueOf("30"); n2 = Integer.valueOf("30"); n3 =
		 * Integer.valueOf("30");
		 */

		/*
		 * n1 = Integer.valueOf("30"); n2 = Integer.valueOf(" 30"); // 오류발생 n3 =
		 * Integer.valueOf("30 "); // 오류발생
		 */

		try {
			n1 = Integer.valueOf("30");
		} catch (Exception e) {
			System.out.println("입력갑에 문자열이 포함되어 정수로 변환실패");
		}
		try {
			n2 = Integer.valueOf("30 ");
		} catch (Exception e) {
			System.out.println("입력갑에 문자열이 포함되어 정수로 변환실패");
		}
		try {
			n3 = Integer.valueOf(" 30");
		} catch (Exception e) {
			System.out.println("입력갑에 문자열이 포함되어 정수로 변환실패");
		}

		int sum = n1 + n2 + n3;
		System.out.println(sum);
	}
}
