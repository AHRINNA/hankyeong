package com.biz.string;

import com.biz.string.service.StringService;
import com.biz.string.service.StringServiceImpV1;

public class String_01 {
	// 1프로젝트에 1개의 메인. 이클립스같은 개발도구에선 여러 클래스에 메인이 있는걸 허용
	// 현재 포커스중인 클래스의 메인이 실행. 만약 메인이 없으면 가장 마지막에 실행된 메인이 실행
	public static void main(String[] args) {
		StringService strService = new StringServiceImpV1();
		strService.input();
		strService.list();
		strService.view();
	}
}
