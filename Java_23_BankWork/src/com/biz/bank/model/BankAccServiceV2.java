package com.biz.bank.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankAccVO;

/*
 * 여러개 계좌에 대한 입출금 처리
 */

// 멤버 변수 영역에 선언된 변수들은 프로젝트가 실행되서 작동되는동안 그 값을 계속해서 유지. 필드(멤버변수)라고 호칭
public class BankAccServiceV2 implements BankAccService {
	Map<String, BankAccVO> bankList;
	BankAccVO bankAccVO; 
	/*
	 * bankAccVO는
	 * viewAcc에서 계좌번호로 조회를 했을 때 해당되는 계좌가 있다면 bankList의 계좌정보를 담고 있을
	 * 인스턴스 변수다. 없다면 null값을 넣어준다
	 * 이 인스턴스가 가지고 있는 멤버변수들을 update(수정)하면 그 정보는 bankList에도 반영된다
	 * 다시 담을 필요가 없다는 뜻이다
	 */
	
	
	Scanner sc;
	
	public BankAccServiceV2() {
		bankList = new TreeMap<String, BankAccVO>();
		sc = new Scanner(System.in);
		// 임의로 계좌정보 생성. Test용
		for(int i = 0; i < 10; i++) {
			String strNum = String.format("%04d", i+1);
			// 계좌정보를 담을 vo생성
			BankAccVO bVO = new BankAccVO();
			bVO.setNum(strNum);
			bVO.setBalance(10000);
			bVO.setLastDate("2019-09-23");
			bVO.setRemark("신규");
			bankList.put(strNum, bVO);
		}
	}
	@Override
	public boolean viewAcc() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("계좌번호 >> ");
		String strNum = sc.nextLine();
		// 필드변수
		bankAccVO = bankList.get(strNum); // 이 줄에 대한 아래 주석을 잘 이해해야한다. 이 코딩의 핵심!
		// 만약 strNum 계좌가 bankList에 담겨 있으면 해당 계좌 정보를 bankAccVO에 담는다
		// Map이므로 key값으로 찾아오는데 없으면 null한 list를 담기 때문
		// 그렇지 않다면 bankAccVO는 null
		if(bankAccVO != null) {
			System.out.println("======================================");
			System.out.printf("계좌번호 : %s\n", bankAccVO.getNum());
			System.out.printf("계좌번호 : %d\n", bankAccVO.getBalance());
			System.out.printf("계좌번호 : %s\n", bankAccVO.getLastDate());
			System.out.printf("계좌번호 : %s\n", bankAccVO.getRemark());
			System.out.println("======================================");
		}
		else
			System.out.println("계좌정보 없음 !!!");
		return false;
	}

	@Override
	public void input() throws Exception {
		// TODO Auto-generated method stub
		this.viewAcc();
		if(bankAccVO != null) {
			System.out.print("입금액 >> ");
			String strInput = sc.nextLine();
			int intInput = Integer.valueOf(strInput);
			int intBalance = bankAccVO.getBalance();
			intBalance += intInput;
			
			/*
			 * bankAccVO에 Balance field 값을 변경하면
			 * call by reference이기 때문에 bankList에 자동으로 값이 변경된다
			 */
			bankAccVO.setBalance(intBalance);
			bankAccVO.setRemark("입금");
			
			// 현재 임금처리한 날짜를 추가
			Date date = new Date(); // 현재 컴퓨터의 시간을 가져오는 클래스

			// DecimalFormat. 숫자값을 임의의 콤마를 넣어 구분하게 쓰는 클래스처럼 비슷한 기능으로
			// 날짜값을 원하는 형태의 문자열로 바꿔준다
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			String strLastDate = sd.format(date);
			bankAccVO.setLastDate(strLastDate);
			// 입금처리 수행
		}
	}

	@Override
	public void output() throws Exception {
		// TODO Auto-generated method stub
		this.viewAcc();
		if(bankAccVO != null) {
			System.out.print("출금액 >> ");
			String strOutput = sc.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getBalance();
			if(intBalance >= intOutput) {
				intBalance -= intOutput;
				bankAccVO.setBalance(intBalance);
				bankAccVO.setRemark("출금");
				Date date = new Date();
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				String strLastDate = sd.format(date);
				bankAccVO.setLastDate(strLastDate);
			}
			else
				System.out.println("잔액부족 출금불가 !!!");
		}
	}
	// 업무가 종료될 때 현재 메모리에서 수행중이던 계좌내용을 파일에 저장

	public void writeAccBook(String strBookFile) throws IOException {
		// FileWriter fw = new FileWriter(strBookFile);
		PrintWriter pw = new PrintWriter(strBookFile);
		Set<String> keys = bankList.keySet();
		for(String key : keys)
		{
			BankAccVO bVO = bankList.get(key);
			pw.printf("%s:%d:%s:%s\n", bVO.getNum(), bVO.getBalance(), bVO.getLastDate(), bVO.getRemark());
		}
		pw.close();
		// fw.close();
	}
}