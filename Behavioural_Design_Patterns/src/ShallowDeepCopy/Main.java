package ShallowDeepCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Main implements Serializable {

    //cons
    public Main() {

        A a1 = new A();

//        //1
//        a1.data = 5;
//        a1.b.x = 100;
//        // Create a shallow copy of a1
//        try {
//            A a2 = (A) a1.clone();
//            a1.data = 7;
//            a1.b.x = 200;
//            System.out.println("a2 = " + a2.data);//5 ظبطت
//            System.out.println("a1 = " + a1.data);//7
//            System.out.println("a2bx = " + a2.b.x);//200 ما بتظبط
//            System.out.println("a1bx = " + a1.b.x);//200
//        } catch (CloneNotSupportedException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
        //2
        // Create a deep copy of ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Ali");
        names.add("Omar");

        try { //writting
            FileOutputStream fos = new FileOutputStream("myObject.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(names);
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try { //reading
            FileInputStream fis = new FileInputStream("myObject.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> names2 = (ArrayList<String>) ois.readObject();
            for (String n : names2) {
                System.out.println(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
