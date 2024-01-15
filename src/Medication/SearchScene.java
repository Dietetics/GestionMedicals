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

import java.util.ArrayList;


public class SearchScene {
    private double width, height;
    private Scene menuScene, searchScene;
    private CheckBox done, nouveau, daybreak, morning, noon, evening, night, sleep;
    private TextField searchTerm;
    private ComboBox name, size, type, use, storage, diff;
    private TextField infos;
    private Button btnGoMenu, btnSearch, btnClear;
    private GridPane grid;
    private Stage primaryStage;
    private IO inputOutput;
    private String path;


    public SearchScene(Stage primaryStage, IO inputOutput, Scene menuScene,double width,double height, String path) {
        this.width = width;
        this.height = height;
        this.primaryStage = primaryStage;
        this.inputOutput = inputOutput;
        this.menuScene = menuScene;
        this.path = path;
    }


    public void refresh(){
        // -------------------------- SearchScene -------------------------- //
        done = new CheckBox();
        nouveau = new CheckBox();
        name = new ComboBox();
        size = new ComboBox();
        type = new ComboBox();
        use = new ComboBox();
        daybreak = new CheckBox();
        morning = new CheckBox();
        noon = new CheckBox();
        evening = new CheckBox();
        night = new CheckBox();
        sleep = new CheckBox();
        storage = new ComboBox();
        diff = new ComboBox();
        infos = new TextField();

        done.setSelected(false);
        nouveau.setSelected(false);

        daybreak.setSelected(false);
        morning.setSelected(false);
        noon.setSelected(false);
        evening.setSelected(false);
        night.setSelected(false);
        sleep.setSelected(false);



        boolean meme = false;

        ArrayList<String> comboName = inputOutput.readColumn(path,2);
        name.getItems().add(comboName.get(0));
        for (int i=1; i < comboName.size(); i++){
            meme = false;
            for ( int j=0; j <= i-1; j++){ if (comboName.get(i).equals(comboName.get(j))) meme = true; }
            if (meme == false) name.getItems().add(comboName.get(i));
        }

        ArrayList<String> comboSize = inputOutput.readColumn(path,3);
        size.getItems().add(comboSize.get(0));
        for (int i=1; i < comboSize.size(); i++){
            meme = false;
            for ( int j=0; j <= i-1; j++){ if (comboSize.get(i).equals(comboSize.get(j))) meme = true; }
            if (meme == false) size.getItems().add(comboSize.get(i));
        }

        ArrayList<String> comboType = inputOutput.readColumn(path,4);
        type.getItems().add(comboType.get(0));
        for (int i=1; i < comboType.size(); i++){
            meme = false;
            for ( int j=0; j <= i-1; j++){ if (comboType.get(i).equals(comboType.get(j))) meme = true; }
            if (meme == false) type.getItems().add(comboType.get(i));
        }

        ArrayList<String> comboUse = inputOutput.readColumn(path,5);
        use.getItems().add(comboUse.get(0));
        for (int i=1; i < comboUse.size(); i++){
            meme = false;
            for ( int j=0; j <= i-1; j++){ if (comboUse.get(i).equals(comboUse.get(j))) meme = true; }
            if (meme == false) use.getItems().add(comboUse.get(i));
        }

        ArrayList<String> comboStorage = inputOutput.readColumn(path,12);
        storage.getItems().add(comboStorage.get(0));
        for (int i=1; i < comboStorage.size(); i++){
            meme = false;
            for ( int j=0; j <= i-1; j++){ if (comboStorage.get(i).equals(comboStorage.get(j))) meme = true; }
            if (meme == false) storage.getItems().add(comboStorage.get(i));
        }

        ArrayList<String> comboDiff = inputOutput.readColumn(path,13);
        diff.getItems().add(comboDiff.get(0));
        for (int i=1; i < comboDiff.size(); i++){
            meme = false;
            for ( int j=0; j <= i-1; j++){ if (comboDiff.get(i).equals(comboDiff.get(j))) meme = true; }
            if (meme == false) diff.getItems().add(comboDiff.get(i));
        }


        name.setPromptText("Name");
        size.setPromptText("Size");
        type.setPromptText("Type");
        use.setPromptText("What use");
        storage.setPromptText("Storage");
        diff.setPromptText("Difference");
        infos.setPromptText("commentaires");
//        type.setEditable(true);

        btnGoMenu = new Button("Back");
        btnSearch = new Button("Search");
        btnClear = new Button("Clear");


        grid = new GridPane();

        grid.setVgap(15);
        grid.setHgap(10);
        grid.setPadding(new Insets(40, 40, 40, 40));

        grid.add(new Label("Done: "), 1, 0);
        grid.add(new Label("Nouveau: "), 1, 1);

        grid.add(new Label("daybreak: "), 3, 0);
        grid.add(new Label("morning: "), 3, 1);
        grid.add(new Label("noon: "), 3, 2);
        grid.add(new Label("evening: "), 3, 3);
        grid.add(new Label("night: "), 3, 4);
        grid.add(new Label("sleep: "), 3, 5);

        grid.add(done, 2, 0);
        grid.add(nouveau, 2, 1);

        grid.add(daybreak, 4, 0);
        grid.add(morning, 4, 1);
        grid.add(noon, 4, 2);
        grid.add(evening, 4, 3);
        grid.add(night, 4, 4);
        grid.add(sleep, 4, 5);


        grid.add(name, 5, 0);
        grid.add(size, 5, 1);
        grid.add(type, 5, 2);
        grid.add(use, 5, 3);
        grid.add(storage, 5, 4);
        grid.add(diff, 5, 5);

        grid.add(infos, 5, 6);

        grid.add(btnGoMenu, 6, 11);
        grid.add(btnSearch, 7, 11);
        grid.add(btnClear, 8, 11);

        searchScene = new Scene(grid, width, height);





        // interaction part
        btnGoMenu.setOnAction(e -> primaryStage.setScene(menuScene));



        btnSearch.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                SearchItemsScene searchItems = new SearchItemsScene(primaryStage,inputOutput,searchScene,width,height,
                        done.isSelected(), nouveau.isSelected(), name.getValue(), size.getValue(), type.getValue(), use.getValue(),
                        daybreak.getText(), morning.getText(), noon.getText(), evening.getText(), night.getText(), sleep.getText(),
                        storage.getValue(), diff.getValue(), infos.getText(),path);

                searchItems.refresh();
                primaryStage.setScene(searchItems.getSearchItemsScene());
            }
        });


        btnClear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                done.setSelected(false);
                nouveau.setSelected(false);
                name.setValue("");
                size.setValue("");
                type.setValue("");
                use.setValue("");
                daybreak.setSelected(false);
                morning.setSelected(false);
                noon.setSelected(false);
                evening.setSelected(false);
                night.setSelected(false);
                sleep.setSelected(false);
                storage.setValue("");
                diff.setValue("");
                infos.setText("");
            }
        });
    }

    public Scene getSearchScene() {
        return searchScene;
    }

    public void setSearchScene(Scene searchScene) {
        this.searchScene = searchScene;
    }
}
