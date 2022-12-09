package studyGuide.chapter2;

public class JustSwitch {
    int dayOfWeek = 0;

    void checkTheDay(int dayOfWeek){
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    public static void main(String[] args) {
        JustSwitch justSwitch = new JustSwitch();
        justSwitch.checkTheDay(justSwitch.dayOfWeek);
    }

}
