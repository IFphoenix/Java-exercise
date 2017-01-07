package hello;

import java.util.Scanner;

import org.w3c.dom.Text;

public class polynomialAddition {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//题目：http://mooc.study.163.com/learn/ZJU-1000002014?tid=1000002010#/learn/ojhw?id=1000056003
		//由于输入的数组大小不定，而题目给出的条件时幂次最大的是100；要输入的多项式有两个，不妨设置两个数组，数组每个大小为202；
		//由于输入次序为高次到低次，当出现第二个0时结束输入，适用于Do-While循环；
		//设立第三个数组，大小为101；设置双重循环，由高到低历遍，遇见相同的次数者进行系数合并处理；
		//最后输出结果数组；
		Scanner in = new Scanner(System.in);
		int [] mi= new int[201];
		int [] xi= new int[201];
		int i=0;  //通用算子
		int k=0; //循环结束的算子
		int entrance=0;
		int sign=0;//第一个多项式结束的数组位置；
		do{
			entrance = in.nextInt();
			mi[i]=entrance;
			entrance = in.nextInt();
			xi[i]=entrance;
			if(mi[i]==0){
				k++;
			}
			if(k==1){
				sign=i;
			}
			i++;
		}while(k!=2);
		int [] omi = new int[i];
		int [] oxi = new int[i];
		for(int j=0;j<i;j++){
			omi[j]=mi[j];
			oxi[j]=xi[j];
		}//提取完整的源矩阵
		int m=0;//结果矩阵的位数；
		if(omi[0]>=omi[sign+1]){
			m=omi[0]+1;
		}else{
			m=omi[sign+1]+1;
		}
		int [] result = new int[m];
		for(int test = m-1;test>=0;test--){
			int value=0;
			for(int j=0;j<omi.length;j++){
				if(omi[j]==test){
					value+=oxi[j];
				}
			}
			result[test]=value;
		}
		for(int j=result.length-1;j>=0;j--){
			if(result[j]==0){
				continue;
			}else{
				if(j!=0&&j!=1){
					System.out.print(result[j]+"x"+j+"+");
				}else if(j==1){
					System.out.print(result[j]+"x"+"+");
				}else{
					System.out.println(result[j]);
				}
			}
		}
	}
}