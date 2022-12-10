package studyGuide.chapter5.example28_default_methods;

public interface Run {
    public default int getSpeed() {
        return 10;

    }
}
