package org.stepdefinition;

import org.bas.BaseClass;
import org.junit.After;
import org.junit.Before;

public class HooksClass extends BaseClass{
	@Before
	private void PreCondition() {
		launchBrowser();

	}
	@After
	private void postCondition() throws InterruptedException {
		closeBrowser();

	}

}
