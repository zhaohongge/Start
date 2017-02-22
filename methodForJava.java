package innerclass;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author:GHT
 * @version 创建时间：2017年2月21日 上午11:43:06
 */
public class methodForJava {
	// 费率：1- 10000收2%；10001-1000000收1%;1000000以上收0.75%；
	// 手续费最多不超过20000；
	// 账户1:62234500000001 5000.00
	// 账户2:62234500000002 300000.00
	// 账户3:62234500000003 2000000.00
	// 把费率单独放到一个方法里面；计算手续费单独放到一个方法里面，编写测试代码；
	public static double FeiLv(double money) {
		double fl = 0;
		if (money <= 10000.00) {
			fl = 0.02;
		} else if (money > 10000.00 && money <= 1000000.00) {
			fl = 0.01;
		} else {
			fl = 0.0075;
		}
		return fl;
	}

	public static double caculateMon(double money) {
		double feilv = FeiLv(money);
		double retmoney = feilv * money;
		if (retmoney > 20000) {
			return 20000.00;
		}
		return retmoney;
	}

	// 编写一个方法将小写金额转换成大写只考虑整数情况；
	// 首先判断几位数：
	public static int weishu(int a) {
		int i = Integer.toString(a).length();
		return i;
	}

	// 分别给每位数转换大小写
	// 加上单位并输出；
	public static void Lowertohigh(int a) {
		int i = weishu(a);
		int unit = (int) (Math.pow(10, i - 1));
		int num = 0;
		while (a > 0) {
			num = a / unit;
			switch (num) {
			case 0:
				if (((a % unit) / (unit / 10)) == 0) {
					System.out.print("");
				} else {
					System.out.print("零");
				}
				break;
			case 1:
				System.out.print("壹");
				break;
			case 2:
				System.out.print("贰");
				break;
			case 3:
				System.out.print("叁");
				break;
			case 4:
				System.out.print("肆");
				break;
			case 5:
				System.out.print("伍");
				break;
			case 6:
				System.out.print("陆");
				break;
			case 7:
				System.out.print("柒");
				break;
			case 8:
				System.out.print("捌");
				break;
			case 9:
				System.out.print("玖");
				break;
			default:
				System.out.println("数目贼大！换一个小的");
			}
			if(num>0){//如果不加这个条件,打印回来结果不对.
			switch (unit) {
			case 1:
				System.out.print("");
				break;
			case 10:
				System.out.print("拾");
				break;
			case 100:
				System.out.print("佰");
				break;
			case 1000:
				System.out.print("仟");
				break;
			case 10000:
				System.out.print("万");
				break;
			case 100000:
				System.out.print("拾万");
				break;
			case 1000000:
				System.out.print("佰万");
				break;
			case 10000000:
				System.out.print("仟万");
				break;
			case 100000000:
				System.out.print("亿");
				break;
			default:
				System.out.print("error");
			}
			}
			a = a % unit;
			unit = unit / 10;

		}

	}

	public static String lowerTohigher(int lowercase) {
		String str = new String();

		return str;
	}

	// 去除字符串中的空格的方法,先计算空格；
	public static int counteSpace(char[] a) {
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				num++;
			}
		}
		return num;
	}

	public static char[] destroyBlank(char[] a) {
		int num = counteSpace(a);
		char[] b = new char[a.length - num];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ') {
				b[j] = a[i];
				j++;
			}

		}
		return b;
	}

	public static void arrayToPrint(String[] aStr, char ch) {
		System.out.print("[");
		for (int i = 0; i < aStr.length; i++) {
			System.out.print(aStr[i]);// 如果是字符型，一起输出会当作+法计算两个的值，
			System.out.print(ch);
			// 然后输出一个结果，不会打印字符，推荐使用String型定义。
		}
		System.out.println("]");
	}

	public static void arrayToPrint(String[] aStr, String ch) {
		System.out.print("[");
		for (int i = 0; i < aStr.length; i++) {
			System.out.print(aStr[i] + ch);// 如果是字符型，一起输出会当作+法计算两个的值，
			// 然后输出一个结果，不会打印字符，推荐使用String型定义。
		}
		System.out.println("]");
	}

	public static double findArea(double r) {
		if (r >= 0) {
			double area = 0;
			area = 3.14 * r * r;
			return area;
		} else {
			return -1;
		}
	}

	public static double findRectArea(double l, double w) {
		if (l > 0 && w > 0) {
			double area = 0;
			area = l * w;
			return area;
		} else {
			return -1;
		}
	}

	public static int max(int a, int b) {
		return (a > b ? a : b);
	}

	public static int max(int a, int b, int c) {
		int s = 0;
		s = a > b ? a : b;
		return (s > c ? c : s);
	}

	public static double setRadius(double r) {
		double radius = r;
		return radius;
	}

	public static double Areas(double r) {
		double areas = (3.14 * r * r);
		return areas;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Ar;
		Ar = methodForJava.Areas(3.2354);
		System.out.println(Ar);
		double a = -10.7;
		a = Math.round(a);
		System.out.println(a);
		System.out.println(findArea(6.2));
		System.out.println(findRectArea(5.8, 2.4));
		// String[] str = new String[] { "first to the", " second to the", "
		// last" };
		// Scanner scanner =new Scanner(System.in);
		// String scannerCh = scanner.next();
		// System.out.println("请输入间隔符号(一个字符型)：");
		// String ch = scannerCh;
		// arrayToPrint(str, ch);
		char[] charBlank = new char[] { 'a', ' ', 'b', ' ', 'c', ' ', 'b', 'b', 'b', 'b' };
		int[] line = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(destroyBlank(charBlank));// println方法的重载,可以打印字符型数组
		System.out.println(charBlank);// println方法的重载,可以打印字符型数组
		System.out.println(line + "对于整数型数组不能直接打印");// 而不能打印其他类型数组；
		destroyBlank(charBlank);
		System.out.println(Arrays.toString(charBlank));
		System.out.println(Arrays.toString(destroyBlank(charBlank)));

		// 费率： 10000收2%；10001-1000000收1%;1000000以上收0.75%；
		// 手续费最多不超过20000；
		// 账户1:62234500000001 5000.00
		// 账户2:62234500000002 300000.00
		// 账户3:62234500000003 2000000.00
		// 把费率单独放到一个方法里面；计算手续费单独放到一个方法里面，编写测试代码；

		double card1 = 5000.00;
		double card2 = 300000.00;
		double card3 = 2000000.00;
		double mon1 = caculateMon(card1);
		double mon2 = caculateMon(card2);
		double mon3 = caculateMon(card3);
		System.out.println("卡号62234500000001费率为：" + mon1);
		System.out.println("卡号62234500000002费率为：" + mon2);
		System.out.println("卡号62234500000003费率为：" + mon3);
		// 编写一个方法将小写金额转换成大写只考虑整数情况；
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("请输入金额(必须是整数):");
		int money = scan.nextInt();
		Lowertohigh(money);
		}
	}

}
