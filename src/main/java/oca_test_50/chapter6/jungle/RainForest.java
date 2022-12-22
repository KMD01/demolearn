package oca_test_50.chapter6.jungle;

public class RainForest extends Forest {
    public RainForest(long treeCount) {
        super(treeCount);
        this.treeCount = treeCount + 1;
    }

    public static void main(String[] birds) {
        System.out.print(new RainForest(5).treeCount);
    }
}


