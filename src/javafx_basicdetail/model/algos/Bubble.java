/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_basicdetail.model.algos;

import javafx_basicdetail.model.Element.ElementArray;

/**
 *
 * @author Admin
 */
public class Bubble implements Algos{
    private static Bubble Instance = new Bubble();

    public static Bubble getInstance() {
        return Instance;
    }
    public void sort(ElementArray array) {
        for (int i = array.length(); i >= 1; i--) {
            for (int j = 0; j < i - 1; j++)
                array.compareAndSwap(j, j + 1);
            //array.setElement(i - 1, SortArray.ElementState.DONE);
        }
    }
}
