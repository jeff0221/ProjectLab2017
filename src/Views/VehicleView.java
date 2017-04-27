package Views;

import Controllers.ViewController;
import Views.AbstractViews.View;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.Random;

/**
 * Created by Jeffrey on 05-04-2017.
 */
public class VehicleView implements View
{
    private final String sceneTitle = "Main menu";

    private String locationFront;
    private String dateFront;

    private Scene scene;
    private final int sceneWidth = 1280;
    private final int sceneHeight = 720;

    private final int gridGap = 10;
    private GridPane gridPane;

    private Text locationText,dateText,amountText;
    private BorderPane borderPane;
    private Button btn1,btn2, btn3, exitBtn;
    private VBox vBox;
    private HBox hBox;
    private TableView table;
    private ComboBox locationDropDown, carTypeDropDown;
    private DatePicker datePicker;
    private TextField amount;

    public VehicleView()
    {
        this.scene = new Scene(vehiclePane(), sceneWidth, sceneHeight);
    }

    public BorderPane vehiclePane()
    {
        //Initializing outermost holder of content nodes
        borderPane = new BorderPane();

        //Initialize any content specific to the vehicle
        btn1 = new Button("Pedestrians");
        btn2 = new Button("Back");
        btn2.setOnAction(event -> ViewController.sceneSwitchHelper(new LoginView()));
        btn3 = new Button("Check");
        btn3.setOnAction(event ->
        {
            Random random = new Random();
            int max = 90;
            int min = 10;
            int randomNum = random.nextInt((max - min) + 1) + min;
            amount.setText("" + randomNum);
        });
        exitBtn = new Button("Exit");
        exitBtn.setOnAction(event -> System.exit(0));

        locationText = new Text("Pick location");
        locationDropDown = new ComboBox();
        ObservableList<String> locations =
            FXCollections.observableArrayList(
                    "Nørrebrogade",
                    "Enghavevej",
                    "Mozartsvej",
                    "Sjællør Blvd",
                    "Toftegårds Allé",
                    "Jagtvej",
                    "Sjællandsgade",
                    "H.C.Andersends Blvd",
                    "Peter Bangs Vej",
                    "Nordre Fasanvej",
                    "H.C. Ørsteds Vej"
            );
        locationDropDown.setItems(locations);
        locationDropDown.setPromptText(locationFront);
        locationDropDown.setOnAction(event ->
        {
            Random random = new Random();
            int max = 90;
            int min = 10;
            int randomNum = random.nextInt((max - min) + 1) + min;
            amount.setText("" + randomNum);
            this.locationFront = locationDropDown.getSelectionModel().getSelectedItem().toString();
            ViewController.sceneSwitchHelper(this);
        });

        carTypeDropDown = new ComboBox();

        dateText = new Text("Pick Date");
        datePicker = new DatePicker();
        datePicker.setPromptText("07-04-2017");

        Random random = new Random();

        int max = 90;
        int min = 10;
        int randomNum = random.nextInt((max - min) + 1) + min;

        amountText = new Text("Amount cars: ");
        if(locationFront != null)
        {
            amount = new TextField("" + randomNum);
        }
        else
        {
            amount = new TextField();
        }

        //Arrangement of gridpane
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setGridLinesVisible(false);
        gridPane.setHgap(gridGap);
        gridPane.setVgap(gridGap);
        gridPane.setAlignment(Pos.BASELINE_LEFT);
//        gridPane.setStyle("-fx-background-color: royalblue");

        gridPane.add(locationText,0,0,1,1);
        gridPane.add(dateText,0,1,1,1);
        gridPane.add(locationDropDown,1,0,1,1);
        gridPane.add(datePicker,1,1,1,1);
        gridPane.add(amountText,3,0,1,1);
        gridPane.add(amount,4,0,1,1);
        gridPane.add(btn3,4,1,1,1);

//        Arrangement of VBox
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
