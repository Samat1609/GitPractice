package oop.incapsulation;

public class Cat {

    protected int id;
    public String name;
    private int age;

    public Cat(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int drimemood(int num1, int num2) {
        if (num1 == 1 && num2 == 1) {
            return num1 + num2;
        }

        return num1;
    }
    public static int drimemood(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
    }

