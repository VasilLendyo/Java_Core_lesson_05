package ua.lviv.lgs.four;

public class Human {
	
	int age;
	int height;
	int weight;
	
	Human(int age, int height) {
		this.age = age;
		this.height = height;
	}
	
	Human(int age, int height, int weight){
		this(age, height);
		this.weight = weight;
	}

}
