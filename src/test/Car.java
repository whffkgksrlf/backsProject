package test;

public class Car {
	
	public String name;
	public String color;
	public int speed;
	
	public void speedUp(){
		speed++;
		System.out.println("����ӵ� : " + speed);
	}
	
	public void speedDown(){
		speed--;
		System.out.println("����ӵ� : " + speed);
	}
	
	public String getName(){
		return name;
	}
	
	
	
	
}
