package com.kb.music;

import com.kb.unit.Print;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

public class Instrument {
    void play(Note e) {
        Print.print("Instrument.play() " + e);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        Print.print("Adjusting Instrument");
    }

}
