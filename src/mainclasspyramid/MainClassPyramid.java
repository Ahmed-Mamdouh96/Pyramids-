/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclasspyramid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class MainClassPyramid  {


 
    public static void main(String[] args) throws IOException {
        PyramidCsvDao myp = new PyramidCsvDao();
        List <Pyramid> pyramids = new ArrayList<>();
        pyramids = myp.readPyramidsFromCsv("D:\\ITI\\Java\\pyramids.csv");
        
        Collections.sort(pyramids, new SortClass().reversed()); // Sorting then Arrange Descending 

        int i =1;
        for(Pyramid p1: pyramids) {
           System.out.println("Pyramid #"+(i++)+" -- "+p1.getPharaoh()+" -- " + p1.getModern_name()+" -- "+p1.getSite()+" -- "+p1.getHeight());}
            
             
       
         Map < String, Integer > NumOfSites= new LinkedHashMap<>();
         for(Pyramid p: pyramids)
         {
             String site = p.getSite();
             Integer count = NumOfSites.get(site);
             if (count == null )
             { 
                 count =1;
             }
             else {
                 count++;
             } 
             NumOfSites.put(site, count);
         } 
                
           System.out.println("\n"+NumOfSites);           

} }

