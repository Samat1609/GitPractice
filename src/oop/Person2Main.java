package oop;

public class Person2Main {
    public static void main(String[] args) {
//        Создать класс Person в ней создать свойства имя и возраст
//        В другом классе создать 5 объектов по шаблону класса Person
//        Все имена объектов сохранить в ключе Map, а возраст в значении Map



        Person2 singer=new Person2();
        singer.name="Mirbek";
        singer.age=36;
        singer.name1="Sultan";
        singer.age1=36;
        singer.name2="Toktobek";
        singer.age2=47;

        Person2 dance=new Person2();
        Person2 sleep=new Person2();
        Person2 eat=new Person2();
        Person2 smile=new Person2();
        System.out.println(singer.getName());
        System.out.println(smile.getName());


    }
}
