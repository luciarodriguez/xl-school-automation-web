package com.xlschool.framework.datahelper;

import com.github.javafaker.Faker;

public class formdata {

    public static boolean noScroll;

    public static Faker faker = new Faker();
    public static String firstName = faker.name().firstName();
    public static String mobileNumberConfirmationText = faker.number().digits(10);
    public static String lastName = faker.name().lastName();
    public static String fullNameConfirmationText = firstName + " " + lastName;
    public static String studentEmailConfirmationText = faker.internet().safeEmailAddress();
    public static String addressConfirmationText = faker.address().fullAddress();
    public static String subjectConfirmationText = "Social Studies";
    public static String stateName = "NCR";
    public static String cityName = "Delhi";
    public static String stateCityConfirmationText = stateName + " " + cityName;
    public static String genderConfirmationText = "Female";
    public static String hobbiesConfirmationText = "Sports";

}
