package com.stackroute;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherString {
     String strMatcher(String str, String word){
        String regex = word;
        String newArr = "";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
        {
            newArr = newArr + matcher.start() + "-" + matcher.end() + " ";
        }
        System.out.println(newArr.trim());
        return newArr.trim();
    }

}

