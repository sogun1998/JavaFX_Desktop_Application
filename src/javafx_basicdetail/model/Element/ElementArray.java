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
            int value = (int) ( Math.random() * Constants.RANDOM) + 1;
            eleArr[i] = new Element(value);
            eleArr[i].setIndex(i);

            eleArr[i].setX(Constants.SCENE_WIDTH/2 - Constants.DISTANCE * length/2 + i * Constants.DISTANCE+Constants.LEFT_PANEL_WIDTH/2);
            eleArr[i].setY(Constants.SCENE_HEIGHT * 0.7 - value * Constants.HEIGHT);

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
    public void compareAndSwap(int i, int j) {
        if (compare(i, j) < 0) {
            swap(i, j);
        }
    }
    public int compare(int i, int j){
        return eleArr[i].compareTo(eleArr[j]);
    }
    public  void swap(int i, int j){
        Element tmp = eleArr[i];
        eleArr[i] = eleArr[j];
        eleArr[j] = tmp;

        eleArr[i].setIndex(i);
        eleArr[j].setIndex(j);
    }

    @Override
    public String toString() {
        //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i<eleArr.length; i++) {
            System.out.println(eleArr[i].getValue());
            
        }
        return "Completed";
    }
    
}
