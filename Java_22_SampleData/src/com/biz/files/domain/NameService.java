package com.biz.files.domain;

public interface NameService {
	public void readName(String fileName) throws Exception;
	public void readFamily(String fileName) throws Exception;
	public void writeNameFile(String korNameFile, int length) throws Exception;
}
