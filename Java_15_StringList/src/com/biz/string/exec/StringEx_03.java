package com.biz.string.exec;

public class StringEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		String[] s = strNation.split("");
		for(int i = (s.length - 1); i >= 0; i--) {
			System.out.print(s[i]);
		}
	}

}
