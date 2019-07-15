package edu.ujcv.progra2.menus;

public class proyecto {
    public void Terminado() {

        MenuPrincipal menu = new MenuPrincipal();

        do {
            menu.mostrarOpciones();
            menu.Operando(menu.leerOpciones());
        }while (menu.opcion != 3);
    }
}
