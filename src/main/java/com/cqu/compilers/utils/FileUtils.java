package com.cqu.compilers.utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @author AndersIves
 * @date 2019/10/14 下午 02:32
 */


public class FileUtils {
    public static String File2String(String FilePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(FilePath);
            Scanner input = new Scanner(fileInputStream);
            StringBuffer out = new StringBuffer();
            while (input.hasNextLine()) {
                out.append(input.nextLine());
            }
            return out.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}