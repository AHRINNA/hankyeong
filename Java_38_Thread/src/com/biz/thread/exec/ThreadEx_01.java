package com.biz.thread.exec;

import java.util.Scanner;

import com.biz.thread.classes.RunThreadV1;

public class ThreadEx_01 { // 클래스명을 Thread라고 하면 전혀 테스트가 되지 않는다
	// 가급적 2개 단어 이상을 연결하는 것이 좋다
	/*
	 * 한개의 컴퓨터(OS)에서 작동되는 프로그램들(ex, hwp, excel, mp3파일 재생 등) 각각을
	 * 프로세스라고 한다
	 * 프로세스가 동시에 여러개 작동되는 환경을 멀티 프로세스(멀티 태스킹) 환경이라고 한다
	 * 
	 * 한개의 프로세스 내부에서 작은단위의 일(job)들을 분할하고 이들을 동시에 작동하도록 하는 환경을
	 * 멀티쓰레드 환경이라고 한다
	 */
	 // 키보드에서 입력을 기다면서 다른곳에선 1~100까지 덧셈을 하여 console에 덧셈을 수행하여 콘솔에 보이기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunThreadV1 rt = new RunThreadV1();
		rt.start(); // main과 별도로 thread가 복제되었다(RunThreadV1의 run thread)
		// thread는 개별적으로 돌고 있고 main도 별도로 진행되고 있다
		Scanner s = new Scanner(System.in);
		System.out.print("아무글자나 입력 >> ");
		String strAny = s.nextLine();
		// blocking : 코드가 실행되는동안 더이상 진행하지 못하고 멈춰서 사용자의 입력을 wait 상태
		System.out.printf("입력한 문자열 : %s\n", strAny);
		Integer.valueOf(strAny);
		// 문자열을 숫자가 아닌 값을 입력하면 Exception in thread "main" 이라는 에러를 볼수있다
		// 이 일련의 main이 진행되는 과정을 thread라고 한다. single thread
		s.close();
	}
}
