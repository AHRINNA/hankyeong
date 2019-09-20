package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.NameService;

public class NameServiceV1 implements NameService {
	protected List<String> nameList;
	protected List<String> famList;
	
	public NameServiceV1() {
		nameList = new ArrayList<String>();
		famList = new ArrayList<String>();
	}
	@Override
	public void readName(String fileName) throws Exception {
		// TODO Auto-generated method stub
		FileReader fR;
		BufferedReader buffer;
		fR = new FileReader(fileName);
		buffer = new BufferedReader(fR);
		
		while(true) {
			String strName = buffer.readLine();
			if(strName == null) break;
			nameList.add(strName);
		}
		buffer.close();
		fR.close();
	}

	@Override
	public void readFamily(String fileName) throws Exception {
		// TODO Auto-generated method stub
		FileReader fR;
		BufferedReader buffer;
		fR = new FileReader(fileName);
		buffer = new BufferedReader(fR);
		String strFam[] = {};
		
		while(true) {
			String str = buffer.readLine(); // 이 두 줄은
			if(str == null) break; // 사이에 아무것도 안들어가게 묶어서 쓴다
			strFam = str.split(":");
			famList.add(strFam[1]);
		}
		
		buffer.close();
		fR.close();
	}

	@Override
	public void writeNameFile(String korNameFile, int length) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pW;
		pW = new PrintWriter(korNameFile);
		Random rand = new Random();
		// 같은 번호를 뽑아내지 않게 하기위해 난수를 만들거나, Collections.shuffle(list) 활용
		// 단, shuffle을 쓰면 한번씩밖에 사용할 수 없다(김xx를 사용하면 김은 나오지 않음)
		
		String firstName;
		String lastName;
		for(int i = 0; i < length; i++)
		{
			firstName = famList.get(rand.nextInt(famList.size())).substring(0, 1);
			lastName = nameList.get(rand.nextInt(nameList.size()));
			pW.printf("%s %s\n", firstName, lastName);
		}
		pW.close();
	}
	
	/*public void make(List<String> famList, nameList) {
		
	}*/
}
