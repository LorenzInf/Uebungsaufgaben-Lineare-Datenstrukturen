package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.QueueBall;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute
    //Todo Array Erzeuge ein neues 2D String / int Array und stelle dieses beliebig in der View da

    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

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
        //Todo 5Q Implementiere die funktion, dass wenn "D" gedrückt wird ein Kreis auftaucht und in eine Queue getan
        // wird, aus der Queue mit "A" wieder entfernt wird und mit "S" die Farbe des vordersten Kreises zu einer
        // zufälligen anderen Farbe geändert wird
        QueueBall queueBall1 = new QueueBall(150,150);
        viewController.draw(queueBall1);

        //Todo 11L Implementiere, ähnlich zu der Queue, eine beliebige Visualisierung für die List. Das current Objekt
        // sollte erkennbar und beweglich sein
    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
