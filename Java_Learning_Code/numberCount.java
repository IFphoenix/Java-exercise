package hello;

import java.util.Scanner;

public class numberCount {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//奇数偶数的统计，首先while循环读入数字，进行取余判断，除二余一的是奇数，没有余数的是偶数，并用算子统计，最后输出；
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int j = 0;
		int o = 0;
		while(number != -1){
			if(number%2 == 0){
				o++;
			}else{
				j++;
			}
			number = in.nextInt();
		}
		System.out.print(j+" "+o);
	}
}