package ts.kg;

public class Lesson6 {
   String name;
   int id;
   int age;
   int course;

    public Lesson6(String name, int id, int age, int course) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.course = course;
    }
    public Lesson6 (String name,int age){
        this(name,0,age,0);

    }
    public Lesson6(int id){
        this(null,id,0,0);
    }
    public Lesson6(String name,int course,int age){
        this(name,0,course,age);

    }

    @Override
    public String toString() {
        return "Lesson6{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
