package zad1_person;

public enum Gender {
    MAN,
    WOMAN;

    private static void wypisz(){
        for(Gender gender : Gender.values()){
            System.out.println(gender.name());
        }
    }
}




