package zad0_dynamiczna_tablica;

public class Array {

    private int[] array;
    private int numberOfElement = 0;

    public Array(){
        this.array = new int[10];
    }


    public void addElement(int element){
        if (!isSpace()){
            makeArrayDoubleSize();
        } else{
            array[numberOfElement]=element;
            numberOfElement++;
        }
    }

    private boolean isSpace(){
        return numberOfElement<array.length;
    }

    private void makeArrayDoubleSize(){
        int[] newArray = new int[array.length*2];
        for (int i=0;i< array.length;i++){
            newArray[i] = array[i];
        }
        array = newArray;

    }





}
