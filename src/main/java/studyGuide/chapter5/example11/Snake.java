package studyGuide.chapter5.example11;

import studyGuide.chapter5.example10.InsufficientDataException;
import studyGuide.chapter5.example10.Reptile;

public class Snake extends Reptile {
    protected double getHeight() throws Exception {  // DOES NOT COMPILE
        return 2;
    }
    protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
        return 10;
    }
}
