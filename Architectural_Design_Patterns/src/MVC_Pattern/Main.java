/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Pattern;

/**
 *
 * @author A_Murad
 */
public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
        view.setController(controller);
        model.addListener(view);
        model.updateViews();
    }
}
