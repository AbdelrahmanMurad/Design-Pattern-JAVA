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
public class ClientLibrary {

    /*
    - You don't need to know the specifics of how the libraries are coded.
    - The focus is on why and how the Adapter Pattern is used to solve the problem of incompatible interfaces.
    - The details of the libraries’ internal implementation are not important for understanding the concept and application of the pattern.- The adapter class either extends a class or implements an interface to inherit its structure.
     */
    private ArraySorterLibrary sorter;

    public void setSorter(ArraySorterLibrary sorter) {
        this.sorter = sorter;
    }

    public int[] process(int[] items) {
        // do something with items
        int[] sortedItems = sorter.sort(items);
        return sortedItems;
    }
}
