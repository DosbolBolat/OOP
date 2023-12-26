package OOP.Enums;

public enum Attendance {
	MISS, ATTENDED, ABSENT;


	public static Attendance of(String attendance) {
		switch (attendance) {
			case "attended":
				return ATTENDED;
			case "absent":
				return ABSENT;
			default:
				return null;
		}
	}

}