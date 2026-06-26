package gc;

import java.util.Scanner;

public class gradecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("No. of Subjects?");
		int subjs=sc.nextInt();
		int marks[]= new int[subjs];
		int Tmarks=0;
		for(int i=0;i<subjs;i++)
		{
			System.out.print("Subject "+(i+1)+" Mark :");
			marks[i]=sc.nextInt();
			Tmarks+=marks[i];
		}
		double AvgPerc=Tmarks/subjs;
		String grade;
		if(AvgPerc>=90)
		{
			grade="0";
		}
		else if(AvgPerc>=80)
		{
			grade="A+";
		}
		else if(AvgPerc>=70)
		{
			grade="A";
		}
		else if(AvgPerc>=60)
		{
			grade="B+";
		}
		else if(AvgPerc>=50)
		{
			grade="B";
		}
		else
		{
			grade="Fail!";
		}
		System.out.println("Final Grade After Calculation");
		System.out.println("Total Marks :"+Tmarks);
		System.out.println("Average Percentage :"+AvgPerc);
		System.out.println("Overall Grade :"+grade);
		sc.close();
	}

}
