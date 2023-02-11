package oop;

public class Student {
        String name;
        int id;
        double sredekonomik;
        double sredmatematika;
        double sredlanguage;
        Student(double sredekonomik,double sredlanguage,double sredmatematika){
                this.sredlanguage=sredlanguage;
                this.sredekonomik=sredekonomik;
                this.sredmatematika=sredmatematika;
        }
        void sredZnachenie(double sredlanguage,double sredmatematika, double sredekonomik){
                double sredZnachenie=(sredekonomik+sredlanguage+sredmatematika)/3;
                System.out.println("Среднее значение : "+sredZnachenie);
        }




        }





