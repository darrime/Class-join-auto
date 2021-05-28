package com.github.darrime;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ClassList {
    private static Desktop ds = Desktop.getDesktop();


    public static String korean = "https://meet.google.com/lookup/ad5iyvxt75?authuser=1&hs=179";
    public static String chanese = "https://meet.google.com/lookup/dhu5mkn277?authuser=1&hs=179";
    public static String maths = "https://meet.google.com/lookup/fwqwjvqsgr?authuser=1&hs=179";
    public static String social = "https://meet.google.com/lookup/drlmhytr6b?authuser=1&hs=179";
    public static String science = "https://meet.google.com/lookup/huyrkucust?authuser=1&hs=179";
    public static String history = "https://meet.google.com/lookup/hsxfrqr7jv?authuser=1&hs=179";
    public static String music = "https://meet.google.com/lookup/hkmx5zfenf?authuser=1&hs=179";
    public static String english = "https://meet.google.com/lookup/by756uicuv?authuser=1&hs=179";
    public static String tech = "https://meet.google.com/lookup/err565whex?authuser=1&hs=179";
    public static String Family = "https://meet.google.com/lookup/err565whex?authuser=1&hs=179";
    public static String psycal = "https://meet.google.com/lookup/efdfvk26qg?authuser=1&hs=179";
    public static String korean_c = "https://classroom.google.com/u/1/c/Mjc3NjE4MDQzNzg0";
    public static String maths_c = "https://classroom.google.com/u/1/c/MjgyOTQzODc1Nzg5";
    public static String social_c = "https://classroom.google.com/u/1/c/Mjc3NjQxMzAyNjgz";
    public static String science_c = "https://classroom.google.com/u/1/c/Mjc3NjgxOTE5MzE3";
    public static String history_c = "https://classroom.google.com/u/1/c/MjgzMDM1MzMyMzcx";
    public static String music_c = "https://classroom.google.com/u/1/c/Mjc3NjU0MjEzODA2";
    public static String english_c = "https://classroom.google.com/u/1/c/Mjc3NjkxMTM2Mjk5";
    public static String tech_c = "https://classroom.google.com/u/1/c/Mjc3NjEwNTU3MzY0";
    public static String Family_c = "https://classroom.google.com/u/1/c/MjgzOTUxNTMyMjUx";
    public static String psycal_c = "https://classroom.google.com/u/1/c/MjgzNDg5MTk1MDMz";
    public static String chanese_c = "https://classroom.google.com/u/1/c/MjgzMDY3NjQxNjU4";

    public static void loading(String subject) {
        try {
            switch (subject) {
                case "국어":
                    ds.browse(new URI(korean));
                    ds.browse(new URI(korean_c));
                    break;
                case "역사":
                    ds.browse(new URI(history));
                    ds.browse(new URI(history_c));
                    break;

                case "수학":
                    ds.browse(new URI(maths));
                    ds.browse(new URI(maths_c));
                    break;
                case "사회":
                    ds.browse(new URI(social));
                    ds.browse(new URI(social_c));
                    break;
                case "과학":
                    ds.browse(new URI(science));
                    ds.browse(new URI(science_c));
                    break;
                case "영어":
                    ds.browse(new URI(english));
                    ds.browse(new URI(english_c));
                    break;
                case "기술":
                    ds.browse(new URI(tech));
                    ds.browse(new URI(tech_c));
                    break;
                case "가정":
                    ds.browse(new URI(Family));
                    ds.browse(new URI(Family_c));
                    break;
                case "중국어":
                    ds.browse(new URI(chanese));
                    ds.browse(new URI(chanese_c));
                    break;
                case "체육":
                    ds.browse(new URI(psycal));
                    ds.browse(new URI(psycal_c));
                    break;
                case "음악":
                    ds.browse(new URI(music));
                    ds.browse(new URI(music_c));
                    break;
                default:
                    System.out.println("ERROR: Invalid Syntax");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
