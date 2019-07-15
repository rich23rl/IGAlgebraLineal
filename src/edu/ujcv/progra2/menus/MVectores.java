package edu.ujcv.progra2.menus;
import edu.ujcv.progra2.menus.MenVec;
import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class MVectores {
    public int opc2;

    MenVec MV = new MenVec();
    LectorDeTecladoValidado lec = LectorDeTecladoValidado.getInstance();

    public void presentarOpciones(){

        System.out.println("\t\t Vectores ");
        System.out.println("\t Dimensiones ");
        System.out.println("1.- Vector en R2 \n2.- Vector en R3 \n3.- Vector en R4 \n4.- Regresar al menu principal");
    }

    public int leerOpciones() {
        opc2 = lec.getInteger("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opc2;
    }

    public int procesarOpcion(int opc2) {
        switch (opc2) {

            case 1:
                MV.mostOpcionR2();
                MV.operacionesR2(MV.leerOpcionR2());
                break;

            case 2:
                MV.mostOpcionR3();
                MV.operacionesR3(MV.leerOpcionR3());
                break;

            case 3:
                MV.mostOpcionR4();
                MV.operacionesR4(MV.leerOpcionR4());
                break;

            case 4:
                System.out.println("Ha regresado al Menu Principal \n\n");
                break;
        }
        return opc2;
    }

}

