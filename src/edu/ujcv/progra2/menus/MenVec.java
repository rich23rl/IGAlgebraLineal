package edu.ujcv.progra2.menus;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class MenVec {
    LectorDeTecladoValidado lec = LectorDeTecladoValidado.getInstance();
    public int opcion;

    public void mostOpcionR2(){
        System.out.println("\t\t Vectores en R2 ");
        System.out.println("\t Operaciones ");
        System.out.println("1.- Suma, \n2.- Resta \n3.- Multiplicacion por Escalar \n4.- Producto Punto \n5.- Magnitud  \n6.- Anuglo \n7.- volver al Menu");
    }

    public int leerOpcionR2(){
        opcion = lec.getInteger(" Ingrese una Opcion" , " Ingrese una opcion valida, Ingrese de Nuevo");
        return opcion;
    }

    public int operacionesR2(int opcion) {
        switch (opcion) {
            case 1:
                IGVecR2 A1 = LeerVecR2(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR2 B1 = LeerVecR2(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida" );
                IGVecR2 res = A1.suma(B1);

                System.out.println("La suma de vectores es: \n");
                imprimirIGVecR2 (res);
                break;

            case 2:
                IGVecR2 A2 = LeerVecR2(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR2 B2 = LeerVecR2(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                IGVecR2 res2 = A2.resta(B2);

                System.out.println("La resta de vectores es; \n");
                imprimirIGVecR2(res2);
                break;

            case 3:
                double alpha = 0;
                alpha = lec.getDouble("Ingrese el valor del escalar", "NO válido. Ingrese una opcion valida");
                IGVecR2 A3 = LeerVecR2(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR2 res3 = A3.escalarPorVector(alpha);

                System.out.println("La multiplicación por un escalar es: \n");
                imprimirIGVecR2(res3);
                break;

            case 4:
                IGVecR2 A4 = LeerVecR2(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR2 B4 = LeerVecR2(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                double res4 = A4.productoPunto(B4);

                System.out.println("El restultado del producto punto es: " +res4);
                break;

            case 5:
                IGVecR2 A5 = LeerVecR2(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                double res5 = A5.magnitud(A5);

                System.out.println("El resultado de la magnitud vectorial es: " +res5);
                break;

            case 6:
                IGVecR2 A6 = LeerVecR2(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR2 B6 = LeerVecR2(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                double res6 = A6.angulo(A6,B6);

                System.out.println("El angulo entre dos vectores es: " +res6);
                break;

            case 7:
                System.out.println("Volviendo al Menu \n \n");
                break;
        }
        return opcion;
    }

    public void mostOpcionR3(){
        System.out.println("\t\t Vectores en R3 ");
        System.out.println("\t Operaciones ");
        System.out.println("1.- Suma, \n2.- Resta \n3.- Multiplicacion por Escalar \n4.- Producto Punto \n5.- Magnitud  \n6.- Anuglo \n7.- Producto Cruz \n8.- volver al Menu");
    }

    public int leerOpcionR3(){
        opcion = lec.getInteger(" Ingrese una Opcion" , " Ingrese una opcion valida, Ingrese de Nuevo");
        return opcion;
    }

    public int operacionesR3(int opcion) {
        switch (opcion) {
            case 1:
                IGVecR3 A1 = LeerVecR3(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR3 B1 = LeerVecR3(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida" );
                IGVecR3 res = A1.suma(B1);

                System.out.println("La suma de vectores es: \n");
                imprimirIGVecR3 (res);
                break;

            case 2:
                IGVecR3 A2 = LeerVecR3(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR3 B2 = LeerVecR3(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                IGVecR3 res2 = A2.resta(B2);

                System.out.println("La resta de vectores es; \n");
                imprimirIGVecR3 (res2);
                break;

            case 3:
                double alpha = 0;
                alpha = lec.getDouble("Ingrese el valor del escalar", "NO válido. Ingrese una opcion valida");
                IGVecR3 A3 = LeerVecR3(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR3 res3 = A3.escalarPorVector(alpha);

                System.out.println("La multiplicación por un escalar es: \n");
                imprimirIGVecR3 (res3);
                break;

            case 4:
                IGVecR3 A4 = LeerVecR3(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR3 B4 = LeerVecR3(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                double res4 = A4.productoPunto(B4);

                System.out.println("El restultado del producto punto es: " +res4);
                break;

            case 5:
                IGVecR3 A5 = LeerVecR3(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                double res5 = A5.magnitud(A5);

                System.out.println("El resultado de la magnitud vectorial es: " +res5);
                break;

            case 6:
                IGVecR3 A6 = LeerVecR3(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR3 B6 = LeerVecR3(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                double res6 = A6.angulo(A6,B6);

                System.out.println("El angulo entre dos vectores es: " +res6);
                break;

            case 7:
                IGVecR3 A7 = LeerVecR3(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR3 B7 = LeerVecR3(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                IGVecR3 res7 = A7.productoCruz(B7);

                System.out.println("El producto cruz es: \n");
                imprimirIGVecR3(res7);
                break;
            case 8:
                System.out.println("Volviendo al Menu \n \n");
                break;
        }
        return opcion;
    }

    public void mostOpcionR4(){
        System.out.println("\t\t Vectores en R4 ");
        System.out.println("\t Operaciones ");
        System.out.println("1.- Suma, \n2.- Resta \n3.- Multiplicacion por Escalar \n4.- Producto Punto \n5.- Magnitud  \n6.- Anuglo \n7.- volver al Menu");
    }

    public int leerOpcionR4(){
        opcion = lec.getInteger(" Ingrese una Opcion" , " Ingrese una opcion valida, Ingrese de Nuevo");
        return opcion;
    }

    public int operacionesR4(int opcion) {
        switch (opcion) {
            case 1:
                IGVecR4 A1 = LeerVecR4(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR4 B1 = LeerVecR4(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida" );
                IGVecR4 res = A1.suma(B1);

                System.out.println("La suma de vectores es: \n");
                imprimirIGVecR4 (res);
                break;

            case 2:
                IGVecR4 A2 = LeerVecR4(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR4 B2 = LeerVecR4(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                IGVecR4 res2 = A2.resta(B2);

                System.out.println("La resta de vectores es; \n");
                imprimirIGVecR4(res2);
                break;

            case 3:
                double alpha = 0;
                alpha = lec.getDouble("Ingrese el valor del escalar", "NO válido. Ingrese una opcion valida");
                IGVecR4 A3 = LeerVecR4(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR4 res3 = A3.escalarPorVector(alpha);

                System.out.println("La multiplicación por un escalar es: \n");
                imprimirIGVecR4(res3);
                break;

            case 4:
                IGVecR4 A4 = LeerVecR4(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR4 B4 = LeerVecR4(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                double res4 = A4.productoPunto(B4);

                System.out.println("El restultado del producto punto es: " +res4);
                break;

            case 5:
                IGVecR4 A5 = LeerVecR4(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                double res5 = A5.magnitud(A5);

                System.out.println("El resultado de la magnitud vectorial es: " +res5);
                break;

            case 6:
                IGVecR4 A6 = LeerVecR4(" Vector 1 " ,"Ingrese el vector 1", "NO válido. Ingrese una opcion valida");
                IGVecR4 B6 = LeerVecR4(" Vector 2 " ,"Ingrese el vector 2", "NO válido. Ingrese una opcion valida");
                double res6 = A6.angulo(A6,B6);

                System.out.println("El angulo entre dos vectores es: " +res6);
                break;

            case 7:
                System.out.println("Volviendo al Menu \n \n");
                break;
        }
        return opcion;
    }

    public IGVecR2 LeerVecR2 (String  nombreVec, String mensaje, String mensajeError) {
        IGVecR2 A = new IGVecR2(1.0, 1.1);

        A.setX(lec.getDouble("Ingrese el primer vector",  "NO válido. Ingrese una opcion valida"));
        A.setY(lec.getDouble("Ingrese el segundo vector", "NO válido. Ingrese una opcion valida"));

        return new IGVecR2(A);
    }
    public IGVecR3 LeerVecR3 (String  nombreVec, String mensaje, String mensajeError){
        IGVecR3 A = new IGVecR3(1.0, 1.1, 0.3);

        A.setX(lec.getDouble("Ingrese el primer vector",  "NO válido. Ingrese una opcion valida"));
        A.setY(lec.getDouble("Ingrese el segundo vector", "NO válido. Ingrese una opcion valida"));
        A.setZ(lec.getDouble("Ingrese el tercer vector",  "NO válido. Ingrese una opcion valida"));

        return new IGVecR3(A);
    }
    public IGVecR4 LeerVecR4 (String  nombreVec, String mensaje, String mesajeError){
        IGVecR4 A = new IGVecR4(1.0, 1.1, 0.3, 0.5);

        A.setX(lec.getDouble("Ingrese el primer vector",  "NO válido. Ingrese una opcion valida"));
        A.setY(lec.getDouble("Ingrese el segundo vector", "NO válido. Ingrese una opcion valida"));
        A.setZ(lec.getDouble("Ingrese el tercer vector",  "NO válido. Ingrese una opcion valida"));
        A.setA(lec.getDouble("Ingrese el cuarto vector",  "NO válido. Ingrese una opcion valida"));

        return new IGVecR4(A);
    }

    public void imprimirIGVecR2 (IGVecR2 a){
        System.out.println("(" + a.getX() +","+ a.getY()+ ")");
    }

    public void imprimirIGVecR3(IGVecR3 a){
        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ()+")");
    }

    public void imprimirIGVecR4 (IGVecR4 a){
        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ() +","+ a.getA()+")");
    }
}

