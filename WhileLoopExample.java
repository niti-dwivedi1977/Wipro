package com.wipro.basics;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// break keyword	
		//for(i=1;i<=3;i++)
int i = 1;
while(i <= 3) // three times
{  
	//for(j=1 ; j<=3 ; j++)
	int j=1;  // inner loop
	while(j <=3)   // when i =3 j will continue from 1 to 3
	{
	
	System.out.println("i : " + i + " , j: " + j);
	j++;
	
	}
	i++;
}
		
	}

}
