package IteratorPattern.Matrix_;

import java.util.Iterator;

/*
1. Four attr.
2. @SuppressWarnings("unchecked")
3. cons with casting.
4. getIterator
5. setAndGetItem
6. gerRowAndColumn
7. @Override  hasNextAndNext
8. main
 */
public class Matrix<T> implements Iterator<T> {

//matrix: data structureمصفوفة وهي عبارة عن 
    private int row;
    private int col;
    private T[][] matrix;
    int index;

    @SuppressWarnings("unchecked")
    /*@SuppressWarnings("unchecked") is used when Java generics just don't let you do what you want to, and thus,
    you need to explicitly specify to the compiler that whatever you are doing is legal and can be executed at the time of execution.*/
    //JAVA generics تطبيقات جافا

    //cons
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = (T[][])/*casting*/ new Object[row][col]; //initialize
    }

    public Iterator<T> getIterator() {
        index = -1; //يعيد من الاول 
        return this; //classتعود على اسم الthis
    }

    public void setItem(T t, int i, int j) {
        matrix[i][j] = t;//valueلوضع قيمة 
    }

    public T getItem(int i, int j) {
        return matrix[i][j];//جلب قيمة
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return col;
    }

    @Override
    public boolean hasNext() {
        //colsNumber * rowsNumber=array حجم ال
        return index < (col * row) - 1; //array-1اقل من حجم الindexلو ال
        //result is true or false.
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            index++;
            return this.getItem(index / col/*row*/, index % col/*column*/);
        }
        return null;
    }

    //main
    public static void main(String[] args) {
        Matrix<Integer> m = new Matrix<>(3, 5);
//row=3
//column=5
        for (int i = 0; i < m.getRow(); i++) {
            for (int j = 0; j < m.getColumn(); j++) {
                m.setItem(i * j, i, j);
            }
        }

        Iterator<Integer> iter = m.getIterator();//الطريقة الموحدة
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
