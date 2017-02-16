package com.aliyou.uniquechar;


import java.util.ArrayList;
import java.util.List;

public class UniqueChar {

    private String myString;

    private List<Character> myArryofChars = new ArrayList<Character>();

    public String uniqueCharOrNot(String myString) {
        this.myString = myString;
        int cpt;

        for (int i = 0; i < this.myString.length(); i++) {
            this.myArryofChars.add(this.myString.charAt(i));//Récupération des caractères dans une liste
        }

        for (Character myChar : this.myArryofChars) {
            cpt = 0;
            for (int i = 0; i < this.myString.length(); i++) {
                if ((this.myString.charAt(i)) == myChar) {
                    cpt++;
                    if(cpt==2) return "ko";
                }
            }
        }
       return "ok";
    }

    public static void main(String[] args) {
        UniqueChar uniquechar = new UniqueChar();
        System.out.println(uniquechar.uniqueCharOrNot("abcdefg"));//abcdefg;abcdafg
    }
}


