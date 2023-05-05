package oca.studyGuide.chapter5_class.example28_default_methods;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
