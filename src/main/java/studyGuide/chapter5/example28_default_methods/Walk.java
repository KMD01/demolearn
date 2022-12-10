package studyGuide.chapter5.example28_default_methods;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
