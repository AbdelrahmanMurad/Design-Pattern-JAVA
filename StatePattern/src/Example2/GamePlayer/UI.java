/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2.GamePlayer;

/**
 *
 * @author A_Murad
 */
import Example2.GamePlayer.StateGamePlayer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        javafx.scene.control.Label l1 = new javafx.scene.control.Label("Enemy?");
        RadioButton pa = new RadioButton("Player Approches");
        pa.setUserData("Player Approches");
        RadioButton pr = new RadioButton("Player Runs");
        pr.setUserData("Player Runs");
        ToggleGroup group1 = new ToggleGroup();
        pa.setToggleGroup(group1);
        pr.setToggleGroup(group1);
        HBox hBox1 = new HBox(10, pa, pr);
        hBox1.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
        VBox vBox1 = new VBox(l1, hBox1);
        vBox1.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));

        javafx.scene.control.Label l2 = new javafx.scene.control.Label("Health?");
        RadioButton hFullRadioButton = new RadioButton("Full");
        hFullRadioButton.setUserData("Full");
        RadioButton hLowRadioButton = new RadioButton("Low");
        hLowRadioButton.setUserData("Low");
        RadioButton hNoRadioButton = new RadioButton("No");
        hNoRadioButton.setUserData("No");
        ToggleGroup group2 = new ToggleGroup();
        hFullRadioButton.setToggleGroup(group2);
        hLowRadioButton.setToggleGroup(group2);
        hNoRadioButton.setToggleGroup(group2);
        HBox hBox2 = new HBox(10, hFullRadioButton, hLowRadioButton, hNoRadioButton);
        hBox2.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
        VBox vBox2 = new VBox(l2, hBox2);
        vBox2.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));

        javafx.scene.control.Label l3 = new javafx.scene.control.Label("Ammo?");
        RadioButton AFullRadioButton = new RadioButton("Full");
        AFullRadioButton.setUserData("Full");
        RadioButton ALowRadioButton = new RadioButton("Low");
        ALowRadioButton.setUserData("Low");
        ToggleGroup group3 = new ToggleGroup();
        AFullRadioButton.setToggleGroup(group3);
        ALowRadioButton.setToggleGroup(group3);
        HBox hBox3 = new HBox(10, AFullRadioButton, ALowRadioButton);
        hBox3.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
        VBox vBox3 = new VBox(l3, hBox3);
        vBox3.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));

        javafx.scene.control.Button actionButton = new javafx.scene.control.Button("Action");
//        actionButton.setAlignment(Pos.CENTER);
        actionButton.setCursor(javafx.scene.Cursor.HAND);
        actionButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            StateGamePlayer game = new StateGamePlayer();

            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {
                    switch (group1.getSelectedToggle().getUserData().toString()) {
                        case "Player Approches":
                            game.playerApproaches();
                            break;
                        case "Player Runs":
                            game.playerRuns();
                            break;
                    }
                    switch (group2.getSelectedToggle().getUserData().toString()) {
                        case "Full":
                            game.fullHealth();
                            break;
                        case "Low":
                            game.lowHealth();
                            break;
                        case "No":
                            game.noHealth();
                            break;
                    }
                    switch (group3.getSelectedToggle().getUserData().toString()) {
                        case "Full":
                            game.fullAmmo();
                            break;
                        case "Low":
                            game.lowAmmo();
                            break;
                    }

                } catch (NullPointerException e) {
                    System.out.println("You Should check all Feilds");
                }
            }
        });
        VBox vb = new VBox(vBox1, vBox2, vBox3, actionButton);

        StackPane root = new StackPane(vb);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
