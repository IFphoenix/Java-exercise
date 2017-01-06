/*
对数字求特征值是常用的编码算法，奇偶特征是一种简单的特征值。对于一个整数，从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。这个整数在第n位上的数字记作x，如果x和n的奇偶性相同，则记下一个1，否则记下一个0。按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，就形成了一个二进制数字。比如，对于342315，这个二进制数字就是001101。

这里的计算可以用下面的表格来表示：
数字       3  4  2  3  1  5
数位       6  5  4  3  2  1
数字奇偶  奇 偶 偶 奇 奇 奇
数位奇偶  偶 奇 偶 奇 偶 奇
奇偶一致   0  0  1  1  0  1 
二进制位值 32 16 8  4  2  1

按照二进制位值将1的位的位值加起来就得到了结果13。

你的程序要读入一个非负整数，整数的范围是[0,100000]，然后按照上述算法计算出表示奇偶性的那个二进制数字，输出它对应的十进制值。
*/
package hello;

import java.util.Scanner;

public class characteristicValue {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//此题可以用数组进行处理，首先对读入的数字进行while循环，利用算子得到数字的位数，然后在利用所得的算子构造相应大小的数组；
		//原始数字倒序输入数组当中，与此同时进行奇偶判断，设立二进制数组进行记录；
		//读取二进制数组，进行10进制转换；
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count=0;
		int cal=number;
		while(cal != 0){
			cal/=10;
			count++;
		}
		cal = number;
		int [] origin = new int[count];
		int [] Binary = new int[count];
		count=0;
		for(int i=0;i<origin.length;i++){
			origin[i]=cal%10;
			cal/=10;
			if(origin[i]%2==(i+1)%2){
				Binary[i]=1;
			}else{
				Binary[i]=0;
			}
		}
		int Decimal=0;
		for(int i=0;i<Binary.length;i++){
			if(Binary[i]==1){
				Decimal+=(int)(Binary[i]*Math.pow(2.0, (double)(i)));
				// Translate Binary to Decimal;
			}
		}
		System.out.println(Decimal);
	}
}