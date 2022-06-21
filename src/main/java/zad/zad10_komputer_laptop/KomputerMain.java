package zad.zad10_komputer_laptop;

public class KomputerMain {
    public static void main(String[] args) {

        Komputer[] komputers = new Komputer[5];
        komputers[0] = new Laptop(100,"mak",TypProcesora.JEDNORDZENIOWY,20.3,false);
        komputers[1] = new Laptop(100,"del",TypProcesora.WIELORDZENIOWY,51.3,false);
        komputers[2] = new Laptop(100,"asus",TypProcesora.JEDNORDZENIOWY,50.3,false);
        komputers[3] = new Laptop(100,"hape",TypProcesora.WIELORDZENIOWY,21.3,false);
        komputers[4] = new Laptop(100,"mak",TypProcesora.JEDNORDZENIOWY,2.3,true);

        int i=0;
        while( i<komputers.length){
            System.out.println(komputers[i]);
            i++;
        }

    }
}
