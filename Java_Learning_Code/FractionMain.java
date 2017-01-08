package HomeWork;

import java.util.Scanner;

public class FractionMain {

	public static void main(String[] args) {
		/*题目内容：
		设计一个表示分数的类Fraction。这个类用两个int类型的变量分别表示分子和分母。
		这个类的构造函数是：

		Fraction(int a, int b)
		    构造一个a/b的分数。

		这个类要提供以下的功能：

		double toDouble();
		    将分数转换为double
		Fraction plus(Fraction r);
		    将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。
		Fraction multiply(Fraction r);
		    将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
		void print();
		    将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。

		注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。

		你写的类要和以下的代码放在一起，并请勿修改这个代码：

		import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				Fraction a = new Fraction(in.nextInt(), in.nextInt());
				Fraction b = new Fraction(in.nextInt(),in.nextInt());
				a.print();
				b.print();
				a.plus(b).print();
				a.multiply(b).plus(new Fraction(5,6)).print();
				a.print();
				b.print();
				in.close();
			}

		}

		注意，你的类的定义应该这样开始：

		class Fraction {

		也就是说，在你的类的class前面不要有public。*/
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction{
	int Numerator ;
	int Denominator ;
	Fraction(int a, int b){
		Numerator = a;
		Denominator = b;
	}
	double toDouble(){
		return (double)Numerator/Denominator;
	}
	Fraction plus(Fraction r){
		int a;
		int b;
		a=this.Numerator*r.Denominator+this.Denominator*r.Numerator;
		b=this.Denominator*r.Denominator;
		Fraction d = new Fraction(a,b);
		return d;
	}
	Fraction multiply(Fraction r){
		int a;
		int b;
		a=this.Numerator * r.Numerator;
		b=this.Denominator * r.Denominator;
		Fraction d =new Fraction(a,b);
		return d;
	}
	int cicle(int [] a,int [] b,int k){
		int s = 0;
		if (a[0]>b[0]){
			s=b[0];
		}else if(a[0]<b[0]){
			s=a[0];
		}else if(a[0]==b[0]){
			a[0]=1;
			b[0]=1;
			k=1;
		}
		if(k!=1 && s!=1){
			for(int j=2;j<=s;j++){
				if((a[0]%j==0)==(b[0]%j==0)){
					a[0]/=j;
					b[0]/=j;
					k=0;
					break;
				}else{
					k=1;
					break;
				}
			}
		}else{
			k=1;
		}
		return k;
	}
	void Simpfy (int [] a,int [] b){
		int k;
		do{
			k=0;
			k=cicle(a,b,k);
		}while(k!=1);
	}
	void print(){
		int [] a ={this.Numerator};
		int [] b ={this.Denominator};
		Simpfy(a,b);
		if(a[0]==b[0]){
			System.out.println(1);
		}else{
			System.out.println(a[0]+"/"+b[0]);
		}
	}
}