package com.exampe.Training;

import java.util.Scanner;

public class LoopTraining {
	public static int r=4;
	public static int c=4;
	public static char val[][]= new char[r][c];
	public static char res[][]= new char[r][c];
	public static int rw;
	static Scanner inp= new Scanner(System.in);
	public static void main (String[] arg){
		rw=r;
		
		getValue(rw,c);
		show(rw,c);
//		char s=doProcess('x','0');
//		System.out.println("s="+s);
		doCalculation(rw,c);
//		show(rw,c);
	}

	public static void getValue(int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++)
			{
				val[i][j]=(inp.next()).charAt(0);
			}
		}

	}
	static void show(int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++)
			{
				System.out.print(val[i][j]);
				System.out.print('\t');
			}
			System.out.println("\n");
		}
	}
	static void doCalculation(int row, int column){
		rw=row;
		for(int k=0;k<=rw;k++)
		{
			for(int i=0;i<rw-1;i++){
				for(int j=0;j<column;j++){
					System.out.println("v1="+val[i][j]+"v2="+val[i+1][j]+"\n res="+doProcess(val[i][j],val[i+1][j]));
					res[i][j]=doProcess(val[i][j],val[i+1][j]);

				}

			}
			rw--;
	

			for(int i=0;i<rw ;i++ ){
				for(int j=0;j<column;j++){
					val[i][j]=res[i][j];
					
				}
			}
			show(rw,column);
		}
		
	}
	public static char doProcess(char s1,char s2)
	{
		char z =0;
		if(s1=='1'){
			if(s2=='1'){
				z='x';
			}else if(s2=='0'){
				z='1';
			}else if(s2=='x'){
				z='1';
			}
		}else if(s1=='0'){
			if(s2=='1'){
				z='0';
			}else if(s2=='0'){
				z='x';
			}else if(s2=='x'){
				z='0';
			}
		}else if(s1=='x'){
			if(s2=='1'){
				z='x';
			}else if(s2=='0'){
				z='x';
			}else if(s2=='x'){
				z='1';
			}
			for(int i=0;i<3;i++){

			}


		}
		return z;


	}
	



}
