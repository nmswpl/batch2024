package in.co.nmsworks.week2.practice;

public class Static {
    private static String companyName;

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Static.companyName = companyName;
    }
}
