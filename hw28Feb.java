package hw_oop;

import java.util.Scanner;

public class hw28Feb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		numoduno(3,12);
		sumOfDigit(12345);
		sumEvenOdd(5);
		armStrong();
		primeNumbers();
		primeFactors(8);
		
	}
	
	public static void numoduno(int num,int den) {
	
	int a,b,gcd,t;
	
	if(num>den) {   
		a=num;
		b=den;
	}else {
		b=num;
		a=den;
	}
	while(b != 0) {
		t=b;
		b=a%b;
		a=t;    
	}
	gcd=a;
	
	System.out.println("In Lowest form = "+num/gcd+"/"+den/gcd);
	
}
	
	
	public static void sumOfDigit(int num) {
	int sum = 0;
    while(num != 0) {

        sum = sum+num % 10;    
        num = num/10;
    }

    System.out.println("Sum of all digits in : " + sum);
}
	
	
	public static void sumEvenOdd(int n) {
	int sumE = 0, sumO = 0;
	
   
    for(int i = 0; i <= n; i++)
    {
        if(i % 2 == 0)
        {
            sumE = sumE + i;
        }
        else
        {
            sumO = sumO + i;
        }
    }
    System.out.println("Sum of Even Numbers:"+sumE+" ");
    System.out.println("Sum of Odd Numbers:"+sumO+" ");
}
	
	
	
	public static void armStrong() {
		
	System.out.println("ArmStrong Numbers are :");	
	for(int i=1;i<=500;i++){
	      int sum = 0;
	      int t = i;
	      while(t!=0){
	        sum = sum+((t%10)*(t%10)*(t%10));
	        t = t/10;
	      } 
	      if(sum==i){
	    	 
	        System.out.println(i);
	      }
	    }
}
	
	
	public static void primeNumbers() {
    int num =0;
    
    String  primeNumbers = "";

    for (int i = 1; i <= 100; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
	  
    }	
    System.out.println("Prime numbers from 1 to 100 are :");
    System.out.println(primeNumbers);
	}


	
	
	
	public static void primeFactors(int x) {


    System.out.println("Prime factors of "+x+" are:");

    for(int i=2;i<=x;i++){
      //checking for factor
      if(x%i==0){
        //checking if i is prime or not
        int p = 0;
        for(int j=2;j<i;j++){
          if(i%j==0){
            //i is not prime
            p++;
            break;
          }
        }
        if(p==0){
          //if p is 0
          //then i is prime
          System.out.println(i);
        }
      }
    }
	}
	}

      
    