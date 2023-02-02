package org.autotests.userway.constants;

public class Constant {

    public static class Login {
        public static final String LOGIN = "test@test.com";
        public static final String PASSWORD = "test";
        public static final String WRONG_LOGIN = "quest@test.com";
        public static final String WRONG_PASSWORD = "quest";
    }

    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 4;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls {
        public static final String HOME_PAGE = "https://qa.userway.dev/";

    }

    public static class NumberVars {
        public static final int CATEGORY_LIST_COUNT = 9;
    }
}
