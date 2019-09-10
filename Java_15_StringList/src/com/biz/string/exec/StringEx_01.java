package com.biz.string.exec;

public class StringEx_01 {
	
	public static void main(String[] args) {
		String strNation = "Republic of Korea";
		String[] s1 = strNation.split(""); // 알파벳단위로 s1 배열에 할당
		/* for(int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
		}
		*/
		for(String s : s1) {
			System.out.println(s);
		}
		String[] s2 = strNation.split(" "); // 스페이스 기준으로 잘라서 s2 배열에 할당
		for(String s : s2) {
			System.out.println(s);
		}
		
		try {
			System.out.println("3: "+ s2[3]);
		} catch(Exception e) {
			
		} // 오류가 나면 무시하는 try~catch
		try {
			System.out.println("3: "+ s2[3]);
		} catch(Exception e) {
			e.printStackTrace();
		} // try가 실행되다가 오류가 발생하면 해당 exception을 parameter로 cath의 argument e에 넘겨주고 catch 안에서
		// e.printStackTrace(), 어떤 exception인지 콘솔에 보여주는 메소드가 실행된다
	}
}
