package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Stack;
import my_project.model.QueueBall;
import my_project.model.StackBox;
import my_project.view.InputManager;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute
    //Todo 1A Mache ein neues 2D String / int Array und stelle dieses beliebig in der View da

    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    private Stack<StackBox> boxStack;
    private StackBox lastBoxInStack;
    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        new InputManager(this,viewController);
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        /* Todo 5Q Implementiere die funktion, dass wenn "D" gedrückt wird ein Kreis auftaucht und in eine Queue getan
         * Todo 5Q wird, aus der Queue mit "A" wieder entfernt wird und mit "S" die Farbe des vordersten Kreises
         * Todo 5Q zu einer zufälligen anderen Farbe geändert wird */
        QueueBall queueBall1 = new QueueBall(150,150);
        viewController.draw(queueBall1);

        boxStack = new Stack<>();
        lastBoxInStack = null;
    }
    //Mit W und S sollte am Ende eine neue Box erstellt/gelöscht werden können
    //TODO 05S Verfolständige die Methode addBoxOnStack in der ein neues Objekt erstellt wird und dieses auf den Stack gelegt wird
    public void addBoxOnStack(){

    }
    //TODO 06S Verfolständige die Methode deleteBoxFromStack, welche das oberste Objekt löschen soll
    public void deleteBoxFromStack(){

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
