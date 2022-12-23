package readFiles;

public class Environment {
	private static String filePath = "/src/main/resources/env.properties";
	public static String url;
	static {
		PropUtils prop = new PropUtils();
		String baseDirectory = System.getProperty("user.dir");
		url = prop.getValue(baseDirectory + filePath, "url");
	}
}
