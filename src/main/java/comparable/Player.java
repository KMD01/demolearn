package comparable;

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    Player(int ranking, String name, int age){
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        return -1* Integer.compare((getRanking()),otherPlayer.getRanking());
    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
