package com.demoqa.tests;

import com.demoqapages.HomePage;
import com.demoqapages.PracticeFormPage;
import com.demoqapages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).confirmCookie().getForms();
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountPositiveTest(){
        new PracticeFormPage(driver).hideIframes();
        new PracticeFormPage(driver).enterPersonalData("Jack", "Black","jb@gm.com","1235284697")
                .selectGender("Male")
                .typeOfDate("16 August 1987")
                .addSubjects(new String[]{"Maths","Chemistry","English"})
                .selectHobby(new String[]{"Sports","Music"})
                .uploadFile("D:/AIT/1.jpeg");


    }
}
