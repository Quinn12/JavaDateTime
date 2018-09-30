package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args)
    {
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd-MM-yyyy");//new format acts as easy way to convert to string
        LocalDate Today = LocalDate.now();//todays date
        String CurDate =  Today.format(DTF);//todays date as format dd-mm-yyyy
        System.out.println("The current date is " + Today);
        String CurDateParts[] = CurDate.split("-");//splits day month and year into strings splitting on the dash.
        Integer CurDateYear = Integer.parseInt(CurDateParts[2]);
        Integer CurDateMonth = Integer.parseInt(CurDateParts[1]);
        Integer CurDateDay = Integer.parseInt(CurDateParts[0]);

        Integer day = 0;//the day the full moon is on next

        Integer FulMDay = 0;//the amount of days til its full moon

        if(CurDateMonth == 9)
        {
            day = 24;
            FulMDay = ((CurDateDay - day) - 30) *-1;
        }

        if(CurDateMonth == 10)
        {
            day = 23;
            FulMDay = ((CurDateDay - day) - 31) *-1;
        }

        if(CurDateMonth == 11)
        {
            day = 22;
            FulMDay = ((CurDateDay - day) - 30) *-1;
        }

        if(CurDateMonth == 12)
        {
            day = 24;
            FulMDay = ((CurDateDay - day) - 31) *-1;
        }

        System.out.println("The current next full moon is in " + FulMDay+ " days.");

    }
}
