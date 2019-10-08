package com.biz.single.exec;

import com.biz.single.service.SafeSingleClassV1;

public class SingleEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeSingleClassV1 s = SafeSingleClassV1.getInstance();
		s.setName("홍길동");
		s.setNation("대한민국");
		System.out.println(s.getName());
		SafeSingleClassV1 s1 = SafeSingleClassV1.getInstance();
		System.out.println(s1.getName());
		s1.setName("이몽룡");
		System.out.println(s.getName());
		System.out.println(s1.getNation());
	}

}
