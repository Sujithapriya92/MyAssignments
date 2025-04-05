package week2.day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browser = new Browser();
		String launchedBrowser = browser.launchBrowser("Edge");
		browser.loadurl();
		System.out.println("launchedBroswer: " + launchedBrowser);

	}

}
