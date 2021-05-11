/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclasspyramid;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PyramidCsvDao implements PyramidDao{
    public PyramidCsvDao() {
    }
     
    
    
    List <Pyramid> pyramids = new ArrayList<>();
   
  

public List<Pyramid> readPyramidsFromCsv(String Filename) throws FileNotFoundException, IOException  
{ 
    
    FileReader fr = new FileReader(Filename);
    BufferedReader br = new BufferedReader(fr);
    String line;
    String[] att;
    line =br.readLine();
   
     do {
            line=br.readLine();
            if (line !=null )
            { 
               att=line.split(",");
               if ( att[7].equals(""))
               {   
                   
                   pyramids.add(new Pyramid(att[0], att[2], att[4], 0));
               }
               else {
                   pyramids.add(new Pyramid(att[0], att[2], att[4], Double.parseDouble(att[7])));
               }
               
                 }
}         while(line != null);
     return pyramids;
}

    
}
