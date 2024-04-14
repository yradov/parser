package com.um191;

import com.um191.file_manager.FileManager;


public class Main {
    public static void main(String[] args) {
        /**
         * 1) Open file with data
         * 2) Getting data from file(parse)
         * 3) Create .CSV file
         */

//        Parser.parsData("hello");
        FileManager.readData("detector_data.TXT");
    }//main

    /**
     * for test sample
     */
    public static String getGreetings(String name) {
        return "Hello and welcome " + name + "!";
    }
}