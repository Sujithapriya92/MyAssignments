package week2.day3;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadurl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser browser = new Browser();
		String launchedBrowser = browser.launchBrowser("Chrome");
		browser.loadurl();
		System.out.println("launchedBroswer: " + launchedBrowser);

	}

}
