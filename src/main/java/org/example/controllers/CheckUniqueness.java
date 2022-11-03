package org.example.controllers;

import java.util.HashMap;

public class CheckUniqueness {
     HashMap<String,Integer> hm = new HashMap<String,Integer>();
     String[] words;
   public CheckUniqueness(){}

   public CheckUniqueness(String[] words){
       this.words = words;
        generateDictionary(words);
    }

     private void generateDictionary(String[] words){
        for(int i=0;i<words.length;i++){
            String temp = getFormattedWord(words[i]);
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);

        }
      //  System.out.println(hm);

    }
    public  boolean isUnique(String word){

        String formattedWord = getFormattedWord(word);
        if(!hm.containsKey(formattedWord)) {
            System.out.println("Entered word is not in mentioned dictionary");
            return true;
        }
        else if(hm.get(formattedWord)>1)
            return false;
        else
            return true;
    }

    public  String abbreviate(String word){
        if(word.length()<2)
            return "Cannot abbreviate when the length of word is less than 2";
        StringBuffer sb =  new StringBuffer();

        sb.append(word.charAt(0));
        sb.append(word.length()-2);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }

     private String getFormattedWord(String word){
        String temp;
        if(word.length() <  2)
            temp = word;
        else
            temp = abbreviate(word);

        return temp;
    }


    public void printAllUniques(){
        for(String word : words){
            System.out.println(word + " -> " + isUnique(word) );
        }
    }
}
