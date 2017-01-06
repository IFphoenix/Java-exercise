# Java-exercise
//I am a Java learner, This repository just a storage of my exercise code.
//This code is my first Java exercise, just change BJT to UTC.
package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//原始数字/100得到的余数是分钟，得到的商就是小时数；不过要在注意的是跨日的时间换算；
		//如果北京时间为0-7；则伦敦标准时是北京时间-8+24，，如果北京时间大于7，则直接减去8即可；
		Scanner in = new Scanner(System.in);
		System.out.print("请输入北京时间，本程序将会帮你换算为伦敦标准时:");
		int BJT = in.nextInt();//input Beijing Time
		int UTC = 0; //London Time
		int h = BJT/100; //Hour
		int min = BJT%100; //min
		if(h>7){
			UTC=(h-8)*100+min;
		}else{
			UTC=(h-8+24)*100+min;
		}
		System.out.println("伦敦标准时为："+UTC);
	}
}
