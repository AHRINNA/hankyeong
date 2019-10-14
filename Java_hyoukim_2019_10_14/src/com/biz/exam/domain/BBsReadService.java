package com.biz.exam.domain;

import java.util.List;

public interface BBsReadService {
	public void readBBS(String bbsFile) throws Exception;
	public List<BBsVO> getBBsList();
}
