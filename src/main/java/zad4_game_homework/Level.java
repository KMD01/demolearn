package zad4_game_homework;

public enum Level {
    BASIC (1),
    STANDARD (2) ,
    ADVANCE(3);

    private final int speed;

    Level(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    void showLevels() {
        Level[] levels = Level.values();
        for (int i = 0; i < levels.length; i++) {
            System.out.println("Levels is: " + levels[i] + "Speed is: " + levels[i].getSpeed());
        }
    }

    void showLevels2(){
        Level[] levelsF = Level.values();
        for (Level level : levelsF) {
            System.out.println(level);
        }
    }

}
