package test;

public class Car {
	
	public String name;
	public String color;
	public int speed;
	
	public void speedUp(){
		speed++;
		System.out.println("현재속도 : " + speed);
	}
	
	public void speedDown(){
		speed--;
		System.out.println("현재속도 : " + speed);
	}
	
	public String getName(){
		return name;
	}
	
	
	
	
}
