package Medication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private double width = 640, height = 480;
    private Scene menuScene;
    private Button btnGoAdd, btnGoSearch, btnGoAll;
    private Pane root;
    private Image icon;
    private String path = "src/Medication/data.txt";


    public static void main(String[] args) { launch(args); }


    @Override
    public void start(Stage primaryStage) {

        IO inputOutput = new IO();

        // -------------------------- menu -------------------------- //
        primaryStage.setTitle("Medications");

        btnGoAdd    = new Button("Go Add");
        btnGoSearch = new Button("Search");
        btnGoAll    = new Button("View All");

        btnGoAdd.   setMinSize(80,30);
        btnGoSearch.setMinSize(80,30);
        btnGoAll.   setMinSize(80,30);

        btnGoAdd.   relocate(width/2 - 50,height/2 - 50);
        btnGoSearch.relocate(width/2 - 50,height/2);
        btnGoAll.   relocate(width/2 - 50,height/2 + 50);


        root = new Pane();
        root.setStyle("-fx-background-color:rgb(0,0,0);");
        root.getChildren().add(btnGoAdd);
        root.getChildren().add(btnGoSearch);
        root.getChildren().add(btnGoAll);


        icon = new Image("XSImage/focus.jfif");
        primaryStage.getIcons().add(icon);

        primaryStage.setResizable(false);
        primaryStage.setX(150);
        primaryStage.setY(150);

        menuScene = new Scene(root,width,height);
        primaryStage.setScene(menuScene);
        primaryStage.show();




        // interaction part
        AddScene add = new AddScene(primaryStage,inputOutput,menuScene,width,height,path);
        btnGoAdd.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                add.refresh();
                primaryStage.setScene(add.getAddScene());
            }
        });

        AllScene all = new AllScene(primaryStage,inputOutput,menuScene,width,height,path);
        btnGoAll.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                all.refresh();
                primaryStage.setScene(all.getAllScene());
            }
        });

        SearchScene search = new SearchScene(primaryStage,inputOutput,menuScene,width,height,path);
        btnGoSearch.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                search.refresh();
                primaryStage.setScene(search.getSearchScene());
            }
        });



    }
}