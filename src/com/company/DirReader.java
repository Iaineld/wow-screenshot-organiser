
package com.company;

import java.nio.file.*;
import java.io.File;
//DiRReader Class
public class DirReader {

    private String dirPath;

    public DirReader (String directoryPath){
        this.dirPath = directoryPath;
    }

    public void readDir () {
        File folder = new File(this.dirPath);

        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++){

            File newFile = listOfFiles[i];
            System.out.println(newFile.getName());

        }

        
    }

}