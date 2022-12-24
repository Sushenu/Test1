package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;

public class SubscriptionPage extends Base {
	public SubscriptionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class=\"country-current\"]")public WebElement chooseCountry;
	@FindBy(xpath = "//a[@href=\"https://subscribe.stctv.com/bh-en\"]")public WebElement chooseBahrain;
	@FindBy(xpath = "//a[@href=\"https://subscribe.stctv.com/sa-en\"]")public WebElement chooseKSA;
	@FindBy(xpath = "//a[@href=\"https://subscribe.stctv.com/kw-en\"]")public WebElement chooseKuwait;
	@FindBy(xpath = "//strong[@class=\"plan-title\"]")public WebElement KSALITE;
	@FindBy(xpath = "//strong[@class=\"plan-title\"]")public WebElement KuwaitLITE;
	@FindBy(xpath = "//strong[@class=\"plan-title\"]")public WebElement BahrainLITE;
	@FindBy(xpath = "(//strong[@class=\"plan-title\"])[2]")public WebElement KSAClassic;
	@FindBy(xpath = "(//strong[@class=\"plan-title\"])[2]")public WebElement KuwaitClassic;
	@FindBy(xpath = "(//strong[@class=\"plan-title\"])[2]")public WebElement BahrainClassic;
	@FindBy(xpath = "(//strong[@class=\"plan-title\"])[3]")public WebElement KSAPremium;
	@FindBy(xpath = "(//strong[@class=\"plan-title\"])[3]")public WebElement KuwaitPremium;
	@FindBy(xpath = "(//strong[@class=\"plan-title\"])[3]")public WebElement BahrainPremium;
	@FindBy(xpath = "//div[@class=\"price\"]")public WebElement KSALITEPrice;
	@FindBy(xpath = "(//div[@class=\"price\"])[2]")public WebElement KSAClassicPrice;
	@FindBy(xpath = "(//div[@class=\"price\"])[3]")public WebElement KSAPremiumPrice;
	
	@FindBy(xpath = "//div[@class=\"price\"]")public WebElement KuwaitLITEPrice;
	@FindBy(xpath = "(//div[@class=\"price\"])[2]")public WebElement KuwaitClassicPrice;
	@FindBy(xpath = "(//div[@class=\"price\"])[3]")public WebElement KuwaitPremiumPrice;
	
	@FindBy(xpath = "//div[@class=\"price\"]")public WebElement BahrainLITEPrice;
	@FindBy(xpath = "(//div[@class=\"price\"])[2]")public WebElement BahrainClassicPrice;
	@FindBy(xpath = "(//div[@class=\"price\"])[3]")public WebElement BahrainPremiumPrice;
	

	public void chooseCountry() throws InterruptedException {
		chooseCountry.click();
		System.out.println("Choose Countrywise subscription plans");
	}

	public void navigateToCountry(WebElement element)throws InterruptedException {
		element.click();
	}

	public void assertPlansKSA() throws InterruptedException {
		String KSALITEdet = KSALITE.getText();Thread.sleep(3000);
		Assert.assertEquals("LITE", KSALITEdet);
		String KSAClassicdet = KSAClassic.getText();Thread.sleep(3000);
		Assert.assertEquals("CLASSIC", KSAClassicdet);
		String KSAPremiumdet = KSAPremium.getText();Thread.sleep(3000);
		Assert.assertEquals("PREMIUM", KSAPremiumdet);
	}
	public void assertPlansKuwait() throws InterruptedException {
		String KuwaitLITEdet = KuwaitLITE.getText();Thread.sleep(3000);
		Assert.assertEquals("LITE", KuwaitLITEdet);
		String KuwaitClassicdet = KuwaitClassic.getText();Thread.sleep(3000);
		Assert.assertEquals("CLASSIC", KuwaitClassicdet);
		String KuwaitPremiumdet = KuwaitPremium.getText();Thread.sleep(3000);
		Assert.assertEquals("PREMIUM", KuwaitPremiumdet);
	}
	public void assertPlansBahrain() throws InterruptedException {
		String BahrainLITEdet = BahrainLITE.getText();Thread.sleep(3000);
		Assert.assertEquals("LITE", BahrainLITEdet);
		String BahrainClassicdet = BahrainClassic.getText();Thread.sleep(3000);
		Assert.assertEquals("CLASSIC", BahrainClassicdet);
		String BahrainPremiumdet = BahrainPremium.getText();Thread.sleep(3000);
		Assert.assertEquals("PREMIUM", BahrainPremiumdet);
	}
	public void assertPriceKSA() throws InterruptedException {	
		String KSALITEPriceP = KSALITEPrice.getText();Thread.sleep(3000);Assert.assertEquals("Starting from: 15 SAR/month", KSALITEPriceP);
		String KSAClassicPriceP = KSAClassicPrice.getText();Thread.sleep(3000);Assert.assertEquals("Starting from: 25 SAR/month", KSAClassicPriceP);
		String KSAPremiumPriceP = KSAPremiumPrice.getText();Thread.sleep(3000);Assert.assertEquals("Starting from: 60 SAR/month", KSAPremiumPriceP);
	}
	public void assertPriceKuwait() throws InterruptedException {	
		String KuwaitLITEPriceP = KuwaitLITEPrice.getText();Thread.sleep(3000);Assert.assertEquals("1.2 KWD/month", KuwaitLITEPriceP);
		String KuwaitClassicPriceP = KuwaitClassicPrice.getText();Thread.sleep(3000);Assert.assertEquals("2.5 KWD/month", KuwaitClassicPriceP);
		String KuwaitPremiumPriceP = KuwaitPremiumPrice.getText();Thread.sleep(3000);Assert.assertEquals("4.8 KWD/month", KuwaitPremiumPriceP);
	}
	public void assertPriceBahrain() throws InterruptedException {	
		String BahrainLITEPriceP = BahrainLITEPrice.getText();Thread.sleep(3000);Assert.assertEquals("2 BHD/month", BahrainLITEPriceP);
		String BahrainClassicPriceP = BahrainClassicPrice.getText();Thread.sleep(3000);Assert.assertEquals("3 BHD/month", BahrainClassicPriceP);
		String BahrainPremiumPriceP = BahrainPremiumPrice.getText();Thread.sleep(3000);Assert.assertEquals("6 BHD/month", BahrainPremiumPriceP);
	}

}
