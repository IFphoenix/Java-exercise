package hello;

import java.util.Scanner;

import org.w3c.dom.Text;

public class Ends {
	//用于计算i之前（包括i的所有素数，并以数组形式输出）
	public static int[] Prime(int i){
		int count=1;
		if(i==2){
			count=1;
		}else{
			for(int j=3;j<=i;j++){
				int decide=0;
				for(int k=2;k<j;k++){
					if(j%k==0){
						decide=1;
						break;
					}
				}
				if(decide==0){
					count++;
				}
			}
		}
		int [] primeNumber = new int[count];
		count=-1;
		for(int j=2;j<=i;j++){
			int decide=0;
			if(j!=2){
				for(int k=2;k<j;k++){
					if(j%k==0){
						decide=1;
						break;
					}
				}
			}
			if(decide==0){
				count++;
				primeNumber[count]=j;
			}
		}
		return primeNumber;
	}
	//判断是否是因子，如果是，则累加；不是则跳过；
	public static int outPut(int b,int a,int [] d){
		int c = 0;
		for(int i=0;i<Prime(a).length;i++){
			if(b%Prime(a)[i]==0 && b/Prime(a)[i]!=1){
				d[0]+=Prime(a)[i];
				b/=Prime(a)[i];
				c = b;
				break;
			}else if(b%Prime(a)[i]==0 && b/Prime(a)[i]==1){
				d[0]+=Prime(a)[i];
				c = 1;
				break;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//题目：http://mooc.study.163.com/learn/ZJU-1000002014?tid=1000002010#/learn/ojhw?id=1000064004
		//又是一道愉快的素数输出题目，第一步利用数组得出此数之前所有的素数；第二步拿此数与之前的素数依次相除（可以作为函数进行调用），利用数组的地址传递特性进行累加处理；
		//然后比较，如果相同则输出，如果不相同则不输出；
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c=0;
		int [] result = new int [1];
		for(int i=a+1;i<b;i++){
			result[0]=1;
			c=i;
			do{
				c=outPut(c, i, result);
			}while(c!=1);
			if(i==result[0]){
				System.out.print(i+" ");
			}
		}
	}
}