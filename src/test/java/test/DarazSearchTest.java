package test;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.beust.jcommander.internal.Lists;

public class DarazSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		maincode();
		
	}

	public static void maincode()
	{
		TestListenerAdapter tla=new TestListenerAdapter();
		TestNG testng=new TestNG();
		
		List<String> suites=Lists.newArrayList();
		
		suites.add(System.getProperty("user.dir")+"//testng.xml");
		//suites.add("E:\\WorkSpace\\IFTAS_SFMS\\testng.xml");
		testng.setTestSuites(suites);
		testng.addListener(tla);
		testng.run();
	}
	
}

