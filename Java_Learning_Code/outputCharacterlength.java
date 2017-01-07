package hello;

import java.util.Scanner;

import org.w3c.dom.Text;

public class outputCharacterlength {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//题目：http://mooc.study.163.com/learn/ZJU-1000002014?tid=1000002010#/learn/ojhw?id=1000060003
		//用in.next()读入字符，然后用一个字符串函数indexOf查找“.”如果查找得到的，停止循环（do-while），若查找不到，用length()函数输出长度；
		Scanner in = new Scanner(System.in);
		String input ;
		int t = 0;
		do{
			input = in.next();
			if(input.indexOf('.')==-1){
				System.out.print(input.length()+" ");
			}else{
				System.out.print((input.length()-1)+" ");
				t=1;
			}
		}while(t!=1);
	}
}