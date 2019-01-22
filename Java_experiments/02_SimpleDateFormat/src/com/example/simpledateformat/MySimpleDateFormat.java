package com.example.simpledateformat;

/*
* Get a new data format from the old one.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleDateFormat {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputDateFormat = bufferedReader.readLine();

        SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-dd-MM");

    }

}
