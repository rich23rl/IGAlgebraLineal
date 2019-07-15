package edu.ujcv.progra2.vector;

public class IGVecR3 {

    double x;
    double y;
    double z;

    public IGVecR3(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public IGVecR3 (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public IGVecR3 (IGVecR3 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }

    public IGVecR3 suma(IGVecR3 b){
        IGVecR3 r = new IGVecR3();
        r.x = x + b.x;
        r.y = y + b.y;
        r.z = z + b.z;
        return r;
    }

    public IGVecR3 resta(IGVecR3 b){
        IGVecR3 r = new IGVecR3();
        r.x = x - b.x;
        r.y = y - b.y;
        r.z = z - b.z;
        return r;
    }

    public  IGVecR3 escalarPorVector(double alpha){
        IGVecR3 r = new IGVecR3();
        r.x = alpha * x;
        r.y = alpha * y;
        r.z = alpha * z;
        return r;
    }

    public double productoPunto(IGVecR3 b){
        IGVecR3 r = new IGVecR3();
        r.x = x * b.x;
        r.y = y * b.y;
        r.z = z * b.z;
        double ret = r.x + r.y +r.z;
        return ret;
    }

    public IGVecR3 productoCruz(IGVecR3 b){
        IGVecR3 r = new IGVecR3();
        r.x = (y * b.z) - (z * b.y);
        r.y = (x * b.z) - (z * b.x);
        r.z = (x * b.y) - (y * b.x);
        return r;
    }
    
    public double angulo(IGVecR3 b){
        //TODO: implementar
        return 0.0;
    }

}
