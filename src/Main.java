/**
 * Created by cs.ucu.edu.ua on 06.10.2016.
 */
public class Main {
    public static void main(String[]args){
        Poppies poppy_1 = new Poppies("red", 15);
        Poppies poppy_2 = new Poppies("black", 20);
        ShiningStar sh_s1 = new ShiningStar("purple",12);
        ShiningStar sh_s2 = new ShiningStar("white",19);
        Present present1 = new Present();
        System.out.println(present1);
        System.out.println(poppy_1);
        present1.addSweet(poppy_1);
        present1.addSweet(poppy_2);
        present1.addSweet(sh_s1);
        present1.addSweet(sh_s2);
        System.out.println(present1);
        present1.SortSugar();
        System.out.println(present1);
        System.out.println(present1.FindSweet(10,20));
    }
}
