package com.lifesum.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class Global {

	public static AppiumDriver<AndroidElement> driver;
	public static boolean bAssertion = false;
	public static String gErrMsg = null;
	
	public static String goalWeight;
	public static String currentWeight;
	public static String caloriePerDay;
	public static String height;
	public static String dob;
	public static String gender;
	
	
	//Test Data
	public static String setGoalWeight;
	public static String setCurrentWeight;
	public static String setHeight;
	
}
