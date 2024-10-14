/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.Sorting_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class ListSorterAdapter extends ArraySorterLibrary {

    ListSorterLibrary listSorter;//Adaptee

    public ListSorterAdapter() {
        //initialize the listSorter.
        this.listSorter = new ListSorterLibrary();
    }

    @Override
    public int[] sort(int[] numbers) {
        //we need to convert the int[] to List<Integer> then sort it then return it to int[].

        //1. convert the int[] to List<Integer>.
        List<Integer> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(n);
        }

        //sort the numbers
        List<Integer> list2 = listSorter.sort(list);

        //2. convert the List<Integer> to int[].
        int[] output = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            output[i] = list2.get(i);
        }
        return output;
    }

}
