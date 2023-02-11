package oop;

public class PersonMain {
    public static void main(String[] args) {
        Person singer=new Person();
        singer.name="Smat";
        singer.age=59;
        singer.gender='m';
        singer.height=1.78;
        System.out.println(singer.gender);
        System.out.println(singer.name);
        System.out.println("name "+singer.name+"\n");
        System.out.println(singer.sleep());
        System.out.println(singer.dance());
    }
}
