package com.cqu.compilers.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    public static List<String> File2String(String FilePath) {
        try {
            File file = new File(FilePath);
            FileInputStream fileInputStream = new FileInputStream(file);
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
