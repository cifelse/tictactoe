package controllers;

public abstract class Controller {
    protected MainController controller;
    /**
     * Allows every controller to access the Main Controller by setting their ControllerMain as the main controller.
     * @param controller the generated ControllerMain in Driver.java
     */
    public void setMainController(MainController controller) {
        this.controller = controller;
    }
}
