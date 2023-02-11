package operators;

public class JavaOperators {
    public static void main(String[] args) {

        //Арифметиеская операция
        int num1=36;
        int num2=78;
        int result=num1+num2;
        System.out.println(result);

        int yearNow=2022;
        int dateofbirth=1999;
        int result2=yearNow-dateofbirth;
        System.out.println("Arlen is \t\t"+result2);

        float priceofApple=50.5f;
        float kg=3;
        float threekg=priceofApple*kg;
        System.out.println("Three kgs of Apples: \t"+threekg);
        String name="Bishkek";

        System.out.println("312 "+name);

        long num3=348;
        long num4=11;
        int res= (int) (num3/num4);
        System.out.println(res);

        int gh=12;
        int ff=5;
        int rt=gh%ff;
        System.out.println(rt);

        int five=5;
        five++;
        five++;
        five++;
        System.out.println(five++);

        int ten=10;
        ++ten;
        ++ten;
        ++ten;
        System.out.println(++ten);

        int seven=7;
        seven--;
        seven--;
        System.out.println(seven--);

        int six=6;
        --six;
        --six;
        System.out.println(--six);






    }
}
