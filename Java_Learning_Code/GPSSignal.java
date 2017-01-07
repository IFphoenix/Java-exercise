package hello;

import java.util.Scanner;

import org.w3c.dom.Text;

public class GPSSignal {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//题目：http://mooc.study.163.com/learn/ZJU-1000002014?tid=1000002010#/learn/ojhw?id=1000060003
		//首先用character的indexOf和lastIndexof函数找出$和*的位置；
		//再利用循环进行读取相应值，做^运算，最后得出相应值；
		//对最后的值进行运算，得到值后进行强制装换，得到char型的值，读取*后直到终点的数值，用equals进行比较；上述值相等则表明OK，不相等表示不OK；
		//定位第一个.和第二个.的位置，读取之间的数值，分析并且转化为北京时间；
		Scanner in = new Scanner(System.in);
		String origin =  in.nextLine();
		int a = origin.indexOf('$');
		int b = origin.lastIndexOf('*');
		int value=0;
		value=origin.charAt(a+1);
		for(int i = a+1;i<b-1;i++){
			value=value^origin.charAt(i+1);
		}
		value%=65536;
		value=Integer.parseInt(Integer.toHexString(value));
		int j = Integer.parseInt(origin.substring(b+1));
		if(value==j){
			int s1 = origin.indexOf(',');
			int s2 = origin.indexOf('.',s1+1);
			String result = origin.substring(s1+1, s2);
			int H = Integer.parseInt(result.substring(0,2))+8;
			int M = Integer.parseInt(result.substring(2,4));
			int S = Integer.parseInt(result.substring(4));
			if(H<10){
				System.out.print("0"+H+":");
			}else{
				System.out.print(H+":");
			}
			if(M<10){
				System.out.print("0"+M+":");
			}else{
				System.out.print(M+":");
			}
			if(S<10){
				System.out.print("0"+S);
			}else{
				System.out.print(S);
			}
		}else{
			System.out.println("Data Wrong!");
		}
	}
}