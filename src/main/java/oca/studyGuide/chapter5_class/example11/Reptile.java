package oca.studyGuide.chapter5_class.example11;

import oca.studyGuide.chapter5_class.example10.InsufficientDataException;

public class Reptile {
    protected double getHeight() throws InsufficientDataException {
        return 2;
    }
    protected int getLength() {
        return 10;
    }
}
