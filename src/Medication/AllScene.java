package Medication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Boolean.parseBoolean;

public class AllScene {
    private double width, height;
    private Scene menuScene, allScene;
    private TableView<Tableau> table;
    private CheckBox done, nouveau;
    private TextField name, size, use, daybreak, morning, noon, evening, night, sleep, storage, diff;
    private TextArea infos;
    private ComboBox type;
    private Button btnGoMenu4All, deleteButton, modifyButton, addButton;
    private Stage primaryStage;
    private IO inputOutput;
    private String path;


    public AllScene(Stage primaryStage, IO inputOutput, Scene menuScene, double width, double height, String path) {
        this.width = width;
        this.height = height;
        this.primaryStage = primaryStage;
        this.inputOutput = inputOutput;
        this.menuScene = menuScene;
        this.path = path;
    }

    public void refresh(){
        // -------------------------- allScene -------------------------- //
        TableColumn<Tableau, String> indexColumn = new TableColumn<>("Index");
        indexColumn.setMinWidth(10);
        indexColumn.setCellValueFactory(new PropertyValueFactory<>("nb"));

        TableColumn<Tableau, String> doneColumn = new TableColumn<>("Done");
        doneColumn.setMinWidth(10);
        doneColumn.setCellValueFactory(new PropertyValueFactory<>("done"));

        TableColumn<Tableau, String> newColumn = new TableColumn<>("New");
        newColumn.setMinWidth(10);
        newColumn.setCellValueFactory(new PropertyValueFactory<>("nouveau"));

        TableColumn<Tableau, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(150);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Tableau, String> sizeColumn = new TableColumn<>("Size");
        sizeColumn.setMinWidth(20);
        sizeColumn.setCellValueFactory(new PropertyValueFactory<>("size"));

        TableColumn<Tableau, String> typeColumn = new TableColumn<>("Type");
        typeColumn.setMinWidth(20);
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<Tableau, String> useColumn = new TableColumn<>("Use");
        useColumn.setMinWidth(50);
        useColumn.setCellValueFactory(new PropertyValueFactory<>("use"));

        TableColumn<Tableau, String> daybreakColumn = new TableColumn<>("起");
        daybreakColumn.setMinWidth(20);
        daybreakColumn.setCellValueFactory(new PropertyValueFactory<>("daybreak"));

        TableColumn<Tableau, String> morningColumn = new TableColumn<>("早上");
        morningColumn.setMinWidth(20);
        morningColumn.setCellValueFactory(new PropertyValueFactory<>("morning"));

        TableColumn<Tableau, String> noonColumn = new TableColumn<>("中午");
        noonColumn.setMinWidth(20);
        noonColumn.setCellValueFactory(new PropertyValueFactory<>("noon"));

        TableColumn<Tableau, String> eveningColumn = new TableColumn<>("傍晚");
        eveningColumn.setMinWidth(20);
        eveningColumn.setCellValueFactory(new PropertyValueFactory<>("evening"));

        TableColumn<Tableau, String> nightColumn = new TableColumn<>("晚上");
        nightColumn.setMinWidth(20);
        nightColumn.setCellValueFactory(new PropertyValueFactory<>("night"));

        TableColumn<Tableau, String> sleepColumn = new TableColumn<>("睡");
        sleepColumn.setMinWidth(20);
        sleepColumn.setCellValueFactory(new PropertyValueFactory<>("sleep"));

        TableColumn<Tableau, String> storageColumn = new TableColumn<>("Storage");
        storageColumn.setMinWidth(30);
        storageColumn.setCellValueFactory(new PropertyValueFactory<>("storage"));

        TableColumn<Tableau, String> diffColumn = new TableColumn<>("Diff");
        diffColumn.setMinWidth(50);
        diffColumn.setCellValueFactory(new PropertyValueFactory<>("diff"));


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
        daybreak.setPromptText("刚起");
        morning.setPromptText("早上");
        noon.setPromptText("中午");
        evening.setPromptText("傍晚");
        night.setPromptText("晚上");
        sleep.setPromptText("睡前");
        storage.setPromptText("Storage");
        diff.setPromptText("Difference");
        infos.setPromptText("Commentaire");


        name.setMaxWidth(150);
        size.setMaxWidth(50);
        type.setMaxWidth(80);
        use.setMaxWidth(150);
        daybreak.setMaxWidth(50);
        morning.setMaxWidth(50);
        noon.setMaxWidth(50);
        evening.setMaxWidth(50);
        night.setMaxWidth(50);
        sleep.setMaxWidth(50);
        storage.setMaxWidth(100);
        diff.setMaxWidth(150);
        infos.setMaxSize(200,10);



        addButton = new Button("ADD");
        modifyButton = new Button("MODIFY");
        deleteButton = new Button("DELETE");
        btnGoMenu4All = new Button("Menu");



        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(done, nouveau, name, size, type, use, diff, btnGoMenu4All, addButton, modifyButton, deleteButton);

        HBox hBox2 = new HBox();
        hBox2.setPadding(new Insets(0, 10, 10, 10));
        hBox2.setSpacing(10);
        hBox2.getChildren().addAll(daybreak, morning, noon, evening, night, sleep, storage, diff, infos);


        table = new TableView<>();
        table.setItems(getTableau());
        table.getColumns().addAll(indexColumn, doneColumn, newColumn, nameColumn, sizeColumn, typeColumn, useColumn, daybreakColumn,
                morningColumn, noonColumn, eveningColumn, nightColumn, sleepColumn, storageColumn, diffColumn);

        VBox root = new VBox();
        root.getChildren().addAll(table, hBox, hBox2);

        allScene = new Scene(root, width + 250, height);









        modifyButton.setOnAction(new EventHandler<ActionEvent>() {

            ModifyScene modifyScene = new ModifyScene(primaryStage,inputOutput,menuScene,width,height,path, 0);
            @Override
            public void handle(ActionEvent event) {
                int index = table.getSelectionModel().getSelectedIndex();
                String line = inputOutput.readRow(path,index);



                int i0 = line.indexOf(",");
                int i1 = line.indexOf(",", i0 + 1);
                int i2 = line.indexOf(",", i1 + 1);
                int i3 = line.indexOf(",", i2 + 1);
                int i4 = line.indexOf(",", i3 + 1);
                int i5 = line.indexOf(",", i4 + 1);
                int i6 = line.indexOf(",", i5 + 1);
                int i7 = line.indexOf(",", i6 + 1);
                int i8 = line.indexOf(",", i7 + 1);
                int i9 = line.indexOf(",", i8 + 1);
                int i10 = line.indexOf(",", i9 + 1);
                int i11 = line.indexOf(",", i10 + 1);
                int i12 = line.indexOf(",", i11 + 1);
                int i13 = line.indexOf(",", i12 + 1);



                modifyScene.refresh();

                modifyScene.getDone().setSelected(parseBoolean(line.substring(0,i0)));
                modifyScene.getNouveau().setSelected(parseBoolean(line.substring(i0+1,i1)));
                modifyScene.getName().setText(line.substring(i1+1,i2));
                modifyScene.getSize().setText(line.substring(i2+1,i3));
                modifyScene.getType().setValue(line.substring(i3+1,i4));
                modifyScene.getUse().setText(line.substring(i4+1,i5));
                modifyScene.getDaybreak().setText(line.substring(i5+1,i6));
                modifyScene.getMorning().setText(line.substring(i6+1,i7));
                modifyScene.getNoon().setText(line.substring(i7+1,i8));
                modifyScene.getEvening().setText(line.substring(i8+1,i9));
                modifyScene.getNight().setText(line.substring(i9+1,i10));
                modifyScene.getSleep().setText(line.substring(i10+1,i11));
                modifyScene.getStorage().setText(line.substring(i11+1,i12));
                modifyScene.getDiff().setText(line.substring(i12+1,i13));
                modifyScene.getInfos().setText(line.substring(i13+1));

                modifyScene.setRow(index);

                primaryStage.setScene(modifyScene.getModifyScene());


            }
        });



        // interaction part
        addButton.setOnAction(e -> addButtonClicked());

        deleteButton.setOnAction(e -> deleteButtonClicked());
        btnGoMenu4All.setOnAction(e -> primaryStage.setScene(menuScene));
    };

