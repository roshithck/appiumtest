package com.lifesum.utilities;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {
	
	// Start appium connection
	public static void  startAppiumConnection()
	{
        try
        {
		File app = new File("C:\\Tools\\LifeSum\\shapeupclub-google-release.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Nexus 5");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.sillens.shapeupclub");
        capabilities.setCapability("appActivity", ".MainActivity");
        System.out.println("Appium connection begining...");
        Global.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Appium connection successful!");
        }
        catch(Exception e)
        {
			Global.bAssertion = true;
			System.out.println("Failure in starting Appium. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
	}
	
	// Stop appium
	public static void stopAppiumConnection()
	{
		//Stopping connection
		System.out.println("Appium stopping...");
		Global.driver.quit();
		System.out.println("Appium stopped!");
	}
	
	public static void logout()
	{
		try
		{
		// Click on Menu
		List<AndroidElement> menuButton = Global.driver.findElementsByClassName("android.widget.ImageButton");
		menuButton.get(1).click();
		
		//Click on Settings
		Global.driver.findElement(By.name("Settings")).click();
		
		//Click on Personal details
		Global.driver.findElement(By.name("Personal Details")).click();
		
		//Get Personal details
		Utilities.getPersonalDetails();
		
		//Back to settings
		List<AndroidElement> backButton = Global.driver.findElementsByClassName("android.widget.ImageButton");
		backButton.get(0).click();
		
		//Swipe to bottom of the screen for logout
		Global.driver.scrollToExact("Log out");
		
		// Logout popup
		Global.driver.findElement(By.name("Log out")).click();
		
		Global.driver.findElement(By.name("OK")).click();
	}
		catch(Exception e)
		{
			Global.bAssertion = true;
			System.out.println("Failure while logout. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}

	}
	
	//Select a Sign-up
	public static void signUp(String signUpMode)
	{
		
		try
		{
		if(signUpMode.equalsIgnoreCase("Be Healthier"))
		{				
			Global.driver.findElement(By.name(signUpMode)).click();
		}
		else if ((signUpMode.equalsIgnoreCase("Lose Weight")))
		{
			Global.driver.findElement(By.name(signUpMode)).click();
		}
		else
		{
			Global.driver.findElement(By.name(signUpMode)).click();
		}
		}
		catch(Exception e)
		{
			Global.bAssertion = true;
			System.out.println("Failure in selecting Sign-up. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
		
	}
	
	// Set Date of Birth
	public static void setDOB()
	{
		try
		{
			Global.driver.findElementById("button_age").click();
			//List<AndroidElement> dateField = Global.driver.findElementsByClassName("android.widget.ViewAnimator");
			List<AndroidElement> dateField = Global.driver.findElementsByClassName("android.view.View");
			//dateField.get(0).sendKeys("02 August 1986");
			dateField.get(1).click();
			
			
	    	Global.driver.findElement(By.name("OK")).click();
		}
		catch(Exception e)
		{
			Global.bAssertion = true;
			System.out.println("Failure in setting DOB. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
	}
	
	// Select Gender
	public static void selectGender()
	{
		try
		{
			Global.driver.findElement(By.name("Male")).click();
			Global.driver.findElement(By.name("Continue")).click();
		}
		catch(Exception e)
		{
			Global.bAssertion = true;
			System.out.println("Failure in selecitng gender. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
	}
	
	// Enter height
	public static void enterHeight()
	{
		try
		{
			List<AndroidElement> heightField = Global.driver.findElementsByClassName("android.widget.EditText");
			heightField.get(0).sendKeys("170");
			
			//Click Continue
			Global.driver.findElement(By.name("Continue")).click();
		}
		catch(Exception e)
		{
			Global.bAssertion = true;
			System.out.println("Failure in entering height. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
	}
		
		// Enter weight
		public static void enterWeight(String sTrUnit,Integer intUnit)
		{
			try
			{
				Global.driver.findElementById("spinner_unit").click();
				List<AndroidElement> unitField = Global.driver.findElementsByClassName("android.widget.TextView");
				
				if(sTrUnit.equals("lbs"))
				{				
					unitField.get(1).click();
				}
				else if ((sTrUnit.equals("st/lbs")))
				{
					unitField.get(2).click();
				}
				else
				{
					unitField.get(0).click();
				}
					
								
				List<AndroidElement> weightField = Global.driver.findElementsByClassName("android.widget.EditText");
				weightField.get(0).sendKeys(Integer.toString(intUnit));
				
				//Click Continue		
				Global.driver.findElement(By.name("Continue")).click();
			}
			catch(Exception e)
			{
				Global.bAssertion = true;
				System.out.println("Failure in entering weight. Error message: "+e.getMessage());
				e.printStackTrace();
				assertFalse(Global.bAssertion);
			}
		}
		
		// Enter weightGoal
				public static void entermyGoalWeight(String sTrUnit,Integer intUnit)
				{
					try
					{
						Global.driver.findElementById("spinner_unit").click();
						List<AndroidElement> unitField = Global.driver.findElementsByClassName("android.widget.TextView");
						
						if(sTrUnit.equals("lbs"))
						{				
							unitField.get(1).click();
						}
						else if ((sTrUnit.equals("st/lbs")))
						{
							unitField.get(2).click();
						}
						else
						{
							unitField.get(0).click();
						}
									
						List<AndroidElement> weightField = Global.driver.findElementsByClassName("android.widget.EditText");
						weightField.get(0).sendKeys(Integer.toString(intUnit));
						
						//Click Continue
						Global.driver.findElement(By.name("Continue")).click();
					}
					catch(Exception e)
					{
						Global.bAssertion = true;
						System.out.println("Failure in entering goal weight. Error message: "+e.getMessage());
						e.printStackTrace();
						assertFalse(Global.bAssertion);
					}
				}
				
		
				// My plan
				public static void myPlan()
				{
					try
					{
						//for now only continue	
						Global.driver.findElement(By.name("Continue")).click();
					}
					catch(Exception e)
					{
						Global.bAssertion = true;
						System.out.println("Failure in entering weight. Error message: "+e.getMessage());
						e.printStackTrace();
						assertFalse(Global.bAssertion);
					}
				}
				
		// select food 
		public static void selectFood()
		{
			try
			{
				//List<AndroidElement> selectFood = driver.findElementsByClassName("android.view.View");
				//selectFood.get(2).click();
				
				//Skip food
				Global.driver.findElement(By.name("Skip")).click();
			}
			catch(Exception e)
			{
				Global.bAssertion = true;
				System.out.println("Failure in selecting food. Error message: "+e.getMessage());
				e.printStackTrace();
				assertFalse(Global.bAssertion);
			}
		}
		
		
		// Wait
		public static void implicitWait()
		{
			try
			{
				Global.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			catch(Exception e)
			{
				Global.bAssertion = true;
				Global.gErrMsg = e.getMessage();
				System.out.println("Failure during wait. Error message: "+e.getMessage());
				e.printStackTrace();
				assertFalse(Global.bAssertion);
			}
		}

		//My goal calories values
		public static String myGoalCalories()
		{
			String myGoalCal;

			Global.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<AndroidElement> calVal = Global.driver.findElementsByClassName("android.widget.TextView");
			myGoalCal=calVal.get(2).getText();

			System.out.println("Goal calories: "+myGoalCal);

			return myGoalCal;
		}	
		
		//My plan calories values
		public static String myPlanCalories()
		{
			String myPlanCal;
					
			myPlanCal=Global.driver.findElementById("textview_calories").getText();
			
			myPlanCal = myPlanCal.split(" ")[0];

			System.out.println("Plan calories: "+myPlanCal);			
			
			return myPlanCal;
			
		}	
		
		// Compare Plan Vs Goal calories value
		public static void compareCalories(String myPlan,String myGoal)
		{
			if (myPlan.equalsIgnoreCase(myGoal))
			{	
				System.out.println("Calories comparison passed");
			}	
			else
			{
				System.out.println("Calories comparison failed");
				Global.bAssertion = true;
				//Mark result
			}
		}	

		//Get values from Personal details page
		public static void getPersonalDetails()
		{
				
			Global.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<AndroidElement> perDetails = Global.driver.findElementsByClassName("android.widget.TextView");
			Global.goalWeight=perDetails.get(2).getText();
			Global.currentWeight = perDetails.get(4).getText();
			Global.caloriePerDay= perDetails.get(8).getText();
			Global.height = perDetails.get(10).getText();
			Global.dob= perDetails.get(12).getText();
			Global.gender= perDetails.get(14).getText();
			
			System.out.println("-----------------");
			System.out.println("Personal Details..");
			System.out.println("-----------------");
			System.out.println("Goal Weight: "+Global.goalWeight);
			System.out.println("Current Weight: "+Global.currentWeight);
			System.out.println("Calorie Per Day: "+Global.caloriePerDay);
			System.out.println("Height: "+Global.height);
			System.out.println("Date of Birth: "+Global.dob);
			System.out.println("Gender: "+Global.gender);
			System.out.println("-----------------");
		}
		
		//Verify Personal data (For now, only Current weight and Goal weight)
		public static void verifyPersonalDetails()
		{
	
			if (Global.setCurrentWeight.equalsIgnoreCase((Global.currentWeight).split(" ")[0]))
			{
				System.out.println("Weight entered and information in Personal details screen matches");
			}
			else
			{
				Global.bAssertion = true;
				System.out.println("Weight entered and information in Personal details screen DOES NOT match");
				System.out.println("-----------------------------------");
				System.out.println("Current Weight                   Goal weight");
				System.out.println(Global.setCurrentWeight+"         "+Global.currentWeight);
				System.out.println("-----------------------------------");
			}
			
			
			if (Global.setGoalWeight.equalsIgnoreCase(Global.goalWeight.split(" ")[0]))
			{
				System.out.println("Goal weight entered and information in Personal details screen matches");
			}
			else
			{
				Global.bAssertion = true;
				System.out.println("Goal weight entered and information in Personal details screen DOES NOT match");
				System.out.println("-----------------------------------");
				System.out.println("Goal Weight Entered                  Goal weight");
				System.out.println(Global.setGoalWeight+"         "+Global.goalWeight);
				System.out.println("-----------------------------------");
			}
			
		}
}
