package com.biz.exam.domain;

import java.util.List;

public interface BBsViewService {
	public void setBBsList(List<BBsVO> list);
	public void viewBBS();
	public void viewBBS(String subject);
	public void viewBBS(int sDate, int eDate);
	public void viewBBS(boolean sort);
}
