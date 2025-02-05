package com;
import java.util.*;
public class TestDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Driver Details you want to add:");
		int n=sc.nextInt();
		ArrayList<Driver> driverDetails=new ArrayList<>();
		Travel travelDetails=new Travel();
		
		//Intializing the values in the ArrayList
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the DriverID:");
			int DriverId=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the DriverName:");
			String DriverName=sc.nextLine();
			System.out.print("Enter the Category:(Auto/Car/Lorry)-");
			String Category=sc.nextLine();
			System.out.print("Enter the DistanceTravlled:");
			double distanceTravelled=sc.nextDouble();
			driverDetails.add(new Driver(DriverId,DriverName,Category,distanceTravelled));
		}
		
		System.out.println("Press the Number from 0 to 9 to check for the Car Type:");
		int num=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the DriverID to get the Details: ");
		int searchID=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Category to Count that Drivers:");
		String SearchCategoryTocount=sc.nextLine();
		
		System.out.println("The Results of the all Operations");
		
		//Implementation for the driver details are belongs to Car Category or not
		Driver carType=driverDetails.get(num);
		boolean iscarDriver=travelDetails.isCarDriver(carType);
		System.out.println(iscarDriver);
		
		
		//Implementation to Retrive the Driver Details by DriverID
		String retrivebyDriverId=travelDetails.retrivebyDriverId(driverDetails,searchID);
		System.out.println(retrivebyDriverId);
		
		//Implementation for the Count of Drivers in the Given Category
		int countOfDrivers=travelDetails.retriveCountofDriver(driverDetails, SearchCategoryTocount);
		System.out.println(countOfDrivers>0?"Total Number of Drivers in that Category:"+countOfDrivers:"No Data Found in that Category");
		
		
		//Implementation for the Driver Details in the Given Category
		ArrayList<Driver> resultOfRetrivedDrivers=travelDetails.retriveDriver(driverDetails,SearchCategoryTocount);
		if(resultOfRetrivedDrivers!=null) {
			System.out.println("Retrived details in "+SearchCategoryTocount+"->");
				for(Driver value:resultOfRetrivedDrivers)
				{
					System.out.println(value);
				}
		}else {
			System.out.println("No Data Found with that Category");
		}
		
		//Implementation for the Maximum Travelled Distance of Driver Details
		Driver maxTravelledDriver=travelDetails.retriveMaximumDistanceTravelledDriver(driverDetails);
		System.out.println(maxTravelledDriver);
		
		sc.close();
		
		
		
		
		

	}

}
