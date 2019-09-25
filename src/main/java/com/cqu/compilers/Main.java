package com.cqu.compilers;

import com.cqu.compilers.utils.FileUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = FileUtils.File2String(args[0]);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
