/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.Sorting_;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class ListSorterLibrary {

      /*
    - You don't need to know the specifics of how the libraries are coded.
    - The focus is on why and how the Adapter Pattern is used to solve the problem of incompatible interfaces.
    - The details of the libraries’ internal implementation are not important for understanding the concept and application of the pattern.- The adapter class either extends a class or implements an interface to inherit its structure.
     */
    
    // input/output: list of integers
    public List<Integer> sort(List<Integer> items) {
        System.out.println("This is the list sorter");
        Collections.sort(items);
        return items;
    }
}
