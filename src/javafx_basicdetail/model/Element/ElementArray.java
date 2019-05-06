/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_basicdetail.model.Element;

/**
 *
 * @author Admin
 */
public class ElementArray {
    private Element[] eleArr;
    public ElementArray(int length) {
        eleArr = new Element[length];

        for (int i = 0; i<length; i++) {
            int value = (int) ( Math.random() * Contants.RANDOM) + 1;
            eleArr[i] = new Element(value);
            eleArr[i].setIndex(i);

            eleArr[i].setX(Contants.SCENE_WIDTH/2 - Contants.DISTANCE * length/2 + i * Contants.DISTANCE);
            eleArr[i].setY(Contants.SCENE_HEIGHT * 0.7 - value * Contants.HEIGHT);

            System.out.print(value + " ");
        }

        System.out.println();
    }
    public Element [] getAll () {
        return eleArr;
    }

    public Element getElementAt(int i) {
        return eleArr[i];
    }

    public int length() {
        return eleArr.length;
    }
}
