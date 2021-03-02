package testgroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class class2 {

	@Test
	public void validateTitles() {

		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";

		/*
		 * if (expected_title.equals(actual_title)) {
		 * System.out.println("Test case passed"); } else
		 * System.out.println("Test case Failed");
		 */
		
		Assert.assertEquals(actual_title, expected_title);
	}

}
