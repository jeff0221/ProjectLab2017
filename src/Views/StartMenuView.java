package Views;

import Controllers.ViewController;
import Views.AbstractViews.View;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by Jeffrey on 27-03-2017.
 */
public class StartMenuView implements View
{
    private final String sceneTitle = "Main menu";

    private Scene scene;
    private final int sceneWidth = 1280;
    private final int sceneHeight = 720;

    private final int gridGap = 10;
    private GridPane gridPane;

    private BorderPane borderPane;
    private Button btn1,btn2, exitBtn;
    private VBox vBox;
    private HBox hBox;
    private TableView table;

    public StartMenuView()
    {
        this.scene = new Scene(MenuPane(), sceneWidth, sceneHeight);
    }

    public BorderPane MenuPane()
    {
        //Initializing outermost holder of content nodes
        borderPane = new BorderPane();

        //Initialize any content specific to the MainMenu

        btn1 = new Button("Vehicles");
        btn1.setOnAction(event -> ViewController.sceneSwitchHelper(new VehicleView()));
        btn2 = new Button("Option #2");
        exitBtn = new Button("Exit");
        exitBtn.setOnAction(event -> System.exit(0));

        //Arrangement of gridpane
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setGridLinesVisible(true);
        gridPane.setHgap(gridGap);
        gridPane.setVgap(gridGap);
        gridPane.setAlignment(Pos.BASELINE_CENTER);
        gridPane.setStyle("-fx-background-color: royalblue");

        //Arrangement TableView
//        table.setEditable(true);
//        TableColumn genderType = new TableColumn("");
        //TODO: Make the rest of the view

        //Arrangement of VBox
        vBox = new VBox();
        vBox.getChildren().addAll(btn1,btn2);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(gridGap);
        vBox.setPrefSize(250,720);

        //Arrengement of HBox
        hBox = new HBox();
        hBox.getChildren().addAll(exitBtn);
        hBox.setPadding(new Insets(20));
        hBox.setSpacing(gridGap);
        hBox.setStyle("-fx-background-color: linear-gradient(dodgerblue,royalblue,#220070)");

        //Place content in the borderpane
        borderPane.setCenter(gridPane);
        borderPane.setLeft(vBox);
        borderPane.setBottom(hBox);

        return borderPane;
    }

    @Override
    public Scene getScene(){
        return scene;
    }

    @Override
    public String getTitle(){
        return sceneTitle;
    }
}
