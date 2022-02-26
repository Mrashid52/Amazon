package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {
				
		 WebDriverManager.chromedriver().setup();// driver exe 
		  WebDriver driver = new ChromeDriver(); // browser
		  //this is how we open an application
		  driver.get("https://www.amazon.com/");		
		
		
		
		//String is a data type
		  // amazonTitle is the variable name
		  // = is an operator
		  // driver.getTitle();is a selenium WebDriver interface method. also variable value.
		 String amazonTitle= driver.getTitle();
		  System.out.println("this is amazon title: "+amazonTitle);
		  // we are printing the title.
		  
		  String amazonURL=driver.getCurrentUrl();
		  System.out.println("this amazon URL"+amazonURL);

	}

}
