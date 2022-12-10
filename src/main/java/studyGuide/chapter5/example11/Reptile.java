package studyGuide.chapter5.example11;

import studyGuide.chapter5.example10.InsufficientDataException;

public class Reptile {
    protected double getHeight() throws InsufficientDataException {
        return 2;
    }
    protected int getLength() {
        return 10;
    }
}
