/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclasspyramid;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public interface PyramidDao {
    
    public List<Pyramid> readPyramidsFromCsv(String Filename)throws FileNotFoundException, IOException;
    
    
}
