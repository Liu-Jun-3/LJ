package com.lj.www;

import java.util.Random;
import java.util.Scanner;

public class Second 
{

//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//        //一维数组的定义
//		//c++ int a[5]
//		//java
//		int[] a;
//		a = new int[5];
//		//int[] a = new int[5];
//		//c++a.length();
//		//java求数组的长度
//		System.out.println(a.length);
//		System.out.println(a[1]);
//		boolean[] b = new boolean[1];
//		System.out.println(b[0]);
		
		
		
		
		
//		int[] a = new int[]{1,2,3};
//		int sum = 0;
//		int max = a[0];
//		//int[] a = {1,2,3};
//		for(int i = 0;i<3;i++)
//		{
//			sum = sum + a[i];
//		}
//		for(int i:a)
//		{
//			sum += i;
//			if(max < i)
//			{
//				max = i;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(max);
	
		
		
		
//		int[][] a = new int[2][];
//		int max = 0;
//		a[0] = new int[]{1,2};
//		a[1] = new int[]{3,4,5};
//		for(int[] i:a)
//		{
//			for(int o:i)
//			{
//				max += o; 
//			}
//		}
//		System.out.println("max = " +max);
//	}

		
		

//	public static void max(int[][] a)
//	{
//		int max = 0;
//		for(int[] i:a)
//		{
//			for(int o:i)
//			{
//				max += o; 
//			}
//		}
//		System.out.println("max = " +max);
//	}	
//    }
//  随机点名
	//1----用一个一维数组来保存五个同学的名字
	public static void addStudent(String[] stu)
	{
		Scanner scan = new Scanner(System.in);
		for(int i =0;i<stu.length;i++)
			stu[i] = scan.next();
	}
	//2----打印所有同学名字
    public static void printStudent(String[] stu)
    {
    	for(int i = 0;i<stu.length;i++)
    		System.out.print(stu[1]+"  ");
    	System.out.print("\n");
    }
	//3----随机抽取一名同学
    public static void random(String[] stu)
    {
    	int index = new Random().nextInt(stu.length);
    	System.out.println("倒霉蛋儿是"+stu[index]);
    }
	//4----main中依次调用三个方法实现相应功能
	public static void main(String[] args)
	{
		String[] student = new String[5];
		addStudent(student);
		printStudent(student);
		random(student);
	}
}
