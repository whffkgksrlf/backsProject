package test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.name = "��ī";
		car1.color = "����";
		car1.speed = 100;
		car1.speedDown();
		
		Car car2 = new Car();
		car2.name = "���";
		car2.color = "����";
		car2.speed = 100;
		car2.speedUp();
		
		Car car3 = new Car();
		car3.name = "���׽ý�";
		car3.color = "�ʷ�";
		car3.speed = 50;
		
		System.out.println("test");
		
		
		System.out.println("============================");
		System.out.println("car1�� ���� --" + car1.name);
		System.out.println("car1�� ���� --" + car1.color);
		System.out.println("car1�� �ӵ� --" + car1.speed);
		System.out.println("============================");
		System.out.println("car2�� ���� --" + car2.name);
		System.out.println("car2�� ���� --" + car2.color);
		System.out.println("car2�� �ӵ� --" + car2.speed);
		System.out.println("============================");
		System.out.println("car3�� ���� --" + car3.name);
		System.out.println("car3�� ���� --" + car3.color);
		System.out.println("car3�� �ӵ� --" + car3.speed);
		System.out.println("============================");
		
		String car1GetName = car1.getName();
		
		System.out.println(car1GetName);
				
		
		
		/*Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		st1.name = "ȫ�浿";
		st1.age  = 20;
		st1.studentNum  = "201601";
		System.out.println("�̸� : " + st1.name );
		System.out.println("���� : " + st1.age );
		System.out.println("�й� : " + st1.studentNum);
		st1.doSugang();
		
		System.out.println("============================");
		
		st2.name = "�����";
		st2.age  = 23;
		st2.studentNum  = "201602";
		System.out.println("�̸� : " + st2.name );
		System.out.println("���� : " + st2.age );
		System.out.println("�й� : " + st2.studentNum);
		st2.cancelSugang();
		
		System.out.println("============================");
		
		st3.name = "�⼺��";
		st3.age  = 22;
		st3.studentNum  = "201603";
		System.out.println("�̸� : " + st3.name );
		System.out.println("���� : " + st3.age );
		System.out.println("�й� : " + st3.studentNum);
		st3.doSugang();
		
		System.out.println("============================");*/
		
	}

}
