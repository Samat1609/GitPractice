package oop.interface2;

public class DemoMain {
    public static void main(String[] args) {

        Eagle eagle=new Eagle("Eagle",true);
        System.out.println(eagle.fly());
        System.out.println(eagle.averageHigth(4589));
        Penguin penguin=new Penguin("Penguine",false);
        System.out.println(penguin);

        System.out.println(Fly.flyIn());

    }
}
