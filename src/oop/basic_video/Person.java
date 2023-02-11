package oop.basic_video;

public class Person {
    private String name;
    private int age;
    private int id;
    private String career;


    public void status(){
        System.out.println(name+" : "+career);
    }

    public Person(String name, int age, int id, String career) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
    void info(){
        System.out.println(name+" : "+age+" : "+id+" : "+career);
    }

}
