package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR3;

public class IGMatR3 {

    private IGVecR3 col1;
    private IGVecR3 col2;
    private IGVecR3 col3;

    public IGMatR3(){
        col1 = new IGVecR3(1,0,0);
        col2 = new IGVecR3(0,1,0);
        col3 = new IGVecR3(0,0,1);
    }

    public IGMatR3(IGVecR3 col1, IGVecR3 col2, IGVecR3 col3){
        this.col1 = new IGVecR3(col1);
        this.col2 = new IGVecR3(col2);
        this.col3 = new IGVecR3(col3);
    }


    public IGMatR3(IGMatR3 b){
        this.col1 = new IGVecR3(b.col1);
        this.col2 = new IGVecR3(b.col2);
        this.col3 = new IGVecR3(b.col3);
    }

    

}
