package com.lj.www;

import java.util.Random;
import java.util.Scanner;

public class Second 
{

//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//        //һά����Ķ���
//		//c++ int a[5]
//		//java
//		int[] a;
//		a = new int[5];
//		//int[] a = new int[5];
//		//c++a.length();
//		//java������ĳ���
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
//  �������
	//1----��һ��һά�������������ͬѧ������
	public static void addStudent(String[] stu)
	{
		Scanner scan = new Scanner(System.in);
		for(int i =0;i<stu.length;i++)
			stu[i] = scan.next();
	}
	//2----��ӡ����ͬѧ����
    public static void printStudent(String[] stu)
    {
    	for(int i = 0;i<stu.length;i++)
    		System.out.print(stu[1]+"  ");
    	System.out.print("\n");
    }
	//3----�����ȡһ��ͬѧ
    public static void random(String[] stu)
    {
    	int index = new Random().nextInt(stu.length);
    	System.out.println("��ù������"+stu[index]);
    }
	//4----main�����ε�����������ʵ����Ӧ����
	public static void main(String[] args)
	{
		String[] student = new String[5];
		addStudent(student);
		printStudent(student);
		random(student);
	}
}
