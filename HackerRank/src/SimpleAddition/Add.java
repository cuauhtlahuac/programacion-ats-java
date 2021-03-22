/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleAddition;

import java.util.Iterator;

/**
 *
 * @author development
 */
public class Add {

    public String add(int ...nums) {
        int allNums[] = nums;
        int l = nums.length;
        int total = 0;
        String text = "";
               
        for (int i = 0; i < l; i++) {
            total += allNums[i];
            //System.out.println("current: " + allNums[i] + ", total: " + total + ", i: " + i + ", l: " + l);
            if (i+1 == l) {
                text += allNums[i] + "=" + total;
            } else {
                text += allNums[i] + "+";
            }
        }

        System.out.println(text);
        return text;
    }

    public static void main(String[] args) {

    }

}
