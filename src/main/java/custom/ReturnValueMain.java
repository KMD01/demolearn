package custom;

public class ReturnValueMain {

        public static void main(String[] args) {
        String name = "Kris";
        ReturnValue.printKris(name);
        String returnName = ReturnValue.modifyKris(name);
        ReturnValue.printKris(returnName);
        }

}
