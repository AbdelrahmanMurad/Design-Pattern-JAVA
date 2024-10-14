/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.Sorting_;

/**
 *
 * @author A_Murad
 */
public class Main {

    public Main() {

        ClientLibrary c = new ClientLibrary();
        int[] numbers = {9, 2, 6, 4, 7, 100, 34, 32414,4, 1,2000};
        c.setSorter(new ListSorterAdapter());
        int[] output = c.process(numbers);
        for (int o : output) {
            System.out.println(o);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }

}
