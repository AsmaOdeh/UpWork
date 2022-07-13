package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {


    public void onStart (ITestContext arg){

        System.out.println("Starts the test execution ............."+arg.getName());

    }

    public void onTestSuccess (ITestResult result){

        System.out.println("The test passed ................."+result.getName());


    }

    public void onTestSkipped (ITestResult arg){
        System.out.println("Skipped Test .................."+arg.getName());
    }

    public void onFinsih (ITestContext arg){

        System.out.println("Finish the test execution ............."+arg.getName());

    }


}
