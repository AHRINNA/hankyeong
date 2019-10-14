package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsReadService;
import com.biz.exam.domain.BBsVO;

public class BBsReadServiceV1 implements BBsReadService {
	FileReader fr;
	BufferedReader br;
	private List<BBsVO> bbsList; 
	
	@Override
	public void readBBS(String bbsFile) throws Exception {
		// TODO Auto-generated method stub
		fr = new FileReader(bbsFile);
		br = new BufferedReader(fr);
		bbsList = new ArrayList<BBsVO>(); // 리스트 초기화.
		String str = br.readLine(); // 첫 줄 구분코드 지나가는 readLine
		System.out.println(str);
		while(true) {
			String s = br.readLine();
			if(s == null) break;
			String[] ss = s.split(":");
			BBsVO vo = new BBsVO(); // 리스트에 담을 값을 가질 vo 선언 및 초기화
			vo.setSeq(Integer.valueOf(ss[0]));
			vo.setAuth(ss[1]);
			vo.setDate(Integer.valueOf(ss[2]));
			vo.setSubject(ss[3]);
			vo.setText(ss[4]);
			vo.setCount(Integer.valueOf(ss[5]));
			bbsList.add(vo);
		}
		br.close();
		fr.close();
	}

	@Override
	public List<BBsVO> getBBsList() {
		// TODO Auto-generated method stub
		return bbsList;
	}

}
