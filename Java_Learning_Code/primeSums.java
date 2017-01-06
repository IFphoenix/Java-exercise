package hello;

import java.util.Scanner;

public class primeSums {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
		//现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个数到第m个数之间所有的素数的和。
        //利用数组进行数据处理，先用boolean数组进行非素数的剔除，然后再整合获得素数数组，再历遍求和；
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		boolean [] origin = new boolean[b-a+1];
		for(int i=0; i<origin.length;i++){
			origin[i]=true;
		}
		for(int i=0;i<origin.length;i++){
			int c=i+a;
	        if(c==1){
	        	origin[i]=false;
	        }else if(c==2){
	        	origin[i]=true;
	        }else if(c%2==0){
				origin[i]=false;
			}else{
				int count=0;
				for(int j=2;j<c;j++){
					if(c%j==0){
						count=1;
						break;
					}
				}
				if(count==1){
					origin[i]=false;
				}else{
					origin[i]=true;
				}
			}
		}
		int count=0;
		for(int i=0;i<origin.length;i++){
			if(origin[i]==true){
				count+=1;
			}
		}
		int [] numbers = new int[count];
		count=0;
		for(int i=0;i<origin.length;i++){
			if(origin[i]==true){
				numbers[count]=i+a;
				count++;
			}
		}
		int sum=0;
		for(int i=0;i<numbers.length;i++){
			sum+=numbers[i];
		}
		System.out.println(sum);
	}
}