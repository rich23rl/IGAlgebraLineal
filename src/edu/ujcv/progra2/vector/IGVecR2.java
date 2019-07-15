package edu.ujcv.progra2.vector;

public class IGVecR2 {
    /*
    Privado los datos
    Un escalar que represente 'x' y 'y' los componentes del vector
    Publico los constructores por defecto, copia, y conveniencia. recuerden a bob
    Publico accesoras y mutadoras
    Publico interfase
    this es el vector a
    c.x = a.x + b.x
    c.y = a.y + b.y
    */
    private double x;
    private double y;

    public IGVecR2(){
        this.x=0;
        this.y=0;
    }
    public IGVecR2(double x, double y){
        this.x=x;
        this.y=y;
    }
    public IGVecR2(IGVecR2 b){
        this.x=b.x;
        this.y=b.y;
    }

    public IGVecR2 suma(IGVecR2 b){
        IGVecR2 r=new IGVecR2();
        r.x=x+b.x;
        r.y=y+b.y;
        return r;
    }

    public IGVecR2 resta(IGVecR2 b){
        IGVecR2 r=new IGVecR2();
        r.x=x-b.x;
        r.y=y-b.y;
        return r;
    }

    public  IGVecR2 escalarPorVector(double alpha){
        IGVecR2 r = new IGVecR2();
        r.x=alpha*x;
        r.y=alpha*y;
        return r;
    }

    public double productoPunto(IGVecR2 b){
        IGVecR2 r = new IGVecR2();
        r.x=x*b.x;
        r.y=y*b.y;
        double ret=r.x+r.y;
        return ret;
    }

    public double magnitud(IGVecR2 b){
        return  Math.sqrt((Math.pow(b.x,2)+ Math.pow(b.y,2)));
    }

    public double magnitud(){
        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
    }

    public double angulo(IGVecR2 a, IGVecR2 b){
        double r;
        r = Math.acos(a.productoPunto(b)/(magnitud(a)*magnitud(b)));
        return Math.toDegrees(r);
    }

    public double getX (){
        return x;
    }

    public void setX (double x){
        this.x = x;
    }

    public double getY (){
        return y;
    }

    public void setY (double y){
        this.y = y;
    }
}
