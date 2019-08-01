package org.glbc.day4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Load {
    public static void main(String[] args) throws IOException {
//        boolean exists = Files.exists("./south.txt");
        String fileName = "south.txt";
        String line;
        int b = 0;

        Path s = Paths.get(fileName);
        System.out.println(s.toFile().exists());


//        try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {
//
//            int count = 0;
//            while ((line = bReader.readLine()) != null) {
//                String []p = line.split(" ");
////                System.out.println(p);
//                for (String word: p) {
//                    count ++;
//                }
//
//            }
//            System.out.println(count);
//
//        }



//        Load.read(fileName);

//        Load.count(fileName);



//        FileInputStream file = new FileInputStream(new File(fileName));
//        System.out.println(file.);

        Load.longerThan5(fileName);

    }

    private static void count(String fileName) throws IOException {
        int total = 0;
        String line;
        try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {

            while ((line = bReader.readLine()) != null) {
                total = total + line.length();
            }

            System.out.println(total);
        }

    }

    private static void read(String fileName) throws IOException {
        String line;
        try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {

            while ((line = bReader.readLine()) != null) {
                System.out.println(line.length());
            }
        }

    }

    private static void longerThan5(String fileName) throws IOException {
        String line;
        try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {
            int count = 0;
            while ((line = bReader.readLine()) != null) {
                String []p = line.split(" ");
                for (String word: p) {
                    if (word.length() > 5) {
                        count ++;
                    }
                }

            }
            System.out.println(count);

        }

    }

    private static void wordCount(String fileName) throws IOException {
        String line;
        try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {
            int count = 0;
            while ((line = bReader.readLine()) != null) {
                String []p = line.split(" ");
                for (String word: p) {
                        count ++;
                }

            }
            System.out.println(count);

        }

    }




}
