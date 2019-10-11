package com.biz.lombok.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
/*
 * lombok.jar(롬복 프로젝트)
 * domain, model에서 getter, setter, toString, 생성자 등을 작성할 필요없게 자동으로
 * 작성해주는 3rd party library
 * 
 * eclipse같은 IDE에선 agent(plug in)을 설치해주고 프로젝트에선 compiler에게 build path를
 * 설정해주어야 한다
 */
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
 * Annotation. @keyword
 * Java의 확장키워드. Java compiler는
 * 해당 키워드로 작성된 class를 가져다가 코드를 완성해서 컴파일을 시켜준다
 */
@Data // 롬복의 모든 설정을 사용한다. 사용하지 않는 메소드까지 전부 만드므로 코드를 낭비할 수 있다

@Getter
@Setter
@ToString
@AllArgsConstructor // field생성자
@NoArgsConstructor // 기본생성자
@Builder // Builder Pattern

public class StudentVO {
	private String s_num, s_name, s_tel, s_addr;
	/* private String s_name;
	private String s_tel;
	private String s_addr; */
	private int s_grade;
	private String s_dept;
	
}
