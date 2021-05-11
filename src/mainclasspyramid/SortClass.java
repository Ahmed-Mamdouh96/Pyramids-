/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclasspyramid;

import java.util.Comparator;

/**
 *
 * @author lenovo
 */
public class SortClass implements Comparator<Pyramid> 
{

    
    @Override
    public int compare(Pyramid o1, Pyramid o2) {
         return Double.valueOf(o1.getHeight()).compareTo(o2.getHeight());
    }
    


}
