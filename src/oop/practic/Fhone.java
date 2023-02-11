package oop.practic;

public class Fhone {
//    Создайте класс Phone, который содержит переменные number, model и weight.
//    Создайте три экземпляра этого класса.
//    Выведите на консоль значения их переменных.
//    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//    Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//    Вызвать эти методы для каждого из объектов.
//    Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса
//        - number, model и weight.
//    Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number,
//    model.
//    Добавить конструктор без параметров.
//    Вызвать из конструктора с тремя параметрами конструктор с двумя.
//    Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона
//    звонящего. Вызвать этот метод.
//    Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
//    которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
//    Изменить класс Phone в соответствии с концепцией JavaBean. Смотрите решение задачи в
    private int number;
    private String model;
    private double weight;

    public Fhone(int number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public Fhone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Fhone(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public  String receiveCall(String name){
        return "Звонит "+name;
    }
    public int getNumber(int number){
        return number ;
    }
    public String receiceCall(String name,int number){
        return name+" : "+number;
    }

}
