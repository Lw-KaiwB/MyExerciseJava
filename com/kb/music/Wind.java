package com.kb.music;


import com.kb.unit.Print;

public class Wind extends Instrument {
    void play(Note n){
        Print.print("wind.play() "+n);
    }
    String what(){
        return "wind";
    }
    void adjust(){
        Print.print("Adjusting wind");
    }
}
