package com.cqu.compilers;

import com.cqu.compilers.utils.FileUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("[");
        for (int i = 0;i < args.length;i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print("\"" + args[i] + "\"");
        }
        System.out.println("]");
        List<String> list = FileUtils.File2String(args[0]);
        System.out.println(list);
    }
}
