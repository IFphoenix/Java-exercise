package hello;

import java.util.Scanner;

public class pinyinOutput {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	    //你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。
		//如输入1234，则输出：
		//yi er san si
		//注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出的开头加上“fu”，如-2341输出为：
		//fu er san si yi
		//用数组储存数字，并且读数组，再用for循环和switch进行输出；
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int b=0;
		if(number>=0){
			b=0;
		}else{
			b=1;
		}
		int count=1;
		number=Math.abs(number);
		int c=number;
		while(c/10!=0){
			count++;
			c/=10;
		}
		int [] origin = new int[count];
		for(int i=0;i<origin.length;i++){
			origin[i]=number%10;
			number/=10;
		}
		if(b==1){
			System.out.print("fu ");
		}
		for(int i=origin.length;i>0;i--){
			switch(origin[i-1]){
			case 0:
				System.out.print("ling ");
				break;
			case 1:
				System.out.print("yi ");
				break;
			case 2:
				System.out.print("er ");
				break;
			case 3:
				System.out.print("san ");
				break;
			case 4:
				System.out.print("si ");
				break;
			case 5:
				System.out.print("wu ");
				break;
			case 6:
				System.out.print("liu ");
				break;
			case 7:
				System.out.print("qi ");
				break;
			case 8:
				System.out.print("ba ");
				break;
			case 9:
				System.out.print("jiu ");
				break;
			}
		}
	}
}