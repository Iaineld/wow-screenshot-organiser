package com.company;

import java.nio.file.*;

public class DirReader {

    public DirReader (){

    }

    public void readDir () {

        try {

            Files.walk(Paths.get(".")).forEach(filePath -> {
                if (Files.isRegularFile(filePath)) {
                    System.out.println(filePath);
                }
            });

        } catch (Exception err) {
            System.out.println(err);
        }


    }
}
