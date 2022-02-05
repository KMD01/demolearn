package sda;

public class Array {

    private int[] array;
    private int numberOfElements = 0;

    public Array(){
        this.array = new int[10];
    }


    public void addElement(int element){
        if (!isSpace()){
            makeArrayDoubleSize();
        } else{
            array[numberOfElements]=element;
            numberOfElements++;
        }
    }

    private boolean isSpace(){
        return numberOfElements<array.length;
    }

    private void makeArrayDoubleSize(){
        int[] newArray = new int[array.length*2];
        for (int i=0;i< array.length;i++){
            newArray[i] = array[i];
        }
        array = newArray;

    }





}
