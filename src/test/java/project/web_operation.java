package project;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import junit.framework.Assert;


public class web_operation extends connection {

	
		
		
		public WebElement withClassName(String name) {
			WebElement element=driver.findElement(By.className(name));
			return element;
		}
		
		
		
		public WebElement withXpath(String xpath) {
			WebElement element=driver.findElement(By.xpath(xpath));
			return element;
		}
		
		
		
		public WebElement withId(String id) {
			WebElement element=driver.findElement(By.id(id));
			return element;
		}
		
		
		
		public ExpectedCondition<WebElement> clickableByXpath(String path){
			ExpectedCondition<WebElement> clickable=ExpectedConditions.elementToBeClickable((By.xpath(path)));
			return clickable;
		}
		
	

	}

