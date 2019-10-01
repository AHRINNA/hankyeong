package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PaperReadServiceV1 {
	private String s = "src/com/biz/pay/직원급여.txt";
	FileReader fr;
	BufferedReader br;
	List<String[]> man;

	public void read() throws Exception {
		fr = new FileReader(s);
		br = new BufferedReader(fr);
		man = new ArrayList<String[]>();
		while (true) {
			String s = br.readLine();
			if(s == null) break;
			String[] str = s.split(":");
			man.add(str);
		}
	}

	public List<String[]> outList() {
		return man;
	}
}
