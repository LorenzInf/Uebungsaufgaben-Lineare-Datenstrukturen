package my_project.view;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.InteractiveGraphicalObject;
import my_project.control.ProgramController;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;



public class InputManager extends InteractiveGraphicalObject {

    /**
     * Objekterzeugung
     * @param programController Nötig als Objekt vom Controllerbereich, das informiert wird
     * @param viewController Nötig, um den Aufruf der Interface-Methoden sicherzustellen
     */
    private ViewController viewController;
    private ProgramController programController;

    /**
     * Objekterzeugung
     * @param programController Nötig als Objekt vom Controllerbereich, das informiert wird
     */
    public InputManager(ProgramController programController, ViewController viewController){
        this.programController = programController;
        this.viewController = viewController;
        viewController.register(this);
    }
    public void keyPressed(int key) {
        switch (key) {

             case KeyEvent.VK_W -> programController.addBoxOnStack();
             case KeyEvent.VK_S -> programController.deleteBoxFromStack();
        }
    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }

}
