package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int numberOFcategories = keyboard.nextInt();
		 String ITEMname[] = new String[numberOFcategories];
		 double ITEMprice[] = new double[numberOFcategories];
		 double avg=0;
		
	for (int i = 0; i < numberOFcategories; i++)	
	{
			ITEMname[i] = keyboard.next();
			ITEMprice[i] = keyboard.nextDouble();

	}
	 int numberOFcustomer = keyboard.nextInt();
	 String LASTname[] = new String[numberOFcustomer];
	 String FIRSTname[] = new String[numberOFcustomer];
	 double[] a = new double[numberOFcustomer];
	for (int q = 0; q < numberOFcustomer; q++) 
	{
		 LASTname[q] = keyboard.next();
		 FIRSTname[q] = keyboard.next();
	
		
		 int Total = 0; 
		// double avg=0;
			
	 int numberOFcategoriesFOReach = keyboard.nextInt();
	 int ITEMnumber[] = new int[numberOFcategoriesFOReach];
	 String ITEMnameFOReach[] = new String[numberOFcategoriesFOReach];
	 for (int z=0; z < numberOFcategoriesFOReach; z ++) 
	 {
		 ITEMnumber[z] = keyboard.nextInt();
		 ITEMnameFOReach[z] = keyboard.next();
	 }
	 for (int n = 0; n<numberOFcategories;n++) {
		 for (int w=0; w < numberOFcategoriesFOReach; w++) 
		 {
			 if (ITEMname[n].equals(ITEMnameFOReach[w])) 
			 {
				Total += ITEMnumber[w];
					
				}
			 Total += Total;
			 Total= Total/2;
			 }
			// System.out.print(Total);
		 
				 } System.out.print(Total);
				 
	}
	//System.out.print(Total);
	}
	}
