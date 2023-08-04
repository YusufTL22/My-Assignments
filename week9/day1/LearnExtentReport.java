package week9.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentHtmlReporter reporter = new ExtentHtmlReporter ("./reports/result.html");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test = extent.createTest("LoginAndLogout", "Login test for leaftaps application");
		test.assignAuthor("smoke");
		test.assignCategory("Hari");
		test.pass("Enter UserName");
		test.pass("Password");
		extent.flush();  

	}

}
