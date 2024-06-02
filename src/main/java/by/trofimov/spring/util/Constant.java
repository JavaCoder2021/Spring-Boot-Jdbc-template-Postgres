package by.trofimov.spring.util;

public final class Constant {

    private Constant() {}

    public static final String SEPARATOR = ";";

    public static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/jsp/";
    public static final String VIEW_RESOLVER_SUFIX = ".jsp";

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/company_repository";
    public static final String DB_USER_NAME = "postgres";
    public static final String DB_USER_PASSWORD = "postgres";

    public static final String RESOURCE_HANDLER = "/css/**";
    public static final String RESOURCE_LOCATIONS = "/WEB-INF/css/";

    public static final String QUERY_SELECT_ALL_EMPLOYEES = "SELECT * FROM company_storage.employee";
    public static final String ROW_ID = "id";
    public static final String ROW_FIRST_NAME = "first_name";
    public static final String ROW_LAST_NAME = "last_name";
    public static final String ROW_SALARY = "salary";

}
