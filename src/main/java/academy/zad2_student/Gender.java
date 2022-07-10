package academy.zad2_student;

public enum Gender {
    MAN,
    WOMAN;

    private static void wypisz(){
        for(Gender gender : Gender.values()){
            System.out.println(gender.name());
        }
    }
}




