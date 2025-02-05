package com;

import java.util.ArrayList;

public class Travel {
	public boolean isCarDriver(Driver drivertype)
	{
		if(drivertype.getCategory().equalsIgnoreCase("Car"))
		{
			return true;
		}
		return false;
	}
	
	public String retrivebyDriverId(ArrayList<Driver> driverlist,int DriverId)
	{
		int flag=0;
		Driver collectedResult=null;
		for(Driver values:driverlist)
		{
			if(values.getDriverId()==DriverId)
			{
				flag=1;
				collectedResult=values;
			}
		}
		
	if(collectedResult!=null)
	    return "Driver Name "+collectedResult.getDriverName()+ " Belonging to the category "+collectedResult.getCategory() +" travelled "+collectedResult.getDistanceTravelled()+" KM so far.";
	else
		return "No Data Found for given Driver ID";
		
		
	}
	
	
	public int retriveCountofDriver(ArrayList<Driver> totaldrivers,String category)
	{
		int countofDrivers=0;
		for(Driver values:totaldrivers)
		{
			if(category.equalsIgnoreCase(values.getCategory()))
			{
				countofDrivers++;
			}
		}
		return countofDrivers;
	}
		
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> listofDrivers,String DriverCategory){
		ArrayList<Driver> collectedDriverResults=new ArrayList<>();
		for(Driver values:listofDrivers)
		{
			if(DriverCategory.equalsIgnoreCase(values.getCategory()))
			{
				collectedDriverResults.add(values);
			}
		}
		return collectedDriverResults;
		
		
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers)
	{
		double max=Double.MIN_VALUE;
		Driver finalResult=null;
		for(Driver values:drivers)
		{
			if(max<values.getDistanceTravelled())
			{
				max=values.getDistanceTravelled();
				finalResult=values;
			}
		}
		return finalResult;
		
	}

}
