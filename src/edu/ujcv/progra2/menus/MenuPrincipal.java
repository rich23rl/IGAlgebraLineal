package edu.ujcv.progra2.menus;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;


public class MenuPrincipal {
    MVectores MenVec = new MVectores();
    MMatrices MenMat = new MMatrices();
    public int opcion;

    public void mostrarOpciones (){

        System.out.println("\t\tCalculadora de Algebra Lineal");
        System.out.println("1.- Vectores \n2.- Matrices \n3.- Salir");
    }
    public int leerOpciones(){
        opcion = l.getInteger("ingrese una opcion", "Usted ingreso una opcion no valida");
        return opcion;
    }

    public void Operando (int opcion){
        switch (opcion){
            case 1:
                MenVec.presentarOpciones();
                MenVec.procesarOpcion(MenVec.leerOpciones());
                break;

            case 2:
                MenMat.mostrarOpciones();
                MenMat.procesarOpcion(MenMat.leerOpciones());
                break;

            case 3:
                System.out.println("Ha Salido");
                break;
        }

    }
    LectorDeTecladoValidado l = LectorDeTecladoValidado.getInstance();
}
