package Other;

public class Bean {
	private String acidity;
	private String aroma;
	private String beanOrigin;
	private String roast;

	public Bean(String acidity, String aroma, String beanOrigin, String roast) {
		super();
		this.acidity = acidity;
		this.aroma = aroma;
		this.beanOrigin = beanOrigin;
		this.roast = roast;
	}

	public String toString() {
		return "Bean Type: \n" + "Acidity: " + acidity + "\nAroma: " + aroma + "\nBean Origin: " + beanOrigin
				+ "\nRoast: " + roast;
	}

}
