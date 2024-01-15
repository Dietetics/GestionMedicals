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



public class ModifyScene {
    private int row;
    private double width, height;
    private Scene menuScene, modifyScene;
    private CheckBox done, nouveau;
    private TextField name, size, use, daybreak, morning, noon, evening, night, sleep, storage, diff;
    private TextArea infos;
    private ComboBox type;
    private Button btnGoAll, btnModify, btnClear;
    private GridPane grid;
    private Stage primaryStage;
    private IO inputOutput;
    private String path;


    public ModifyScene(Stage primaryStage, IO inputOutput, Scene menuScene, double width,double height, String path, int row) {
        this.width = width;
        this.height = height;
        this.primaryStage = primaryStage;
        this.inputOutput = inputOutput;
        this.menuScene = menuScene;
        this.path = path;
        this.row = row;
    }


    public void refresh(){
        // -------------------------- ModifyScene -------------------------- //
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

        btnGoAll = new Button("Back");
        btnModify = new Button("Modify");
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

        grid.add(btnGoAll, 1, 9);
        grid.add(btnModify, 2, 9);
        grid.add(btnClear, 3, 9);


        modifyScene = new Scene(grid, width, height);






        AllScene all = new AllScene(primaryStage,inputOutput,menuScene,width,height,path);
        btnGoAll.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                all.refresh();
                primaryStage.setScene(all.getAllScene());
            }
        });






        btnModify.setOnAction(e -> modifyButtonClicked());
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

    public void modifyButtonClicked(){

        inputOutput.write15(
                done.isSelected(), nouveau.isSelected(), name.getText(), size.getText(), type.getValue(), use.getText(),
                daybreak.getText(), morning.getText(), noon.getText(), evening.getText(), night.getText(), sleep.getText(),
                storage.getText(), diff.getText(), infos.getText(), path);

        inputOutput.csvRemoveStringRow(path, row);


    }

    public Scene getModifyScene() {
        return modifyScene;
    }

    public void setModifyScene(Scene modifyScene) {
        this.modifyScene = modifyScene;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public CheckBox getDone() {
        return done;
    }

    public void setDone(CheckBox done) {
        this.done = done;
    }

    public CheckBox getNouveau() {
        return nouveau;
    }

    public void setNouveau(CheckBox nouveau) {
        this.nouveau = nouveau;
    }

    public TextField getName() {
        return name;
    }

    public void setName(TextField name) {
        this.name = name;
    }

    public TextField getSize() {
        return size;
    }

    public void setSize(TextField size) {
        this.size = size;
    }

    public TextField getUse() {
        return use;
    }

    public void setUse(TextField use) {
        this.use = use;
    }

    public TextField getDaybreak() {
        return daybreak;
    }

    public void setDaybreak(TextField daybreak) {
        this.daybreak = daybreak;
    }

    public TextField getMorning() {
        return morning;
    }

    public void setMorning(TextField morning) {
        this.morning = morning;
    }

    public TextField getNoon() {
        return noon;
    }

    public void setNoon(TextField noon) {
        this.noon = noon;
    }

    public TextField getEvening() {
        return evening;
    }

    public void setEvening(TextField evening) {
        this.evening = evening;
    }

    public TextField getNight() {
        return night;
    }

    public void setNight(TextField night) {
        this.night = night;
    }

    public TextField getSleep() {
        return sleep;
    }

    public void setSleep(TextField sleep) {
        this.sleep = sleep;
    }

    public TextField getStorage() {
        return storage;
    }

    public void setStorage(TextField storage) {
        this.storage = storage;
    }

    public TextField getDiff() {
        return diff;
    }

    public void setDiff(TextField diff) {
        this.diff = diff;
    }

    public TextArea getInfos() {
        return infos;
    }

    public void setInfos(TextArea infos) {
        this.infos = infos;
    }

    public ComboBox getType() {
        return type;
    }

    public void setType(ComboBox type) {
        this.type = type;
    }
}
