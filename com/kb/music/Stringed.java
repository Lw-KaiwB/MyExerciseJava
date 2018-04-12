package com.kb.music;

import com.kb.unit.Print;

public class Stringed extends Instrument {
    void play(Note n){
        Print.print("Stringed.play() "+n);
    }
    String what(){
        return "stringed";
    }
    void adjust(){
        Print.print("Adjusting Stringed");
    }
}
