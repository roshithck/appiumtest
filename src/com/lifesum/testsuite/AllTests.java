package com.lifesum.testsuite;

import org.junit.runner.RunWith;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * 
 *
 */

public class AllTests {

	public static Test suite() {
		
		TestSuite suite = new TestSuite("Lifesum Challenge");
		
	
	// Be Healthier sign-up scenario in lbs
		suite.addTest(new AppTest("beHealtier_lbs_01"));
	
	// Be Healthier sign-up scenario in kg
		suite.addTest(new AppTest("beHealtier_kg_02"));
		
	// Lose Weight sign-up scenario in lbs
		suite.addTest(new AppTest("loseWeight_lb_01"));
	
	// Lose Weight sign-up scenario in kg 
		suite.addTest(new AppTest("loseWeight_kg_02"));
		
	// Gain Weight sign-up scenario in lbs
		suite.addTest(new AppTest("gainWeight_lbs_01"));
	
	// Gain Weight sign-up scenario in kg (includes calorie comparison and verifying personal details)
		suite.addTest(new AppTest("gainWeight_kg_02"));
		
	// Note:  All test include navigating to Personnel Details scenarios and log off App
		
		return suite;
	}

}
