package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner keyboard = new Scanner(System.in);
		 int numberOFcustomer = keyboard.nextInt();
		 String LASTname[] = new String[numberOFcustomer];
		 String FIRSTname[] = new String[numberOFcustomer];
		 for ( int i = 0; i < numberOFcustomer; i++) 
		 {
			 LASTname[i] = keyboard.next();
			 FIRSTname[i] = keyboard.next();
			 System.out.println();
			// System.out.println(LASTname[i] + "  " + FIRSTname[i]);
			 int numberOFcategories = keyboard.nextInt();
			 double ITEMprice[] = new double[numberOFcategories];
			 String ITEMname[] = new String[numberOFcategories];
			 int ITEMnumber[] = new int[numberOFcategories];
			 double Total = 0;
		 		for (int q = 0; q < numberOFcategories; q++) 
		 		{
		 			ITEMnumber[q] = keyboard.nextInt();
		 			ITEMname[q] = keyboard.next();
		 			ITEMprice[q] = keyboard.nextDouble();
		 			Total += ITEMprice[q] * ITEMnumber[q];
		 		}
		 System.out.print(LASTname[i].substring(0,1) + ". "
		 		+ FIRSTname[i]+": " + String.format("%.2f", Total));
		  }	
	}
}


		 	
		 				
		// System.out.print(LASTname[i].substring(0,1) + ". "
		 //		+ FIRSTname[i]+": " + String.format("%.2f", Total));
		  
	


