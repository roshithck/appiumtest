package com.lifesum.testsuite;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.lifesum.utilities.Global;
import com.lifesum.utilities.Utilities;
import com.thoughtworks.selenium.Wait;

import java.lang.Character;

public class AppTest extends TestCase {
	
	public AppTest (String testName)
	{
		super(testName);
	}

    @Before
    public void setUp() throws Exception {
        
    	// Set up appium connection
    	Utilities.startAppiumConnection();
    }

    @After
    public void tearDown() throws Exception {
    	
    	//Stop appium connection;
    	Utilities.stopAppiumConnection();
    }

   //Test : Be Healthier sign on for Pound
    @Test
    public void beHealtier_lbs_01(){
    	
    	//Reset test result
    	Global.bAssertion = false;
    	
    	try{
    		   
    	Utilities.signUp("Be Healthier");
  
		//Select Date of birth
    	Utilities.setDOB();
		
        //Select Gender
    	Utilities.selectGender();
    	
		// Provide Height details
    	Utilities.enterHeight();

		// Provide weight details
    	Utilities.enterWeight("lbs",75);
		
		//Wait for page
		Utilities.implicitWait();
		
		// Select food details
		Utilities.selectFood();

		//Wait for page
		Utilities.implicitWait();
				
		//Logout from App
		Utilities.logout();
	
    	}
		catch (Exception e){
			Global.bAssertion = true;
			System.out.println("Failure in Be Healthier sign up. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
		
    }
    
    ////Be Healthier sign on for Kg
    @Test
    public void beHealtier_kg_02(){
    	
    	//Reset test result
    	Global.bAssertion = false;
    	
    	try{
    		   
    	Utilities.signUp("Be Healthier");
  
		//Select Date of birth
    	Utilities.setDOB();
		
      //Select Gender
    	Utilities.selectGender();
    	
		// Provide Height details
    	Utilities.enterHeight();

		// Provide weight details
    	Utilities.enterWeight("kg",75);
		
		//Wait for page
		Utilities.implicitWait();
		
		// Select food details
		Utilities.selectFood();

		//Wait for page
		Utilities.implicitWait();
				
		//Logout from App
		Utilities.logout();
	
    	}
		catch (Exception e){
			Global.bAssertion = true;
			System.out.println("Failure in Be Healthier sign up. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
		
    }
    
////Lose weight sign on lb
    @Test
    public void loseWeight_lb_01(){
    	
    	//Reset test result
    	Global.bAssertion = false;
    	
    	try{
    		   
    	Utilities.signUp("Lose Weight");
  
		//Select Date of birth
    	Utilities.setDOB();
		
      //Select Gender
    	Utilities.selectGender();
    	
		// Provide Height details
    	Utilities.enterHeight();

		// Provide weight details
    	Utilities.enterWeight("lb",75);
    	
		// Provide weight goal details
    	Utilities.entermyGoalWeight("lb",50);
		
		//Wait for page
		Utilities.implicitWait();
		
		//Wait for page
		Utilities.myPlan();
		
		// Select food details
		Utilities.selectFood();

		//Wait for page
		Utilities.implicitWait();
				
		//Logout from App
		Utilities.logout();
	
    	}
		catch (Exception e){
			Global.bAssertion = true;
			System.out.println("Failure in Lose weight sign up. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
		
    }
    
////Gain weight sign on kg
    @Test
    public void loseWeight_kg_02(){
    	
    	//Reset test result
    	Global.bAssertion = false;
    	
    	try{
    		   
    	Utilities.signUp("Lose Weight");
  
		//Select Date of birth
    	Utilities.setDOB();
		
      //Select Gender
    	Utilities.selectGender();
    	
		// Provide Height details
    	Utilities.enterHeight();

		// Provide weight details
    	Utilities.enterWeight("kg",75);
    	
		// Provide weight goal details
    	Utilities.entermyGoalWeight("kg",50);
		
		//Wait for page
		Utilities.implicitWait();
		
		//My Plan page
		Utilities.myPlan();
		
		// Select food details
		Utilities.selectFood();

		//Wait for page
		Utilities.implicitWait();
				
		//Logout from App
		Utilities.logout();
	
    	}
		catch (Exception e){
			Global.bAssertion = true;
			System.out.println("Failure in Lose weight sign up. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
		
    }

////Gain weight sign on lb
    @Test
    public void gainWeight_lbs_01(){
    	
    	//Reset test result
    	Global.bAssertion = false;
    	
    	try{
    		   
    	Utilities.signUp("Gain Weight");
  
		//Select Date of birth
    	Utilities.setDOB();
		
      //Select Gender
    	Utilities.selectGender();
    	
		// Provide Height details
    	Utilities.enterHeight();

		// Provide weight details
    	Utilities.enterWeight("lb",59);
    	
		// Provide weight goal details
    	Utilities.entermyGoalWeight("lb",80);
		
		//Wait for page
		Utilities.implicitWait();
		
		//My plan page
		Utilities.myPlan();
		
		// Select food details
		Utilities.selectFood();

		//Wait for page
		Utilities.implicitWait();
				
		//Logout from App
		Utilities.logout();
	
    	}
		catch (Exception e){
			Global.bAssertion = true;
			System.out.println("Failure in Be Gain weight sign up. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
		
    }

////Gain weight sign on Kg
    @Test
    public void gainWeight_kg_02(){
    	
    	//Reset test result
    	Global.bAssertion = false;
    	
    	String myPlanCal, myGoalCal;
    	
    	//Test Data
    	Global.setCurrentWeight = "70";
    	Global.setGoalWeight = "80";
    	
    	try{
    		   
    	Utilities.signUp("Gain weight");
  
		//Select Date of birth
    	Utilities.setDOB();
		
      //Select Gender
    	Utilities.selectGender();
    	
		// Provide Height details
    	Utilities.enterHeight();

		// Provide weight details
    	Utilities.enterWeight("kg",Integer.valueOf(Global.setCurrentWeight));
    	
		// Provide weight goal details
    	Utilities.entermyGoalWeight("kg",Integer.valueOf(Global.setGoalWeight));
		
		//Wait for page
		Utilities.implicitWait();
		
		//Get Plan cal value
		myPlanCal = Utilities.myPlanCalories();
			
		//Wait for page
		Utilities.implicitWait();
		
		//My plan
		Utilities.myPlan();
		
		// Select food details
		Utilities.selectFood();
		
		//Wait for page
		Utilities.implicitWait();
		
		//Get Goal Calories
		myGoalCal = Utilities.myGoalCalories();
		
		//Verify calories
		 Utilities.compareCalories(myPlanCal, myGoalCal);
			
		//Logout from App
		Utilities.logout();
		
		//Verify Personal details
		Utilities.verifyPersonalDetails();
		
		//Verify if test passed or failed
		assertFalse(Global.bAssertion);
			
    	}
		catch (Exception e){
			Global.bAssertion = true;
			System.out.println("Failure in Be Gain weight sign up. Error message: "+e.getMessage());
			e.printStackTrace();
			assertFalse(Global.bAssertion);
		}
		
    }
    
}

