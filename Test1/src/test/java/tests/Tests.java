package tests;

import org.testng.annotations.Test;

import Pages.SubscriptionPage;
import base.Base;
import readFiles.Environment;

public class Tests extends Base {
	@Test
	public static void validateSubscriptionPlanBahrain() throws InterruptedException {
		launchUrl(Environment.url);
		SubscriptionPage sub = new SubscriptionPage();
		sub.chooseCountry();
		sub.navigateToCountry(sub.chooseBahrain);
		sub.assertPlansBahrain();
	}

	@Test
	public static void validateSubscriptionPlanKSA() throws InterruptedException {
		launchUrl(Environment.url);
		SubscriptionPage sub = new SubscriptionPage();
		sub.chooseCountry();
		sub.navigateToCountry(sub.chooseKSA);
		sub.assertPlansKSA();
	}

	@Test
	public static void validateSubscriptionPlanKuwait() throws InterruptedException {
		launchUrl(Environment.url);
		SubscriptionPage sub = new SubscriptionPage();
		sub.chooseCountry();
		sub.navigateToCountry(sub.chooseKuwait);
		sub.assertPlansKuwait();
	}
}
