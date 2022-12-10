package studyGuide.chapter5_class.example11;

import studyGuide.chapter5_class.example10.InsufficientDataException;
import studyGuide.chapter5_class.example10.Reptile;

public class Snake extends Reptile {
    protected double getHeight() throws Exception {  // DOES NOT COMPILE
        return 2;
    }
    protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
        return 10;
    }
}
