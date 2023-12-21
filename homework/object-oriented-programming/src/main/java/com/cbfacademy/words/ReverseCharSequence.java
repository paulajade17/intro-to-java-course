package com.cbfacademy.words;
import java.lang.CharSequence;


public class ReverseCharSequence implements CharSequence{
    //created a field called word
    String word;
    //created a constructor argument for String word
    public ReverseCharSequence(String word){
        this.word = word;
        
    }
    // Use word.charAt to get a character of a string
    public char charAt(int index){
        return word.charAt(index);
        
        
    }
    public int length(){
        return word.length();
    }

    public CharSequence subSequence(int start, int end){
        return "ula";
    }

}

// subSequence(0, 2) IS EQUAL TO pau
// subSequence(2, 3) IS EQUAL TO ul
// subSequence(1, 4) IS EQUAL TO aula