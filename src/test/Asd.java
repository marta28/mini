package test;

public class Asd {
	private String mapBooleanToString(boolean flag) {
		if (flag == true) {
			return getTrue();
		} else {
			return getFalse();
		}
	}

	private String getTrue() {
		return "true";
	}

	private String getFalse() {
		return "false";
	}
}
