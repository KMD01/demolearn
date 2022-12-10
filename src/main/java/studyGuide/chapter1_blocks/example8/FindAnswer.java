package studyGuide.chapter1_blocks.example8;

public class FindAnswer {

    public void findAnswerString(boolean check) {
        String  answer;
        String  answer1;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = "1";
            answer = answer.concat("00");
        } else {
            answer = "2";
        }
        System.out.println(answer);
    }
    public void findAnswerInt(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        FindAnswer findAnswer = new FindAnswer();
        findAnswer.findAnswerInt(true);
        findAnswer.findAnswerString(true);

    }

}
