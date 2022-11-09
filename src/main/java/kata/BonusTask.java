package kata;

public class BonusTask {

    public static String giveSalary(final Integer salary, final Boolean bonus) {
        String result;
        Integer newSalary = bonus ? salary * 10 : salary;
        result = "\u00A3" + String.valueOf(newSalary);
        System.out.println("result");
        return result;
    }

}
