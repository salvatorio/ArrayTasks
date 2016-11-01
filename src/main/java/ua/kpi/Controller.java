package ua.kpi;

/**
 * Created on 1. November. 16.
 *
 * @author Evgeniy
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
