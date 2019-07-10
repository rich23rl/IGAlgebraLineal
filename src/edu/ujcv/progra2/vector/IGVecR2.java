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
        IGVecR2 retval=new IGVecR2();
        retval.x=x+b.x;
        retval.y=y+b.y;
        //TODO: implementar
        return retval;
    }

    public IGVecR2 resta(IGVecR2 b){
        IGVecR2 retval=new IGVecR2();
        retval.x=x-b.x;
        retval.y=y-b.y;
        //TODO: implementar
        return retval;
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        IGVecR2 retval = new IGVecR2();
        retval.x=alpha*x;
        retval.y=alpha*y;
        //TODO: implementar
        return retval;
    }

    public double productoPunto(IGVecR2 b){
        IGVecR2 retval = new IGVecR2();
        retval.x=x*b.x;
        retval.y=y*b.y;
        double ret=retval.x+retval.y;
        //TODO: implementar
        return ret;
    }
    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){
    //}
    public double determinante(){
        //TODO: implementar
        return 0.0;
    }
/*
    public double angulo(IGVecR2 b){
        IGVecR2 retval = new IGVecR2();
        retval.x=x*b.x;
        retval.y=y*b.y;
        double r=retval.x=x+b.x;
        double t=Math.sqrt(((Math.pow(b.x,2))+Math.pow(b.y,2)));
        double z=Math.sqrt(((Math.pow(x,2))+Math.pow(y,2)));
        double w= Math.toDegees(Math.acos((r/(t*z))));
        //TODO: implementar
        return w;
    }

    public double magnitud(IGVecR2 b){
        IGVecR2 retval = new IGVecR2();
        retval.x=(b.x)-x;
        retval.y=(b.y)-y;
        double r=Math.pow(retval.x,2) + Math.pow(retval.y,2)
        return Math.sqrt(r);
    }

*/
}
