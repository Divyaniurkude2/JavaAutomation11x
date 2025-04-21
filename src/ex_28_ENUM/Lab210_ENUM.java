package ex_28_ENUM;

import ex_19_OOPs_Inheritance.multilevel_inheritance.Son;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(PROJECT_URLS.vwo);
    }
}
//class A {
//    String[] days = {"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"};
//}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum PROJECT_URLS{
    google, restassured, katalon, vwo
}
