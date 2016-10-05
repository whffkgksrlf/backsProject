package test;

public class ArrExample {

	public static void main(String[] args) {
		int[] score = {80,75,82,95,87,75,65};
		
		//총점
		//평균
		//최고점수
		//최저점수
		//중간값
		
		int maxVal = 0;
		int minVal = 0;
		int sumVal = 0;
		int middleVal = 0;
		int num = 0;
		int midIndex = 0;
		double averVal = 0;
		
		minVal = score[0];
		for(int i=0; i< score.length; i++){
			sumVal = sumVal + score[i];
			if(maxVal < score[i]){
				maxVal = score[i];
			}
			
			if(minVal==0){
				minVal = score[i];
			}else if(minVal > score[i]){
				minVal = score[i];
			}
			
		}
		
		averVal = (double)sumVal/score.length;
		
		for(int i=0; i< score.length; i++){
					
			if((int) (score[i] - averVal) < 0){
				num = (int) (score[i] - averVal) * (-1);
			}else{
				num = (int) (score[i] - averVal);
			}
			
			if(middleVal == 0){
				middleVal = num;
				midIndex = i;
			}else if(middleVal > num){
				midIndex = 0;
				midIndex = i;
			}
		}
		
		System.out.println("최대값은 " + maxVal +"입니다.");
		System.out.println("최소값은 " + minVal +"입니다.");
		System.out.println("총합계는 " + sumVal +"입니다.");
		System.out.println("평균값은 " + averVal +"입니다.");
		System.out.println("중간값은 " + score[midIndex] + "입니다.");
		
		System.out.println("hello \t java \t bye!!");
		
		int sampleNum = 3;
		int namerge =0;
		
		namerge=sampleNum%2;
		
		if(namerge ==0){
			System.out.println("짝숩니다.");
		}else {
			System.out.println("홀숩니다.");
		}
		
		int sampleNum2 = 24;
		
		if(sampleNum2 > 20 && sampleNum2 < 30){
			System.out.println("조건마즘");
		}else{
			System.out.println("조건 안마즘");
		}
		
		
		
		
		
		
		
		
		
	}

}
