package com.epam.mjc.nio;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        try (java.io.FileReader in = new java.io.FileReader(file)) {
            BufferedReader br = new BufferedReader(in);

            String name = getSecondSplitPart(br.readLine());
            int age = Integer.parseInt(getSecondSplitPart(br.readLine()));
            String email = getSecondSplitPart(br.readLine());
            Long phone = Long.parseLong(getSecondSplitPart(br.readLine()));

            return new Profile(name, age, email, phone);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Profile();
    }

    String getSecondSplitPart(String str){
        return str.split("\\s")[1];
    }
}
