package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
	(
		features="src/test/java/FeatureFiles", //the path of the feature file
		glue="StepDefinations",  //the path of the step defination file
		monochrome=true   //it gives o/p in console readable format,default value:false
		//dryRun=true,   
		//strict=true
		//tags
	)
		
		/*tags: what tags in the feature file should be executed
		/*strict=true, will fail execution if there is undefined or pending steps,
		 this is not working in latest version, as its not available*/
		
		/* dryRun:
		 checks if all the steps have the step defination,
		to see this make some changes of steps inn stepdefination.java file,default value:false
		to see the other options comment to dryRun as its giving err*/

public class TestRunner {

}
