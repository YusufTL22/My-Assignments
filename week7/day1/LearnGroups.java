package week7.day1;

import org.testng.annotations.Test;

public class LearnGroups {
	@Test (groups = "smoke")
	public void createLead () {
	System.out.println("createLead");	
	}
	@Test (groups = "regression")
	public void editLead () {
	System.out.println("editLead");	
	}
	@Test (groups = "functional")
	public void deleteLead () {
	System.out.println("deleteLead");	
}
}