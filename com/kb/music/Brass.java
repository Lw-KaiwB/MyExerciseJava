package com.kb.music;

import com.kb.unit.Print;

public class Brass extends Wind{
    void play(Note e){
        Print.print("Brass.play() "+e);
    }
    void adjust(){
        Print.print("Adjusting Brass");
    }
}
