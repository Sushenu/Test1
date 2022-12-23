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

}
