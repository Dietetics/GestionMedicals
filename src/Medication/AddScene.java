package Medication;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class AddScene {
    private double width, height;
    private Scene menuScene, addScene;
    private CheckBox done, nouveau;
    private TextField name, size, use, daybreak, morning, noon, evening, night, sleep, storage, diff;
    private TextArea infos;
    private ComboBox type;
    private Button btnGoMenu4Add, btnAdd, btnClear;
    private GridPane grid;
    private Stage primaryStage;
    private IO inputOutput;
    private String path;


    public AddScene(Stage primaryStage, IO inputOutput, Scene menuScene,double width,double height, String path) {
        this.width = width;
        this.height = height;
        this.primaryStage = primaryStage;
        this.inputOutput = inputOutput;
        this.menuScene = menuScene;
        this.path = path;
    }


    public void refresh(){
        // -------------------------- addScene -------------------------- //
        done = new CheckBox();
        nouveau = new CheckBox();
        name = new TextField();
        size = new TextField();
        type = new ComboBox();
        use = new TextField();
        daybreak = new TextField();
        morning = new TextField();
        noon = new TextField();
        evening = new TextField();
        night = new TextField();
        sleep = new TextField();
        storage = new TextField();
        diff = new TextField();
        infos = new TextArea();

        done.setSelected(false);
        nouveau.setSelected(false);
        name.setPromptText("Name");
        size.setPromptText("Size");
        type.getItems().addAll("CO",
                "Pompe",
                "Caplet",
                "INJ" );
        type.setPromptText("Type");
        type.setEditable(true);
        use.setPromptText("What use");
        daybreak.setPromptText("daybreak");
        morning.setPromptText("Morning");
        noon.setPromptText("Noon");
        evening.setPromptText("Evening");
        night.setPromptText("Night");
        sleep.setPromptText("sleep");
        storage.setPromptText("Storage");
        diff.setPromptText("Difference");
        infos.setPromptText("commentaires");

        btnGoMenu4Add = new Button("Menu");
        btnAdd = new Button("ADD");
        btnClear = new Button("Clear");


        grid = new GridPane();

        grid.setVgap(15);
        grid.setHgap(10);
        grid.setPadding(new Insets(30, 30, 30, 30));

        grid.add(new Label("Done: "), 1, 0);
        grid.add(done, 2, 0);

        grid.add(new Label("Nouveau: "), 1, 1);
        grid.add(nouveau, 2, 1);

        grid.add(name, 1, 3);
        grid.add(size, 3, 3);
        grid.add(type, 5, 3);

        grid.add(use, 1, 4,2,1);

        grid.add(daybreak, 1, 5);
        grid.add(morning, 2, 5);
        grid.add(noon, 3, 5);
        grid.add(evening, 4, 5);
        grid.add(night, 5, 5);
        grid.add(sleep, 6, 5);

        grid.add(storage, 1, 6);
        grid.add(diff, 3, 6,2,1);

        grid.add(infos, 1, 7,6,2);

        grid.add(btnGoMenu4Add, 1, 9);
        grid.add(btnAdd, 2, 9);
        grid.add(btnClear, 3, 9);

        addScene = new Scene(grid, width, height);





        // interaction part
        btnGoMenu4Add.setOnAction(e -> primaryStage.setScene(menuScene));
        btnAdd.setOnAction(e -> inputOutput.write15(
                done.isSelected(), nouveau.isSelected(), name.getText(), size.getText(), type.getValue(), use.getText(),
                daybreak.getText(), morning.getText(), noon.getText(), evening.getText(), night.getText(), sleep.getText(),
                storage.getText(), diff.getText(), infos.getText(), path));

        btnClear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                done.setSelected(false);
                nouveau.setSelected(false);
                name.setText("");
                size.setText("");
                type.setValue("");
                use.setText("");
                daybreak.setText("");
                morning.setText("");
                noon.setText("");
                evening.setText("");
                night.setText("");
                sleep.setText("");
                storage.setText("");
                diff.setText("");
                infos.setText("");
            }
        });

    }

    public Scene getAddScene() {
        return addScene;
    }

    public void setAddScene(Scene addScene) {
        this.addScene = addScene;
    }
}
