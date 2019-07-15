package edu.ujcv.progra2.menus;
import edu.ujcv.progra2.matriz.IGMatR2;
import edu.ujcv.progra2.matriz.IGMatR3;
import edu.ujcv.progra2.matriz.IGMatR4;
import edu.ujcv.progra2.vector.IGVecR4;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class MenMat {
    public int opcion;
    LectorDeTecladoValidado lec = LectorDeTecladoValidado.getInstance();

    public void mostrarOpcionesMatR2 (){
        System.out.println("Matrices de O2");
        System.out.println("1.- Suma \n2.- Resta \n3.- Multiplicación Normal \n4.- Multiplicación por Vector \n5.- Multiplicación por Escalar \n6.- Rotación \n7.- Regresar") ;
    }

    public int leerOpcionMatR2 (){
        opcion = lec.getInteger("Ingrese una opcion", "NO válido. Ingrese una opcion valida");
        return opcion;
    }
    public int operandoMatR2 (int opcion){
        switch (opcion){

            case 1:
                IGMatR2 mat1 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGMatR2 mat2 = leerMatR2("Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR2 o = mat1.suma(mat2);

                System.out.println("La suma de matrices es:");
                imprimirMatR2(o);
                break;

            case 2:
                IGMatR2 mat3 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGMatR2 mat4 = leerMatR2("Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR2 o2 = mat3.resta(mat4);

                System.out.println("la resta de marices es: ");
                imprimirMatR2(o2);
                break;

            case 3:
                IGMatR2 mat6 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGMatR2 mat7 = leerMatR2("Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR2 o3 = mat6.mul(mat7);

                System.out.println("La multiplicacion de matrices es: ");
                imprimirMatR2(o3);
                break;
            case 4:
                IGMatR2 mat8 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGVecR2 v = new IGVecR2(0,1);
                v.setX(lec.getDouble("Ingrese el primer numero vector", "NO válido. Ingrese una opcion valida"));
                v.setY(lec.getDouble("Ingrese el segundo numero vector","NO válido. Ingrese una opcion valida"));
                IGVecR2 o4 = mat8.mulvector(v);

                System.out.println("La multiplicacion de matriz por vector es \n" );
                System.out.println("|\t"+ o4.getX()+"\t|");
                System.out.println("|\t"+ o4.getY()+"\t|");
                break;

            case 5:
                double alpha = 0;
                alpha = lec.getDouble("Ingrese el escalar", "NO válido. Ingrese una opcion valida");
                IGMatR2 mat9 = leerMatR2("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGMatR2 o5 = mat9.escalarXmat(alpha);

                System.out.println("La multiplicacion por un escalar es:\n ");
                imprimirMatR2(o5);
                break;
            case 6:
                MenVec mv = new MenVec();
                double angulo = lec.getDouble("Ingrese el angulo", "Error");
                IGVecR2 v1 = mv.LeerVecR2("Vector 1","Ingrese el valor","error");
                IGMatR2 oo = new IGMatR2();
                IGVecR2 resul = oo.rotacion(Math.toRadians(angulo),v1);
                mv.imprimirIGVecR2(resul);
                break;

            case 7:
                System.out.println("Estas de vuelta en el menu principal \n");
                break;
        }
        return opcion;
    }
    public void mostrarOpcionesMatR3() {
        System.out.println("\t Matrices de O3");
        System.out.println("1.- Suma \n2.- Resta \n3.- Multiplicacion por un Escalar \n4.- Multiplicacion por un Vector \n5.- Multiplicacion por una Matriz \n6.- Rotación en X \n7.- Rotación en Y \n8.- Rotación en Z \n9.- Regresar");
    }

    public int leerOpcionesMatR3() {
        opcion = lec.getInteger("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionMatR3(int opcion) {
        switch (opcion) {
            case 1:
                IGMatR3 mat1 = leerMatR3("Matriz 1", "Ingrese la matriz 1",    "NO válido. Ingrese una opcion valida");
                IGMatR3 mat2 = leerMatR3("\n Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR3 o1 = mat1.suma(mat2);

                System.out.println("La suma de matrices es \n");
                imprimirMatR3(o1);
                break;

            case 2:
                IGMatR3 mat3 = leerMatR3("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGMatR3 mat4 = leerMatR3("Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR3 o2 = mat3.resta(mat4);
                System.out.println("La resta de matrices es \n");
                imprimirMatR3(o2);
                break;
            case 3:
                double alpha = 0;
                alpha = lec.getDouble("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                IGMatR3 mat5 = leerMatR3("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGMatR3 res3 = mat5.escalarXmat(alpha);
                System.out.println("La multiplicacion de una matriz por un escalar es \n");
                imprimirMatR3(res3);
                break;

            case 4:

                IGMatR3 mat6 = leerMatR3 ("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGVecR3 v = new IGVecR3(0,1,0);
                v.setX(lec.getDouble("Ingrese el primer numero del vector", "NO válido. Ingrese una opcion valida"));
                v.setY(lec.getDouble("Ingrese el segundo numero del vector","NO válido. Ingrese una opcion valida"));
                v.setZ(lec.getDouble("Ingrese el tercer numero del vector", "NO válido. Ingrese una opcion valida"));
                IGVecR3 o4 = mat6.mulvector(v);

                System.out.println("La multiplicacion de matriz por vector es \n" );
                System.out.println("|\t"+ o4.getX()+"\t|");
                System.out.println("|\t"+ o4.getY()+"\t|");
                System.out.println("|\t"+ o4.getZ()+"\t|");
                break;

            case 5:

                IGMatR3 mat7 = leerMatR3("Matriz 1", "Ingrese la matriz 1",    "NO válido. Ingrese una opcion valida");
                IGMatR3 mat8 = leerMatR3("\n Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR3 o5 = mat7.mul(mat8);

                System.out.println("La multiplicacion de matrices es \n");
                imprimirMatR3(o5);
                break;

            case 6:
                MenVec mv = new MenVec();
                double angulo = lec.getDouble("Ingrese el angulo", "Error");
                IGVecR3 v1 = mv.LeerVecR3("Vector 1","Ingrese el valor","error");
                IGMatR3 k = new IGMatR3();
                IGVecR3 resul2 = k.rotX(Math.toRadians(angulo),v1);
                mv.imprimirIGVecR3(resul2);
                break;

            case 7:
                MenVec m = new MenVec();
                double an1 = lec.getDouble("Ingrese el angulo", "Error");
                IGVecR2 v2 = m.LeerVecR2("Vector 1","Ingrese el valor","error");
                IGMatR2 l = new IGMatR2();
                IGVecR2 res = l.rotacion(Math.toRadians(an1),v2);
                m.imprimirIGVecR2(res);
                break;

            case 8:
                MenVec m1 = new MenVec();
                double ang = lec.getDouble("Ingrese el angulo", "Error");
                IGVecR2 v3 = m1.LeerVecR2("Vector 1","Ingrese el valor","error");
                IGMatR2 e = new IGMatR2();
                IGVecR2 w = e.rotacion(Math.toRadians(ang),v3);
                m1.imprimirIGVecR2(w);
                break;

            case 9:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public void mostrarOpcionesMatR4() {
        System.out.println("\t \t \t \t Matrices de O4");
        System.out.println("\n1.- Suma \n2.- Resta \n3.- Multiplicacion por un escalar \n4.- Multiplicacion por un vector \n5.- Multiplicacion por una matriz \n6.- Regresar al menu principal");
    }

    public int leerOpcionesMatR4() {
        opcion = lec.getInteger("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public int procesarOpcionMatR4(int opcion) {
        switch (opcion) {
            case 1:
                IGMatR4 mat1 = leerMatR4("Matriz 1", "Ingrese la matriz 1",    "NO válido. Ingrese una opcion valida");
                IGMatR4 mat2 = leerMatR4("\n Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR4 o1 = mat1.suma(mat2);

                System.out.println("La suma de matrices es \n");
                imprimirMatR4(o1);
                break;

            case 2:
                IGMatR4 mat3 = leerMatR4("Matriz 1", "Ingrese la matriz 1",    "NO válido. Ingrese una opcion valida");
                IGMatR4 mat4 = leerMatR4("\n Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR4 res2 = mat3.suma(mat4);
                System.out.println("La suma de matrices es \n");
                imprimirMatR4(res2);
                break;

            case 3:
                double alpha = 0;
                alpha = lec.getDouble("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                IGMatR4 mat5 = leerMatR4("Matriz 1", "Ingrese la matriz 1", "Error ha ingresado un caracter no valido");
                IGMatR4 res3 = mat5.mulEscalar(alpha);

                System.out.println("La multiplicacion de una matriz por un escalar es \n");
                imprimirMatR4(res3);
                break;

            case 4:
                IGMatR4 mat6 = leerMatR4("Matriz 1", "Ingrese la matriz 1", "NO válido. Ingrese una opcion valida");
                IGVecR4 v = new IGVecR4(0, 1, 0, 0);
                v.setX(lec.getDouble("Ingrese el primer numero del vector",  "NO válido. Ingrese una opcion valida"));
                v.setY(lec.getDouble("Ingrese el segundo numero del vector", "NO válido. Ingrese una opcion valida"));
                v.setZ(lec.getDouble("Ingrese el tercer numero del vector",  "NO válido. Ingrese una opcion valida"));
                v.setA(lec.getDouble("Ingrese el tercer numero del vector",  "NO válido. Ingrese una opcion valida"));
                IGVecR4 res4 = mat6.mulVector(v);

                System.out.println("La multiplicacion de matriz por vector es \n");
                System.out.println("|\t" + res4.getX() + "\t|");
                System.out.println("|\t" + res4.getY() + "\t|");
                System.out.println("|\t" + res4.getZ() + "\t|");
                System.out.println("|\t" + res4.getA() + "\t|");
                break;

            case 5:
                IGMatR4 mat7 = leerMatR4("Matriz 1", "Ingrese la matriz 1",    "NO válido. Ingrese una opcion valida");
                IGMatR4 mat8 = leerMatR4("\n Matriz 2", "Ingrese la matriz 2", "NO válido. Ingrese una opcion valida");
                IGMatR4 res5 = mat7.mul(mat8);

                System.out.println("La multiplicacion de matrices es \n");
                imprimirMatR4(res5);
                break;

            case 6:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;

    }

    public IGMatR2 leerMatR2(String nombreMatriz, String mensaje, String mensajeError) {
        IGVecR2 col1 = new IGVecR2(1, 0);
        IGVecR2 col2 = new IGVecR2(0, 1);
        System.out.println(nombreMatriz);
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (i == 1 && j == 1)
                    col1.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 1 && j == 2)
                    col2.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 1)
                    col1.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 2)
                    col2.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
            }
        }
        return new IGMatR2(col1,col2);
    }

    public IGMatR3 leerMatR3 (String nombreMatriz, String mensaje, String mensajeError) {
        IGVecR3 col1 = new IGVecR3(1,0,0);
        IGVecR3 col2 = new IGVecR3(0, 1,0);
        IGVecR3 col3 = new IGVecR3(0,0,1);
        System.out.println(nombreMatriz);
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 1 && j == 1)
                    col1.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 1 && j == 2)
                    col2.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 1 && j == 3)
                    col3.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 1)
                    col1.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 2)
                    col2.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 3)
                    col3.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 3 && j == 1)
                    col1.setZ(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 3 && j == 2)
                    col2.setZ(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 3 && j == 3)
                    col3.setZ(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
            }
        }
        return new IGMatR3(col1,col2,col3);
    }

    public IGMatR4 leerMatR4(String nombreMatriz, String mensaje, String mensajeError) {
        IGVecR4 col1 = new IGVecR4(1,0,0,0);
        IGVecR4 col2 = new IGVecR4(0, 1,0,0);
        IGVecR4 col3 = new IGVecR4(0,0,1,0);
        IGVecR4 col4 = new IGVecR4(0,0,1,0);
        // mensaje:
        // ingrese el valor de fila %i, columna %i de matriz n
        System.out.println(nombreMatriz);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 1 && j == 1)
                    col1.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 1 && j == 2)
                    col2.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 1 && j == 3)
                    col3.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 1 && j == 4)
                    col4.setX(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 1)
                    col1.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 2)
                    col2.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 3)
                    col3.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 2 && j == 4)
                    col4.setY(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 3 && j == 1)
                    col1.setZ(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 3 && j == 2)
                    col2.setZ(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 3 && j == 3)
                    col3.setZ(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 3 && j == 4)
                    col4.setZ(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 4 && j == 1)
                    col1.setA(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 4 && j == 2)
                    col2.setA(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 4 && j == 3)
                    col3.setA(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
                if (i == 4 && j == 4)
                    col4.setA(lec.getDouble("Ingrese el valor de fila " + i + " de la columna " + j, "NO válido. Ingrese una opcion valida"));
            }
        }
        return new  IGMatR4(col1,col2,col3,col4);
    }

    public void imprimirMatR2(IGMatR2 a){
        System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol1().getX() + "\t|");
        System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol1().getY() + "\t|");
    }

    public void imprimirMatR3(IGMatR3 a){
        System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol2().getX() + "  " + a.getCol3().getX() + "\t|");
        System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol2().getY() + "  " + a.getCol3().getY() + "\t|");
        System.out.println("|\t" + a.getCol1().getZ() + "  " + a.getCol2().getZ() + "  " + a.getCol3().getZ() + "\t|");
    }

    public void imprimirMatR4(IGMatR4 a){
        System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol2().getX() + "  " + a.getCol3().getX() + "  "+ a.getCol4().getX() + "\t|");
        System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol2().getY() + "  " + a.getCol3().getY() + "  "+ a.getCol4().getY() + "\t|");
        System.out.println("|\t" + a.getCol1().getZ() + "  " + a.getCol2().getZ() + "  " + a.getCol3().getZ() + "  "+ a.getCol4().getZ() + "\t|");
        System.out.println("|\t" + a.getCol1().getA() + "  " + a.getCol2().getA() + "  " + a.getCol3().getA() + "  "+ a.getCol4().getA() + "\t|");
    }

}
