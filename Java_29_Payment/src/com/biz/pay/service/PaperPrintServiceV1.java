package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

// PayReadService에서 pay.txt 파일을 읽은 리스트를 가져오고 읽은 정보로 한사람씩
// PaperMakeService에 make()로 작업하여 결과를 콘솔에 출력
public class PaperPrintServiceV1 {
	PayReadServiceV1 pr = new PayReadServiceV1();
	PaperMakeServiceV1 pm = new PaperMakeServiceV1();
	String payFile; // Ex클래스에서 파일 이름을 넘길 때 받을 변수
	List<List<PaperVO>> paperAllList;

	// 생성자는 하나만을 호출할 수 있다. 인자로 payFile 경로를 받게 되면 pr과 pm이 초기화되지 않을 것
	// 반대로 pr, pm을 초기화시키면 파일경로를 받을 수 없게 된다
	// 기본생성자를 인자로 넘겨받는 생성자 안에 집어넣거나, 기본생성자를 사용하고 setter로
	// 파일 이름을 넘기는 두가지 방법이 있을 것이다

	public PaperPrintServiceV1() {
		// TODO Auto-generated constructor stub
		pr = new PayReadServiceV1();
		pm = new PaperMakeServiceV1();
	}

	// PaperPrintServiceV1 instance = new PaperPrintServiceV1("pay.txt");
	public PaperPrintServiceV1(String payFile) {
		// TODO Auto-generated constructor stub
		this(); // 기본생성자를 호출
		this.payFile = payFile;
	}

	// pp.setPayFile("pay.txt");
	public void setPayFile(String payFile) {
		this.payFile = payFile;
	}

	public void viewPaper() throws Exception {

		for (List<PaperVO> paperList : this.paperAllList) {
			System.out.println("================================");
			System.out.print("사원번호 : " + paperList.get(0).getMember());
			System.out.println(", 급여액 : " + paperList.get(1).getMember());
			System.out.println("--------------------------------");
			for (PaperVO vo : paperList)
				System.out.println(vo);
		}
	}

	public void makePaperList() throws Exception {

		pr.readPay(this.payFile);
		List<String> payStrList = pr.getPayList();
		paperAllList = new ArrayList<List<PaperVO>>();
		// payStrList는 문자열<String>을 담고 있는 List이므로 for 반복문으로 하나씩 빼낼 수 있다
		for (String pay : payStrList) {
			// pay에는 HA-0001:급여 의 문자열이 있을 것이다
			// 이 pay를 :를 기준으로 나눠서 문자열에 담아야한다
			String[] pays = pay.split(":");
			int intPay = Integer.valueOf(pays[1]);
			// 이 급여로 pm.make()에 인자로 전달해 화폐매수를 계산한다
			pm.make(intPay);
			// make가 실행되면 내부에서 paperList를 만들어지는데 이것을 List에 담는다
			List<PaperVO> paperList = pm.getPaperList();
			paperList.get(0).setMember(pays[0]);
			paperList.get(1).setMember(pays[1]);

			// paperList를 paperAllList에 추가
			paperAllList.add(paperList);

		}

	}

	public void printPaper() throws Exception {

		PrintWriter pw;
		String payPath = "src/com/biz/pay/";
		for (List<PaperVO> paperList : this.paperAllList) {
			pw = new PrintWriter(payPath + paperList.get(0).getMember());
			pw.println("================================");
			pw.print("사원번호 : " + paperList.get(0).getMember());
			pw.println(", 급여액 : " + paperList.get(1).getMember());
			pw.println("--------------------------------");
			for (PaperVO vo : paperList) {
				pw.println(vo);
			}
			pw.close();
		}
	}
}
