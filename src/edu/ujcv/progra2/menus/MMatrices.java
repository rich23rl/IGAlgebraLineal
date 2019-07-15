package edu.ujcv.progra2.menus;
import  edu.ujcv.progra2.utility.LectorDeTecladoValidado ;

public class MMatrices {

    public int opcion;
    MenMat MM = new MenMat();
    LectorDeTecladoValidado lec = LectorDeTecladoValidado.getInstance();


    public void mostrarOpciones () {
        System.out.println("\t\t Matrices ");
        System.out.println("\t Dimensiones ");
        System.out.println("1.- Matriz 2x2 \n2.- Matriz 3x3 \n3.- Matriz 4x4 \n4.- Regresar al menu principal");
    }

    public int leerOpciones() {
        opcion = lec.getInteger("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                MM.mostrarOpcionesMatR2();
                MM.operandoMatR2(MM.leerOpcionMatR2());
                break;
            case 2:
                MM.mostrarOpcionesMatR3();
                MM.procesarOpcionMatR3(MM.leerOpcionesMatR3());
                break;
            case 3:
                MM.mostrarOpcionesMatR4();
                MM.procesarOpcionMatR4(MM.leerOpcionesMatR4());
                break;
            case 4:
                System.out.println("Regreso al menu principal \n\n");
                break;
        }
    }
}
