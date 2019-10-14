package com.biz.exam.service;

import java.util.Comparator;
import java.util.List;

import com.biz.exam.domain.BBsVO;
import com.biz.exam.domain.BBsViewService;

public class BBsViewServiceV1 implements BBsViewService {
	List<BBsVO> bbsList;

	@Override
	public void setBBsList(List<BBsVO> list) {
		// TODO Auto-generated method stub
		bbsList = list;
	}

	@Override
	public void viewBBS() {
		// TODO Auto-generated method stub
		for (BBsVO vo : bbsList)
			System.out.println(vo.toString());
	}

	@Override
	public void viewBBS(String subject) {
		// TODO Auto-generated method stub
		for (BBsVO vo : bbsList) {
			if (vo.getSubject().contains(subject))
				System.out.println(vo.toString());
		}
	}

	@Override
	public void viewBBS(int sDate, int eDate) {
		// TODO Auto-generated method stub
		for (BBsVO vo : bbsList) {
			if (vo.getDate() >= sDate && vo.getDate() <= eDate)
				System.out.println(vo.toString());
		}
	}

	@Override
	public void viewBBS(boolean sort) {
		// TODO Auto-generated method stub
		if (sort == true) {
			bbsList.sort(new Comparator<BBsVO>() {
				@Override
				public int compare(BBsVO o1, BBsVO o2) {
					// TODO Auto-generated method stub
					int count1 = o1.getCount();
					int count2 = o2.getCount();
					if (count1 == count2)
						return 0;
					else if (count1 > count2)
						return 1;
					else
						return -1;
				}
			});
			for (BBsVO vo : bbsList)
				System.out.println(vo.toString());

		} else {
			bbsList.sort(new Comparator<BBsVO>() {

				@Override
				public int compare(BBsVO o1, BBsVO o2) {
					// TODO Auto-generated method stub
					int count1 = o1.getCount();
					int count2 = o2.getCount();
					if (count1 == count2)
						return 0;
					else if (count2 > count1)
						return 1;
					else
						return -1;
				}

			});
			for (BBsVO vo : bbsList)
				System.out.println(vo.toString());
		}
	}
}