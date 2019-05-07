/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_basicdetail.model.Element;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author Admin
 */
public class Element extends Rectangle {
    private int value;
    private int index;

    public void setIndex(int index) {
        this.index = index;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }
    public Element(int value) {
        super(Constants.WIDTH, value * Constants.HEIGHT);

        this.value = value;
    }
    int compareTo(Element o){
        if(value>o.getValue()) return -1;
        else return 1;
    }
}
