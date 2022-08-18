package com.build.test.maven.java.PersonManagementApp;

import java.util.*;
class Person implements Comparable<Person>
{
	int Pid;
	String name;
	int age;
	int P_amount;
	
	Person(int Pid,String name,int age,int P_amount) {
		this.Pid = Pid;
		this.name = name;
		this.age = age;
		this.P_amount = P_amount;
	}

	public void setP_amount(int Pid)
	{
		this.P_amount=Pid;
	}
	
	public int compareTo(Person st)
	{
		if(name==st.name)
			return 0;
		else if(name.compareTo(st.name)>0)
			return 1;
		else
			return -1;
	}
}


public class App 
{
    public static void main(String[] args)
    {
       ArrayList<Person> al=new ArrayList<Person>();
       al.add(new Person(101,"vijay",22,2000));
       al.add(new Person(102,"Rajesh",25,4000));
       al.add(new Person(103,"Ram",28,1000));
       al.add(new Person(104,"Anuj",20,5000));
       al.add(new Person(105,"Aaradanaa",21,3000));
       al.add(new Person(107,"Preethi",22,500));
       al.add(new Person(108,"varun",30,2000));
       al.add(new Person(109,"Gagan",38,2500));
       al.add(new Person(110,"satvik",19,3000));
       al.add(new Person(111,"yama",33,7000));
       
       int len=al.size();
       Scanner sc=new Scanner(System.in);
       String whilechoice="go";
       while(whilechoice=="go") {
    	   String avail="False";
    	   System.out.println("Enter your choice");
    	   System.out.println("1->Customer Data in Ascending order. 2->Update the new Purchasing amount");
    	   
    	   System.out.println(" ");
    	   int a=sc.nextInt();
    	   
    	   switch(a)
    	   {
    		   case 1:System.out.println(" ");
    		           System.out.println("Person Data in Ascending order");
    		           System.out.println("Person Pid name age purchase_amount");
    		           
    		           Collections.sort(al);
    		           for(Person st:al) {
    		        	   System.out.println(st.Pid+" "+st.name+" "+st.age+" "+st.P_amount);
    		           }
    		           break;
    		        	   
    		   case 2: System.out.println(" ");
    		           System.out.println("Enter Person Pid to update Purchase_amount");
    		           
    		           int b=sc.nextInt();
    		           System.out.println("Enter the purchase amount");
                       int c=sc.nextInt();
                       
                       for(int i=0;i<len;i++) {
                    	   if(al.get(i).Pid==b) {
                    		   al.get(i).setP_amount(c);
                    		   avail="True";
                    		   System.out.println("update Purchase amount"+al.get(i).Pid+" "+al.get(i).name+" "+al.get(i).P_amount+" "+al.get(i).age);
                    	   }}
                              if("False".equals(avail)) {
                            	  System.out.println("invalid Person id");
                            	  break;
                    	   }
    		        	   
    		           }
    	   }
       }
}
