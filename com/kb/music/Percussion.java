package com.kb.music;

import com.kb.unit.Print;

public class Percussion extends Instrument{
    void play(Note n){
        Print.print("Percussion.play() "+n);
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        Print.print("Adjusting Percussion");
    }
}
