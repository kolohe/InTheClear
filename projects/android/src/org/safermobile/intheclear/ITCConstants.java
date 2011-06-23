package org.safermobile.intheclear;

public class ITCConstants {
	public static class Wipe {
		public static final int CONTACTS = 1;
		public static final int PHOTOS = 2;
		public static final int CALLLOG = 3;
		public static final int SMS = 4;
		public static final int CALENDAR = 5;
		public static final int FOLDER = 6;
	}
	public static class Results {
		public static final int RESULT_PREFERENCES_UPDATED = 1;
		public static final int SETUP_WIZARD = 2;
		public static final int SELECTED_FOLDERS = 3;
	}
	
	public static class Duriation {
		public static final long SPLASH = 3000L;
		public static final long COUNTDOWN = 5000L;
		public static final long COUNTDOWNINTERVAL = 1000L;
	}
	
	public static class Preference {
		public static final String USER_DISPLAY_NAME = "UserDisplayName";
		public static final String USER_DISPLAY_LOCATION = "UserDisplayLocation";
		public static final String DEFAULT_PANIC_MSG = "DefaultPanicMsg";
		public static final String DEFAULT_WIPE_CONTACTS = "DefaultWipeContacts";
	}
	
	public static class Log {
		public static final String ITC = "[InTheClear] ******************************** ";
	}
	
	public static int FormLength = 8;
}
