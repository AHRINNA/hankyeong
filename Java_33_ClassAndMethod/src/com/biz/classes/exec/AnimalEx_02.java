package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();
		// 부모클래스로 선언하고 자식클래스로 초기화
		((Dog)dog1).setName();
		viewName(dog1);
		((Cat)cat1).setName();
		viewName(cat1);
	}

	public static void viewName(Animal animal) {
		String name = animal.getName();
		System.out.println(name);
	}

}
