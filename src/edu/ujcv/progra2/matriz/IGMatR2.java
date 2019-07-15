package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

public class IGMatR2 {
/*
    double x1,y1;
    double x2,y2;

    double[][] m;

    IGVecR2 f1;
    IGVecR2 f2;

 */
    private IGVecR2 col1;
    private IGVecR2 col2;

    public IGMatR2(){
        col1 = new IGVecR2(1,0);
        col2 = new IGVecR2(0,1);
    }

    public IGMatR2(IGVecR2 col1, IGVecR2 col2){
        this.col1 = new IGVecR2(col1);
        this.col2 = new IGVecR2(col2);
    }

    public IGMatR2(IGMatR2 b){
        this.col1 = new IGVecR2(b.col1);
        this.col2 = new IGVecR2(b.col2);
    }

    public IGMatR2 suma (IGMatR2 b){
        IGMatR2 r = new IGMatR2();
        r.setCol1 (this.col1.suma(b.col1));
        r.setCol2 (this.col2.suma(b.col2));
        return r;
    }

    public IGMatR2 resta (IGMatR2 b){
        IGMatR2 r = new IGMatR2();
        r.setCol1 (this.col1.resta(b.col1));
        r.setCol2 (this.col2.resta(b.col2));
        return r;
    }

    public IGVecR2 mulvector (IGVecR2 v){
        IGVecR2 r = new IGVecR2();
        r.setX(v.productoPunto(this.getF1()));
        r.setY(v.productoPunto(this.getF2()));
        return r;
    }

    public IGMatR2 mul(IGMatR2 b){
        IGMatR2 r = new IGMatR2();
        r.setCol1(new IGVecR2(this.getF1().productoPunto(b.col1),this.getF1().productoPunto(b.col1)));
        r.setCol2(new IGVecR2(this.getF2().productoPunto(b.col2),this.getF2().productoPunto(b.col2)));
        return r;
    }

    public IGMatR2 escalarXmat(double escalar){
        IGMatR2 r = new IGMatR2();
        r.col1.setX(this.col1.getX() * escalar);
        r.col1.setY(this.col1.getY() * escalar);
        r.col2.setX(this.col2.getX() * escalar);
        r.col2.setY(this.col2.getY() * escalar);
        return r;
    }

    public static IGVecR2 rotacion (double angulo, IGVecR2 b){
        IGMatR2 r = new IGMatR2();
        r.col1.setX(Math.cos(angulo));
        r.col2.setX(-Math.sin(angulo));
        r.col1.setY(Math.sin(angulo));
        r.col2.setY(Math.cos(angulo));
        return r.mulvector(b);
    }

    public IGVecR2 getCol1() {
        return col1;
    }

    public void setCol1 (IGVecR2 col1){
        this.col1 = col1;
    }

    public IGVecR2 getCol2() {
        return col2;
    }

    public void setCol2(IGVecR2 col2) {
        this.col2 = col2;
    }

    public IGVecR2 getF1(){
        IGVecR2 retval = new IGVecR2(col1.getX(),col2.getX());
        return retval;
    }

    public void  setF1(IGVecR2 F1){
        this.col1.setX(F1.getX());
        this.col2.setX(F1.getY());
    }

    public IGVecR2 getF2(){
        IGVecR2 retval = new IGVecR2(col1.getY(),col2.getY());
        return retval;
    }

    public void  setF2 (IGVecR2 F2){
        this.col1.setY(F2.getX());
        this.col2.setY(F2.getY());
    }

}
