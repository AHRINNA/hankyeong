package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_01 {
	public static void main(String[] args) {
		Animal am = new Animal();
		System.out.println(am.getName());

		Dog dog1 = new Dog();
		String name = dog1.getName();
		// dog1.setName을 써서 몽이로 이름을 바꿈
		dog1.setName();
		name = dog1.getName();
		System.out.println(name);

		Cat cat1 = new Cat();
		cat1.setName();
		name = cat1.getName();
		System.out.println(name);
	}
}
