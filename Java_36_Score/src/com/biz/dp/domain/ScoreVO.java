package com.biz.dp.domain;

public class ScoreVO {
	private String s_num;
	private int s_kor;
	private int s_eng;
	private int s_math;

	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * ScoreVO의 Inner class를 매개변수로 가지는 생성자
	 */
	private ScoreVO(Builder builder) {
		this.s_num = builder.s_num;
		this.s_kor = builder.s_kor;
		this.s_eng = builder.s_eng;
		this.s_math = builder.s_math;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ScoreVO [s_num=" + s_num + ", s_kor=" + s_kor + ", s_eng=" + s_eng + ", s_math=" + s_math + "]";
	}
	
	/* 
	 * Inner class 선언. 원래 클래스의 필드를 복사, 필드와 같은 이름으로 이너클래스 형으로 메소드 생성
	 * 객체 메소드 체이닝을 위해 return this. VO형으로 이너클래스의 생성자를 만들고 this로 보낸다
	 * 이너클래스의 생성자에 오류가 생기는데 create 해주면 새로운 메소드가 생성된다
	 * 메소드에 필드들을 내부 변수로 세팅하는 것을 넣어주면 된다 
	 */
	
	public static class Builder {
		private String s_num;
		private int s_kor;
		private int s_eng;
		private int s_math;
		
		public Builder() {
			// TODO Auto-generated constructor stub
		}

		public Builder s_num(String s_num) {
			this.s_num = s_num;
			return this;
		}

		public Builder s_kor(int s_kor) {
			this.s_kor = s_kor;
			return this;
		}

		public Builder s_eng(int s_eng) {
			this.s_eng = s_eng;
			return this;
		}

		public Builder s_math(int s_math) {
			this.s_math = s_math;
			return this;
		}
		
		public ScoreVO build() {
			return new ScoreVO(this);
		}
		
	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String s_num) {
		this.s_num = s_num;
	}

	public int getS_kor() {
		return s_kor;
	}

	public void setS_kor(int s_kor) {
		this.s_kor = s_kor;
	}

	public int getS_eng() {
		return s_eng;
	}

	public void setS_eng(int s_eng) {
		this.s_eng = s_eng;
	}

	public int getS_math() {
		return s_math;
	}

	public void setS_math(int s_math) {
		this.s_math = s_math;
	}

}
