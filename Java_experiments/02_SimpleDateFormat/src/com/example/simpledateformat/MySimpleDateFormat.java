package com.example.simpledateformat;

/*
 * Get a new data format from the old one.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MySimpleDateFormat {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // input in console "2012-06-15"
        String inputDateFormat = bufferedReader.readLine();

        SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy");

        Date date = oldDateFormat.parse(inputDateFormat);

        System.out.println(newDateFormat.format(date).toUpperCase());

    }

}
