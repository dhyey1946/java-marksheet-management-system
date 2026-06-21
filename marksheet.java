import java.util.Scanner;
class marksheet
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\u001B[3m"+"\u001B[7m"+"\u001B[31;1m"+"====================================================");
		//Initial Step
		System.out.println("====== WELCOME TO MARKSHEET GENERATION SYSTEM ======");
		System.out.println("====================================================");
		System.out.println("\u001B[0m");
		System.out.println();
		boolean q = true;
		//input of no. of students
		System.out.print("\u001B[1;1m"+"How Many Students You Want To Add : ");
		int n = sc.nextInt();
		Student[] a = new Student[n];
		for(int i=0; i<a.length; i++)
		{
			a[i] = new Student();
			System.out.println();
			//student data
			System.out.println("\u001B[5;1m"+"\u001B[7;1m"+"\u001B[4;1m"+"----------Enter Student "+(i+1)+" Data----------");
			System.out.print("\u001B[0m");
			//calling methods
			a[i].setname();
			a[i].setenroll();
			a[i].setdep();
			a[i].setbranch();
			a[i].setdiv();
			a[i].setroll();
			a[i].setmark();
			a[i].cal();
			a[i].setgrade();

		}
		System.out.println();
		System.out.println("\u001B[5;1m"+"\u001B[1;1m"+"All Details Taken Successfully. ");
		System.out.println();
		System.out.print("\u001B[0m");
		while(q)
		{
			//options
			System.out.println("\u001B[1;1m"+"Press 1 For Marksheet Generation Of Students");
			System.out.println("Press 2 For EXIT");
			int choice = sc.nextInt();
			System.out.print("\u001B[0m");
				if(choice==1)
				{
					boolean qq = true;
					while(qq)
					{
					System.out.print("\u001B[1;1m"+"Enter Enrollment No. Of Student : ");
					long enroll = sc.nextLong();
					System.out.print("\u001B[0m");
					for(int i = 0; i<a.length; i++)
					{
						if(enroll==a[i].er)
						{
							//marksheet printing
							System.out.println("\u001B[31;1m"+"\n\n=========================================================");
							System.out.println("=======================SEMESTER-I========================");
							System.out.println("=========================================================");
							System.out.println("NAME           : "+a[i].Name);
							System.out.println("ENROLLMENT NO. : "+a[i].er);
							System.out.println("DEPARTMENT     : "+a[i].dep);
							System.out.println("BRANCH         : "+a[i].branch);
							System.out.println("DIVISION       : "+a[i].div);
							System.out.println("ROLL NO.       : "+a[i].r);
							System.out.println("\u001B[33;1m"+"\u001B[21m"+"---------------------------------------------------------");
							System.out.println("   Subjects   | Total Marks | Obtained Marks |   Grade   ");
							System.out.println("---------------------------------------------------------");
							System.out.println("    JAVA      |     100     |       "+a[i].j+"       |     "+a[i].jgrade);
							System.out.println("   PHYSICS    |     100     |       "+a[i].p+"       |     "+a[i].pgrade);
							System.out.println("    MATHS     |     100     |       "+a[i].m+"       |     "+a[i].mgrade);
							System.out.println("     SE       |     100     |       "+a[i].s+"       |     "+a[i].sgrade);
							System.out.println("     ES       |     100     |       "+a[i].e+"       |     "+a[i].egrade);
							System.out.println("---------------------------------------------------------");
							System.out.println("    TOTAL     |     500     |      "+a[i].total);
							System.out.println("\u001B[0m");
							System.out.println();
							System.out.println("\u001B[33;1m"+"    PERCENTAGE       : " + a[i].per);
							System.out.println("   OVERALL GRADE     : " + a[i].pergrade);
							System.out.println("     RESULT          : " + a[i].result);
							System.out.print("\u001B[0m");
							qq=false;
							break;
						}
						else if(i==a.length-1)
						{
							System.out.println("\n\u001B[3m"+"\u001B[31;1m"+"Enrollment No. Not Found,Please ReEnter Valid No.");
							System.out.print("\u001B[0m");
							break;
						}
					}
					}
				}
				else if(choice==2)
				{
				q=false;
				System.out.println("\u001B[7;1m"+"\u001B[5;1m"+"---------THANK YOU----------");
				System.out.print("\u001B[0m");
				break;
				}
				else
				{
					System.out.println("Enter Only 1 Or 2");
				}
		}
	}
}

class Student
{
	Scanner sc = new Scanner(System.in);
	String Name, dep, branch, div;
	int r, j, s, m, e, p;
	long er;
	String jgrade,pgrade,mgrade,sgrade,egrade,pergrade;
	int total;
	double per;
	String result = "PASS";
	//Method to call name
	void setname()
	{
		System.out.print("\n"+"\u001B[36;1m"+"Enter First Name  : ");
		System.out.print("\u001B[3m"+"\u001B[32;1m");
		String fn = sc.next();
		System.out.print("\u001B[0m");
		System.out.print("\u001B[36;1m"+"Enter Middle Name : ");
		System.out.print("\u001B[3m"+"\u001B[32;1m");
		String mn = sc.next();
		System.out.print("\u001B[0m");
		System.out.print("\u001B[36;1m"+"Enter Last Name   : ");
		System.out.print("\u001B[3m"+"\u001B[32;1m");
		String ln = sc.next();
		System.out.print("\u001B[0m");
		Name = fn+" "+mn+" "+ln;
	}
	//Method to enter enrollment no.
	void setenroll()
	{
		System.out.print("\u001B[36;1m"+"Enter Enrollment No. : ");
		System.out.print("\u001B[32;1m");
		er = sc.nextLong();
		System.out.print("\u001B[0m");
	}
	//Method to enter department
	void setdep()
	{
		System.out.print("\u001B[36;1m"+"Enter Department(FY1/FY2/FY3/FY4/FY5) : ");
	    System.out.print("\u001B[3m"+"\u001B[32;1m");
		dep = sc.next();
		System.out.print("\u001B[0m");
	}
	//Method to enter branch
	void setbranch()
	{	
		System.out.print("\u001B[36;1m"+"Enter Branch Name : ");
		System.out.print("\u001B[3m"+"\u001B[32;1m");
		branch = sc.next();
		System.out.print("\u001B[0m");
	}
    //Method to enter division	
	void setdiv()
	{
		System.out.print("\u001B[36;1m"+"Enter Division In Semester 1 : ");  
		System.out.print("\u001B[3m"+"\u001B[32;1m");
		div = sc.next();
		System.out.print("\u001B[0m");
	}
	//method to enter roll no.
	void setroll()
	{
		boolean rn = true;
		while(rn)
		{
			System.out.print("\u001B[36;1m"+"Enter Roll No. in Semester 1 : ");
			System.out.print("\u001B[32;1m");
			r = sc.nextInt();
			System.out.print("\u001B[0m");
			
			if(r>=1 && r<=1060)
			{
				rn = false;
			}
			else
			{
				System.out.println("\u001B[3m"+"\u001B[31;1m"+"Please Enter Valid Roll No.");
				System.out.print("\u001B[0m");
			}
		}
	}
	//method to enter marks of all subjects
	void setmark()
	{
		boolean bb = true;
		boolean cc = true;
		boolean dd = true;
		boolean ee = true;
		boolean ff = true;
		System.out.println();
		System.out.println("\u001B[5;1m"+"\u001B[7;1m"+"\u001B[4;1m"+"Enter Marks Out Of 100 For All The Respective Subjects");
		System.out.print("\u001B[0m");
		System.out.println();
		while(bb)
		{
			System.out.print("\u001B[36;1m"+"Enter Marks Of JAVA : ");
			System.out.print("\u001B[32;1m");
			j=sc.nextInt();
			System.out.print("\u001B[0m");
			if(j>=0 && j<=100)
			{
				bb=false;
			}
			else 
			{
				System.out.println("\u001B[31;1m"+"Please ReEnter Valid Marks.");
				System.out.print("\u001B[0m");
				System.out.println();
			}
		}
		while(cc)
		{
			System.out.print("\u001B[36;1m"+"Enter Marks Of Physics : ");
			System.out.print("\u001B[32;1m");
			p=sc.nextInt();
			System.out.print("\u001B[0m");
			if(p>=0 && p<=100)
			{
				cc=false;
			}
			else 
			{
				System.out.println("\u001B[31;1m"+"Please ReEnter Valid Marks.");
				System.out.print("\u001B[0m");
				System.out.println();
			}	
		}
		while(dd)
		{	
			System.out.print("\u001B[36;1m"+"Enter Marks Of Maths : ");
			System.out.print("\u001B[32;1m");
			m=sc.nextInt();
			System.out.print("\u001B[0m");
			if(m>=0 && m<=100)
			{
				dd=false;
			}
			else 
			{
				System.out.println("\u001B[31;1m"+"Please ReEnter Valid Marks.");
				System.out.print("\u001B[0m");
				System.out.println();
			}
		}
		while(ee)
		{	
			System.out.print("\u001B[36;1m"+"Enter Marks Of SE : ");
			System.out.print("\u001B[32;1m");
			s=sc.nextInt();
			System.out.print("\u001B[0m");
			if(s>=0 && s<=100)
			{
				ee=false;
			}
			else 
			{
				System.out.println("\u001B[31;1m"+"Please ReEnter Valid Marks.");
				System.out.print("\u001B[0m");
				System.out.println();
			}
		}
		while(ff)
		{
			System.out.print("\u001B[36;1m"+"Enter Marks Of ES : ");
			System.out.print("\u001B[32;1m");
			e=sc.nextInt();
			System.out.print("\u001B[0m");
			if(e>=0 && e<=100)
			{
				ff=false;
			}
			else 
			{
				System.out.println("\u001B[31;1m"+"Please ReEnter Valid Marks.");
				System.out.print("\u001B[0m");
				System.out.println();
			}
		}
	}
	//calculation method
	void cal()
	{
		total=j+p+m+s+e;
		per=total/5;
	}
	//method to set grades according to marks
	void setgrade()
	{
		if(j>90)
			jgrade="A";
		else if(j>80 && j<=90)
			jgrade="B";
		else if(j>70 && j<=80)
			jgrade="C";
		else if(j>60 && j<=70)
			jgrade="D";
		else if(j<=60 && j>33)
			jgrade="E";
		else 
		{
			jgrade="F";
			result="FAIL";
		}
		
		if(p>90)
			pgrade="A";
		else if(p>80 && p<=90)
			pgrade="B";
		else if(p>70 && p<=80)
			pgrade="C";
		else if(p>60 && p<=70)
			pgrade="D";
		else if(p<=60 && p>33)
			pgrade="E";
		else 
		{
			pgrade="F";
			result="FAIL";
		}
		
		if(m>90)
			mgrade="A";
		else if(m>80 && m<=90)
			mgrade="B";
		else if(m>70 && m<=80)
			mgrade="C";
		else if(m>60 && m<=70)
			mgrade="D";
		else if(m<=60 && m>33)
			mgrade="E";
		else 
		{
			mgrade="F";
			result="FAIL";
		}
		
		if(s>90)
			sgrade="A";
		else if(s>80 && s<=90)
			sgrade="B";
		else if(s>70 && s<=80)
			sgrade="C";
		else if(s>60 && s<=70)
			sgrade="D";
		else if(s<=60 && s>33)
			sgrade="E";
		else 
		{
			sgrade="F";
			result="FAIL";
		}
		
		if(e>90)
			egrade="A";
		else if(e>80 && e<=90)
			egrade="B";
		else if(e>70 && e<=80)
			egrade="C";
		else if(e>60 && e<=70)
			egrade="D";
		else if(e<=60 && e>33)
			egrade="E";
		else 
		{
			egrade="F";
			result="FAIL";
		}
		
		if(per>90)
			pergrade="A";
		else if(per>80 && per<=90)
			pergrade="B";
		else if(per>70 && per<=80)
			pergrade="C";
		else if(per>60 && per<=70)
			pergrade="D";
		else if(per<=60 && per>33)
			pergrade="E";
		else 
		{
			pergrade="F";
			result="FAIL";
		}
	}
}
