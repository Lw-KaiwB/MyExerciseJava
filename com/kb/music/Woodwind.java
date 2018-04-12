package com.kb.music;

import com.kb.unit.Print;

public class Woodwind extends Wind {
    void play(Note n){
        Print.print("WoodWind.play() "+n);
    }
    String what(){
        return "Woodwind";
    }

}
