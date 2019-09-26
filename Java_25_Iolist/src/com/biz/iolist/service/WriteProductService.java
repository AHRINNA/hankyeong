package com.biz.iolist.service;

import java.io.PrintWriter;
import java.util.List;

public class WriteProductService {
	List<String> productList;

	public WriteProductService() {
		// TODO Auto-generated constructor stub
	}

	public WriteProductService(List<String> productList) {
		// TODO Auto-generated constructor stub
		this.productList = productList;
	}

	public void setProList(List<String> productList) {
		this.productList = productList;
	}

	public void productWrite(String proWriteFile) throws Exception {
		if(productList == null) {
			System.out.println("상품이름 리스트가 없음");
			return;
		}
		PrintWriter pw = new PrintWriter(proWriteFile);

		for (String pro : productList) {
			pw.println(pro);
		}
		pw.close();
	}
}