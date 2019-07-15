package edu.ujcv.progra2.vector;

public class IGVecR2 {
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
    //privado los datos
    // un escalar que represente 'x' y 'y' los componentes del vector
    // publico los constructores por defecto, copia, y conveniencia. recuerden a bob
    // publico accesoras y mutadoras
    //publico interfase
    //this es el vector a
    // c.x = a.x + b.x
    // c.y = a.y + b.y
    public IGVecR2 suma(IGVecR2 b){
        IGVecR2 r=new IGVecR2();
        r.x=x+b.x;
        r.y=y+b.y;
        //TODO: implementar
        return r;
    }

    public IGVecR2 resta(IGVecR2 b){
        IGVecR2 r=new IGVecR2();
        r.x=x-b.x;
        r.y=y-b.y;
        //TODO: implementar
        return r;
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        IGVecR2 r = new IGVecR2();
        r.x=alpha*x;
        r.y=alpha*y;
        //TODO: implementar
        return r;
    }

    public double productoPunto(IGVecR2 b){
        IGVecR2 r = new IGVecR2();
        r.x=x*b.x;
        r.y=y*b.y;
        double ret=r.x+r.y;
        //TODO: implementar
        return ret;
    }

    public double magnitud(IGVecR2 b){
        return  Math.sqrt((Math.pow(b.x,2)+ Math.pow(b.y,2)));
    }

}
