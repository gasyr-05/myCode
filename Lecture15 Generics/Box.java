package Lecture15;

public class Box<E, T> {
    private E key;
    private T value;
    public Box(E key, T value){
        this.key = key;
        this.value = value;
    }
    public E getKey(){
        return key;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    Box<String, String> box3 = new Box<>("Шапка", "Шапка");
}
