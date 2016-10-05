package test;

public class ex2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		num++;
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;
		System.out.println(num);
		--num;
		System.out.println(num);
		
		int num1 =128;
		double num2 = 3.14;
		char char1 = 'A';
		boolean boolean1 = true;
		
		int arr[];
		arr = new int[10];
		arr[0]=10;
		arr[1]=10;
		arr[2]= arr[0] + arr[1];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int ifNum1 =12;
		int ifNum2 =24;
		
		if(ifNum1 > ifNum2){
			System.out.println("ifnum1 = " + ifNum1);
		}else{
			System.out.println("ifnum2 = " + ifNum2);
		}
		
		System.out.println("Done.");
		
		int ifElseNum = 74;
		
		if(ifElseNum < 10){
			System.out.println("10미만");
		}else if(ifElseNum < 100){
			System.out.println("10이상 100미만");
		}else if(ifElseNum < 1000){
			System.out.println("100이상 1000미만");
		}else{
			System.out.println("100이상");
		}
		
		int score = 91;
		
		if(score >= 90){
			System.out.println("A학점");
		}else if(score >= 80){
			System.out.println("B학점");
		}else if(score >= 70){
			System.out.println("C학점");
		}else if(score >= 60){
			System.out.println("D학점");
		}else{
			System.out.println("F학점");
		}
		
		
		
		System.out.println("Switch 문 이오!!!!");
		char grade = 'F';
		
		switch(grade){
			case 'A': 
				System.out.println("90점이상이오!");
				break;
			case 'B': 
				System.out.println("80점이상이오!");
				break;
			case 'C': 
				System.out.println("70점이상이오!");
				break;
			case 'D': 
				System.out.println("60점이상이오!");
				break;
			default : 
				System.out.println("후.... 노답...");
		}
		
		
		/*for(int i=1; i<)*/
		
		
		
		
		
		
	}

}
