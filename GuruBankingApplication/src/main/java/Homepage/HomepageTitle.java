package Homepage;

import CommonFunctions.SetUp;

public class HomepageTitle extends SetUp{
	
	public String homepageTitle() {
		return driver.getTitle();
	}

}
