package test;

public class ArrExample {

	public static void main(String[] args) {
		int[] score = {80,75,82,95,87,75,65};
		
		//����
		//���
		//�ְ�����
		//��������
		//�߰���
		
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
		
		System.out.println("�ִ밪�� " + maxVal +"�Դϴ�.");
		System.out.println("�ּҰ��� " + minVal +"�Դϴ�.");
		System.out.println("���հ�� " + sumVal +"�Դϴ�.");
		System.out.println("��հ��� " + averVal +"�Դϴ�.");
		System.out.println("�߰����� " + score[midIndex] + "�Դϴ�.");
		
		System.out.println("hello \t java \t bye!!");
		
		int sampleNum = 3;
		int namerge =0;
		
		namerge=sampleNum%2;
		
		if(namerge ==0){
			System.out.println("¦���ϴ�.");
		}else {
			System.out.println("Ȧ���ϴ�.");
		}
		
		int sampleNum2 = 24;
		
		if(sampleNum2 > 20 && sampleNum2 < 30){
			System.out.println("���Ǹ���");
		}else{
			System.out.println("���� �ȸ���");
		}
		
		
		
		
		
		
		
		
		
	}

}
