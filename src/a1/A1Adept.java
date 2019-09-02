package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
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
	
		
		 double Total = 0; 
		// double avg=0;
			
	 int numberOFcategoriesFOReach = keyboard.nextInt();
	 int ITEMnumber[] = new int[numberOFcategoriesFOReach];
	 String ITEMnameFOReach[] = new String[numberOFcategoriesFOReach];
	 for (int z=0; z < numberOFcategoriesFOReach; z ++) 
	 {
		 ITEMnumber[z] = keyboard.nextInt();
		 ITEMnameFOReach[z] = keyboard.next();
		
		 for (int w=0; w < numberOFcategories; w++) 
		 {
			 if (ITEMnameFOReach[z].equals(ITEMname[w])) 
			 {
				Total += ITEMprice[w]*ITEMnumber[z];
					
				}
			
			 }
		
				 }Total += Total;
				 Total= Total/2;
				 a[q] = Total;
					

	// System.out.print( FIRSTname[q] + LASTname[q]);
	// System.out.print(Total);
	// avg = avg + Total;
	
	 avg = avg + Total;
		
		}	double min = findmin(a);
		double max = findmax(a);
		int maxname = findmaxname(a,0);
		int minname = findminname(a,0);
		System.out.println("Biggest: "  + LASTname[maxname]+" "+FIRSTname[maxname]+ " ("+String.format("%.2f",max)+")");
		System.out.println("Smallest: "  +LASTname[minname]+" "+FIRSTname[minname] +" ("+ String.format("%.2f",min)+")");
		//System.out.println("Biggest: " + String.format("%.2f",max));
		System.out.println("Average: "+String.format("%.2f",avg/numberOFcustomer));
		 
		//avg = avg /numberOFcustomer;
		//System.out.print("Average: "+avg/numberOFcustomer);
	}


	static double findmax(double a[]) {
			
			int length = a.length;
			double max= a[0];
			for (int i=0; i<a.length; i++) {
				if (max< a[i]) {
					max=a[i];
					
				}
			}
			
			return max;}
	static int findmaxname(double a[], int z) {
		
		int length = a.length;
		double max= a[0];
		for (int i=0; i<a.length; i++) {
			if (max< a[i]) {
				max=a[i];
				 z=i;
			}
		}
		
		return z;}	static int findminname(double a[], int z) {
			
			int length = a.length;
			double max= a[0];
			for (int i=0; i<a.length; i++) {
				if (max> a[i]) {
					max=a[i];
					 z=i;
					
				}
			}
			
			return z;}
		
			static double findmin(double a[]) {
				
				int length = a.length;
				double min= a[0];
				for (int i=0; i<a.length; i++) {
					if (min> a[i]) {
						min=a[i];
					}
				}
				
				return min;

		}
			
		}

	
	







	
	
	

