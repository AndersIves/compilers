package com.cqu.compilers.utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    public static List<String> File2String(String FilePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(FilePath);
            Scanner input = new Scanner(fileInputStream);
            List<String> fileStringList = new ArrayList<>();
            while (input.hasNextLine()) {
                fileStringList.add(input.nextLine());
            }
            return fileStringList;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
