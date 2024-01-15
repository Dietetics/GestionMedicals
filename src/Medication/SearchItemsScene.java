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

public class SearchItemsScene {
    private double width, height;
    private Scene searchScene, SearchItemsScene;
    private TableView<Tableau> table;
    private CheckBox done, nouveau;
    private TextField name, size, use, daybreak, morning, noon, evening, night, sleep, storage, diff;
    private TextArea infos;
    private ComboBox type;
    private Button btnGoBack, deleteButton, modifyButton, addButton;
    private Stage primaryStage;
    private IO inputOutput;
    private String path;
    private Boolean ele1,ele2;
    private Object ele3, ele4, ele5, ele6, ele13, ele14;
    private String ele7, ele8, ele9, ele10, ele11, ele12, ele15;
    private ArrayList<String> tabSearchItems = new ArrayList<>();


    public SearchItemsScene(Stage primaryStage, IO inputOutput, Scene searchScene, double width, double height,
                            Boolean ele1, Boolean ele2, Object ele3, Object ele4, Object ele5, Object ele6, String ele7,
                            String ele8, String ele9, String ele10, String ele11, String ele12, Object ele13, Object ele14, String ele15, String path) {
        this.width = width;
        this.height = height;
        this.primaryStage = primaryStage;
        this.inputOutput = inputOutput;
        this.searchScene = searchScene;
        this.path = path;
        this.ele1 = ele1;
        this.ele2 = ele2;
        this.ele3 = ele3;
        this.ele4 = ele4;
        this.ele5 = ele5;
        this.ele6 = ele6;
        this.ele7 = ele7;
        this.ele8 = ele8;
        this.ele9 = ele9;
        this.ele10 = ele10;
        this.ele11 = ele11;
        this.ele12 = ele12;
        this.ele13 = ele13;
        this.ele14 = ele14;
        this.ele15 = ele15;

        if (ele3 == "") ele3 = "null";
        if (ele4 == ("")) ele4 = "null";
        if (ele5 == ("")) ele5 = "null";
        if (ele6 == ("")) ele6 = "null";
        if (ele7 == ("")) ele7 = "null";
        if (ele8 == ("")) ele8 = "null";
        if (ele9 == ("")) ele9 = "null";
        if (ele10 == ("")) ele10 = "null";
        if (ele11 == ("")) ele11 = "null";
        if (ele12 == ("")) ele12 = "null";
        if (ele13 == ("")) ele13 = "null";
        if (ele14 == ("")) ele14 = "null";
        if (ele15 == ("")) ele15 = "null";


        tabSearchItems.add(String.valueOf(ele1));
        tabSearchItems.add(String.valueOf(ele2));
        tabSearchItems.add(String.valueOf(ele3));
        tabSearchItems.add(String.valueOf(ele4));
        tabSearchItems.add(String.valueOf(ele5));
        tabSearchItems.add(String.valueOf(ele6));
        tabSearchItems.add(ele7);
        tabSearchItems.add(ele8);
        tabSearchItems.add(ele9);
        tabSearchItems.add(ele10);
        tabSearchItems.add(ele11);
        tabSearchItems.add(ele12);
        tabSearchItems.add(String.valueOf(ele13));
        tabSearchItems.add(String.valueOf(ele14));
        tabSearchItems.add(ele15);

        }

    public void refresh(){
        // -------------------------- searchItemsScene -------------------------- //
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



        addButton = new Button("Later");
        modifyButton = new Button("Later");
        deleteButton = new Button("Later");
        btnGoBack = new Button("Back");



        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(done, nouveau, name, size, type, use, diff, btnGoBack, addButton, modifyButton, deleteButton);

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

        SearchItemsScene = new Scene(root, width + 250, height);




        // interaction part
        btnGoBack.setOnAction(e -> primaryStage.setScene(searchScene));
        addButton.setOnAction(e -> addButtonClicked());
        modifyButton.setOnAction( e -> modifyButtonClicked());
        deleteButton.setOnAction(e -> deleteButtonClicked());
    };



    public void addButtonClicked() {
    }

    public void modifyButtonClicked(){

    };

    public void deleteButtonClicked(){
    }





    public ObservableList<Tableau> getTableau(){
        ObservableList<Tableau> tableauOBS = FXCollections.observableArrayList();

        IO inputOutput = new IO();
        ArrayList<String> tab = inputOutput.read(path);

        TabConversion conversion = new TabConversion();
        int value = 0;

        for (int i = 0; i < tab.size(); i++){
            String text = tab.get(i);
            String[] temp = conversion.stringTab(text,",",Integer.MAX_VALUE);

            for (int j = 0; j < temp.length; j++){
                if ( tabSearchItems.get(j).equals(temp[j]) || tabSearchItems.get(j).equals("null")){
                    value++;
                }
            }

            if (value == 15){
            tableauOBS.add(new Tableau(i+1, parseBoolean(temp[0]), parseBoolean(temp[1]),
                    temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],temp[9],temp[10],temp[11],temp[12],temp[13],temp[14]));}
            value = 0;
        }
        return tableauOBS;
    }


    public Scene getSearchItemsScene() {
        return SearchItemsScene;
    }

    public void setSearchItemsScene(Scene SearchItemsScene) {
        this.SearchItemsScene = SearchItemsScene;
    }
}
