package project;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebElement;
import org.junit.FixMethodOrder;
import org.openqa.selenium.By;
import org.junit.Test;
import java.util.List;
import junit.framework.Assert;
import static org.junit.Assert.*;



public class test extends web_operation {

	
	WebDriverWait wait= new WebDriverWait(driver,5);
	
	
	@Test
	public void test() {
		
		Assert.assertEquals(driver.getTitle(), "n11.com");
		System.out.println("Web Sitesi Acildi");
	}
	
	//Kullanici giris sayfasi acilma testi
	
	@Test
	public void loginPage() {
		
		withClassName("btnSignIn").click();
		Assert.assertEquals(driver.getTitle(),"Giriş Yap - n11.com");
		
		
	}
	//Kullanici girisi
	
	@Test
	public void login() {
			
		withId("email").sendKeys("*********");
		withId("password").sendKeys("*******");
		withId("loginButton").click();
			
		
		}
		
	//Bilgisayar 
		
	@Test
	public void search() {
		
		withId("searchData").sendKeys("bilgisayar");
		withClassName("searchBtn").click();
		Assert.assertEquals(driver.getTitle(),"bilgisayar - n11.com");
			
			
		
		}
		
	//2. sayfaya girer ve sayfada oldugunu onaylar
		
	@Test
	public void pageNumber() {
			
		withXpath("//*[@class='pagination']/a[2]").click();
		
			
			
		}
		
	//3.Ürünü secer ve sepete ekler
		
	@Test
	public void addSepet() {
			
		withXpath("//*[@id=\"p-401529713\"]/div[1]/a[1]/h[3]").click();
		withXpath("//*[@class= 'btnHolder']/a[1]").click();		
		}
		
	//Sepetim sekmesinin içine girer
		
	@Test
	public void openListPage()  {
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",
		withXpath("//*[@class='customMenu']/div[4]/a[1]/i"));
			
		}
		
	//Adet arttırılarak ürün adedi 2 olur
		
	@Test
	public void arttirma() {
			
		withXpath("//*[@class='spinnerFieldContainer']/span[1]").click();
			
			
		}
	//Ürün sepetten silinir
		
	@Test
	public void Delete() {
		withXpath("//*[@class='prodAction']/span[1]").click();
		
		withXpath("//*[@class='cartEmptyText']/h2");
			
		
		
	}
	
}


