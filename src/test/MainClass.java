package test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.name = "뱃카";
		car1.color = "깜장";
		car1.speed = 100;
		car1.speedDown();
		
		Car car2 = new Car();
		car2.name = "모닝";
		car2.color = "빨강";
		car2.speed = 100;
		car2.speedUp();
		
		Car car3 = new Car();
		car3.name = "제네시스";
		car3.color = "초록";
		car3.speed = 50;
		
		System.out.println("test");
		
		
		System.out.println("============================");
		System.out.println("car1의 네임 --" + car1.name);
		System.out.println("car1의 색깔 --" + car1.color);
		System.out.println("car1의 속도 --" + car1.speed);
		System.out.println("============================");
		System.out.println("car2의 네임 --" + car2.name);
		System.out.println("car2의 색깔 --" + car2.color);
		System.out.println("car2의 속도 --" + car2.speed);
		System.out.println("============================");
		System.out.println("car3의 네임 --" + car3.name);
		System.out.println("car3의 색깔 --" + car3.color);
		System.out.println("car3의 속도 --" + car3.speed);
		System.out.println("============================");
		
		String car1GetName = car1.getName();
		
		System.out.println(car1GetName);
				
		
		
		/*Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		st1.name = "홍길동";
		st1.age  = 20;
		st1.studentNum  = "201601";
		System.out.println("이름 : " + st1.name );
		System.out.println("나이 : " + st1.age );
		System.out.println("학번 : " + st1.studentNum);
		st1.doSugang();
		
		System.out.println("============================");
		
		st2.name = "손흥민";
		st2.age  = 23;
		st2.studentNum  = "201602";
		System.out.println("이름 : " + st2.name );
		System.out.println("나이 : " + st2.age );
		System.out.println("학번 : " + st2.studentNum);
		st2.cancelSugang();
		
		System.out.println("============================");
		
		st3.name = "기성용";
		st3.age  = 22;
		st3.studentNum  = "201603";
		System.out.println("이름 : " + st3.name );
		System.out.println("나이 : " + st3.age );
		System.out.println("학번 : " + st3.studentNum);
		st3.doSugang();
		
		System.out.println("============================");*/
		
	}

}
