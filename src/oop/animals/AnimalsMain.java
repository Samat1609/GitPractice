package oop.animals;

public class AnimalsMain {
    public static void main(String[] args) {
        Animals cat=new Animals("murka",3);
        Animals cat2=new Animals("Jiraffe");
        System.out.println(cat.voice());
        System.out.println(cat.name);
        System.out.println(cat2.name);
        Animals bn=new Animals(3);
        System.out.println(cat.toString());

    }
}