    public void addButtonClicked(){
        Tableau tableau = new Tableau();

        tableau.setDone(done.isSelected());
        tableau.setNouveau(nouveau.isSelected());
        tableau.setName(name.getText());
        tableau.setSize(size.getText());
        tableau.setType(type.getValue());
        tableau.setUse(use.getText());
        tableau.setDaybreak(daybreak.getText());
        tableau.setMorning(morning.getText());
        tableau.setNoon(noon.getText());
        tableau.setEvening(evening.getText());
        tableau.setNight(night.getText());
        tableau.setSleep(sleep.getText());
        tableau.setStorage(storage.getText());
        tableau.setDiff(diff.getText());
        tableau.setInfos("");


        inputOutput.write15(
                done.isSelected(), nouveau.isSelected(), name.getText(), size.getText(), type.getValue(), use.getText(),
                daybreak.getText(), morning.getText(), noon.getText(), evening.getText(), night.getText(), sleep.getText(),
                storage.getText(), diff.getText(), infos.getText(), path);

        table.getItems().add(tableau);

        done.setSelected(false);
        nouveau.setSelected(false);
        name.clear();
        size.clear();
        type.setValue("");
        use.clear();
        daybreak.clear();
        morning.clear();
        noon.clear();
        evening.clear();
        night.clear();
        sleep.clear();
        storage.clear();
        diff.clear();
        infos.clear();
    }

    public void deleteButtonClicked(){
        ObservableList<Tableau> tableauSelected, allTableau;
        allTableau = table.getItems();
        tableauSelected = table.getSelectionModel().getSelectedItems();

        int index = table.getSelectionModel().getSelectedIndex();

        inputOutput.csvRemoveStringRow(path,index);
        // tout productselecter, remove from allproducts
        tableauSelected.forEach(allTableau::remove);
    }













    public ObservableList<Tableau> getTableau(){
        ObservableList<Tableau> tableauOBS = FXCollections.observableArrayList();

        IO inputOutput = new IO();
        ArrayList<String> tab = inputOutput.read(path);

        TabConversion conversion = new TabConversion();

        for (int i = 0; i < tab.size(); i++){
            String text = tab.get(i);
            String[] temp = conversion.stringTab(text,",",Integer.MAX_VALUE);


            tableauOBS.add(new Tableau(i+1, parseBoolean(temp[0]), parseBoolean(temp[1]),
                    temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],temp[9],temp[10],temp[11],temp[12],temp[13],temp[14]));
        }
        return tableauOBS;
    }


    public Scene getAllScene() {
        return allScene;
    }

    public void setAllScene(Scene allScene) {
        this.allScene = allScene;
    }
}
