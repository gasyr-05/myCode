package Lecture15;

import javax.swing.*;

public class BoxAnyType {
    private int key;
    private Object value;

    public BoxAnyType(int key, Object value){
        this.key = key;
        this.value = value;
    }
    public int getKey() {
        return key;
    }
    public Object getValue(){
        return value;
    }

    public static void main(String[] args) {
        BoxAnyType box3 = new BoxAnyType(2, Math.PI);
        Double value = (Double) box3.getValue();
        System.out.println(value);
    }
}
