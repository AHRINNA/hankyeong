package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.util.ScoreIDX;

public class ScoreServiceV2 {
	private Map<String, ScoreVO> scList;

	public ScoreServiceV2() {
		scList = new TreeMap<String, ScoreVO>();
	}

	public Map<String, ScoreVO> getScList() {
		return this.scList;
	}

	/*
	 * ScoreFileName을 읽어서 scList에 추가
	 */
	public void read(String scoreFileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		fileReader = new FileReader(scoreFileName);
		buffer = new BufferedReader(fileReader);
		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String std[] = reader.split(":");
			try {
				ScoreVO sVO = new ScoreVO(std[ScoreIDX.NUM], Integer.valueOf(std[ScoreIDX.KOR]),
						Integer.valueOf(std[ScoreIDX.ENG]), Integer.valueOf(std[ScoreIDX.MATH]));
				scList.put(std[ScoreIDX.NUM], sVO);
			} catch (Exception e) {
				System.out.println(std[ScoreIDX.NUM] + "번 학생 성적에 오류 있음");
			} // 4개의 매개변수로 초기화하는 생성자를 만들고 그 생성자를 이용해서 세팅. 순서 주의

			/*
			ScoreVO sVO = new ScoreVO();
			sVO.setNum(std[ScoreIDX.NUM]);
			sVO.setKorScore(Integer.valueOf(std[ScoreIDX.KOR]));
			sVO.setEngScore(Integer.valueOf(std[ScoreIDX.ENG]));
			sVO.setMathScore(Integer.valueOf(std[ScoreIDX.MATH]));
			sVO.setSumScore(sVO.getKorScore() + sVO.getEngScore() + sVO.getMathScore());
			sVO.setAverage(sVO.getSumScore() / 3.0f);
*/
		}
		buffer.close();
		fileReader.close();
	}

	public void list() {
		System.out.println("성적정보");
		System.out.println("===========================");
		System.out.print("학번\t국어\t영어\t수학\n");
		Iterator<String> _list = scList.keySet().iterator();
		/*
		 * Collections 자료형의 반복문을 도와주는 class Iterator Set<String> _s = scList.keySet().
		 * key를 추출하여 set list로 생성과 비슷한 원리
		 * 
		 * while반복문을 사용하여 리스트를 처리할 수 있어진다 key를 추출한 set list를 Iterator형으로 변환
		 * 
		 * Iterator의 hasNext 메소드는 다음 값을 읽을 때 값이 없으면 false를 리턴
		 */
		while (_list.hasNext()) {
			ScoreVO scVO = scList.get(_list.next());
			// scList의 key값으로 ScoreVO를 추출해 scVO에 입력

			System.out.print(scVO.getNum() + "\t");
			System.out.print(scVO.getKorScore() + "\t");
			System.out.print(scVO.getEngScore() + "\t");
			System.out.print(scVO.getMathScore() + "\n");
		}
	}

	
	 public void total() { Set<String> keys = scList.keySet(); for (String key :
		 keys) { ScoreVO scVO = scList.get(key); int total = scVO.getKorScore() +
		 scVO.getEngScore() + scVO.getMathScore(); scVO.setSumScore(total);
		 scVO.setAverage(total / 3f);
		 }
	 }
	 
	public void listTotal() {
		Set<String> keys = scList.keySet();
		System.out.println("총점리스트");
		System.out.println("학번\t총점\t평균");
		for (String key : keys) {
			ScoreVO scVO = scList.get(key);
			System.out.printf("%5s\t%5d\t%4.2f\n", scVO.getNum(), scVO.getSumScore(), scVO.getAverage());
		}
	}

	/*
	 * scList를 총점기준으로 내림차순 DESC 정렬한 후 RANK field에 순서대로 숫자 추가. 동점자 처리x 데이터가 Map 구조로
	 * 저장되어 있는 경우 Map key로 정렬하는 것은 문제가 없지만 value로 정렬하려면 몇가지 과정을 거쳐야한다.
	 * 
	 * Map의 value를 list로 추출 list정렬하고 연산 list를 Map에 삽입
	 */
	public void rank() {
		// Map에서 value를 list(sortList)로 변환. 키값을 뽑아낼때는 keySet을 썼고
		// 값을 뽑아낼 때는 entrySet
		List<Map.Entry<String, ScoreVO>> sortList = new LinkedList<Map.Entry<String, ScoreVO>>(scList.entrySet());
		// Map<String, ScoreVO> type 데이터를 갖고 있는 scList를 List type sortList로 변환
		// Generic <>
		// List<> : List가 어떤 타입의 데이터를 가질 것인지 명시
		// Map을 List로 변환시킬땐 List<Map.Entry<>> 형태로 사용

		sortList = new LinkedList<>(scList.entrySet()); // <> 공백, Java 1.7 이상에서 사용 가능
		
		// Comparator를 사용해서 비교해주어야한다
		Collections.sort(sortList, new Comparator<Map.Entry<String, ScoreVO>>() {
			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				return o2.getValue().getSumScore() - o1.getValue().getSumScore();
			} // o2.getValue는 map으로부터 list형으로 VO를 추출하는 메소드. 오름차순(ASC)이 기본이므로
			// 뒤에서 앞으로 오름차순(앞에서부터 내림차순DESC)을 하기 위해 o2-o1.
		});

		// 성적순으로 내림차순 정렬 후에 rank 멤버변수에 순위 세팅
		int rank = 0;
		for (Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
		}
	}
}
