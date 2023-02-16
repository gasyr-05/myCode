package Lecture15;
//Создание обобщенного интерфейса
public interface Boxable<T> {
    int getkey();
    T getValue();
    void setValue(T value);
}
