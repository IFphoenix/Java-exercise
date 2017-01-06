package hello;

import java.util.Scanner;

public class Signal_Classify {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//首先分解所得的信号质量报告，商为第一位，余数为的二位，然后在利用switch语句进行输出。
		Scanner in = new Scanner(System.in);
		int Report = in.nextInt();
		int R = Report/10;
		int S = Report%10;
		switch(S){
		case 1:
			System.out.print("Faint signals, barely perceptible, ");
			break;
		case 2:
			System.out.print("Very weak signals, ");
			break;
		case 3:
			System.out.print("Weak signals, ");
			break;
		case 4:
			System.out.print("Fair signals, ");
			break;
		case 5: 
			System.out.print("Fairly good signals, ");
			break;
		case 6:
			System.out.print("Good signals, ");
			break;
		case 7:
			System.out.print("Moderately strong signals, ");
			break;
		case 8:
			System.out.print("Strong signals, ");
			break;
		case 9:
			System.out.print("Extremely strong signals, ");
			break;
		}
		switch(R){
		case 1:
			System.out.println("unreadable.");
			break;
		case 2:
			System.out.println("barely readable, occasional words distinguishable.");
			break;
		case 3:
			System.out.println("readable with considerable difficulty.");
			break;
		case 4:
			System.out.println("readable with practically no difficulty.");
			break;
		case 5:
			System.out.println("perfectly readable.");
			break;
		}
	}
}