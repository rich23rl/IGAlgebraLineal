package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR4;

public class IGMatR4 {

    private IGVecR4 col1;
    private IGVecR4 col2;
    private IGVecR4 col3;
    private IGVecR4 col4;

    public IGMatR4(){
        col1 = new IGVecR4(1,0,0,0);
        col2 = new IGVecR4(0,1,0,0);
        col3 = new IGVecR4(0,0,1,0);
        col4 = new IGVecR4(0,0,0,1);
    }

    
}
