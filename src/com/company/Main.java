
package com.company;
import com.company.DirReader;

public class Main {

    public static void main(String[] args) {

        String directoryPath = ("C:\\Program Files (x86)\\World of Warcraft\\Screenshots");

        DirReader dr = new DirReader(directoryPath);
        dr.readDir();

    }
}