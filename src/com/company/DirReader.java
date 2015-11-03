package com.company;

import java.nio.file.*;
//DiRReader Class
public class DirReader {

    public DirReader (){

    }

    public void readDir () {

        try {

            Files.walk(Paths.get("C:\\Program Files (x86)\\World of Warcraft\\Screenshots")).forEach(filePath -> {
                if (Files.isRegularFile(filePath)) {
                    System.out.println(filePath);
                }
            });

        } catch (Exception err) {
            System.out.println(err);
        }


    }
}
