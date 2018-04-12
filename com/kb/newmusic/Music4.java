package com.kb.newmusic;

import com.kb.unit.Print;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

abstract class Instrument {
    public abstract void play(Note e);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note e) {
        Print.print("Wind.play() " + e);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note e) {
        Print.print("Percussion.play() " + e);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note e) {
        Print.print("Stringed.play() " + e);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class Brass extends Wind {
    @Override
    public void play(Note e) {
        Print.print("Brass.play() " + e);
    }

    @Override
    public void adjust() {
        Print.print("Brass.adjust()");
    }
}

class WoodWind extends Wind {
    @Override
    public void play(Note e) {
        Print.print("Woodwind.play()" + e);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

public class Music4 {

    static void tune(Instrument i){
        i.play(Note.C_SHARP);
    }

    static void tuneAll(Instrument[] e){
        for (Instrument i:e){
            tune(i);
        }
    }

    public static void main(String[] args){
        Instrument[] orchestra ={new Wind(),new Percussion(),new Stringed(),new Brass(),new WoodWind()};
        tuneAll(orchestra);
    }

}
