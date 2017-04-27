package Views;

import Controllers.UserRepoImplementation;
import Controllers.ViewController;
import Views.AbstractViews.View;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import Models.Validator;

/**
 * Created by Jeffrey on 26-03-2017.
 */
public class LoginView implements View
{
    private final String sceneTitle = "Log In";

    private Scene scene;
    private final int sceneWidth = 640;
    private final int sceneHeight = 480;

    private final int gridGap = 10;
    private GridPane gridPane;

    private BorderPane borderPane;

    private TextField usernameField;
    private Text usernameText;

    private PasswordField passwordField;
    private Text passwordText;

    private Text loginFailed;

    private Button loginBtn;
    private Button exitBtn;

    public LoginView()
    {
        scene = new Scene(loginPane(), sceneWidth, sceneHeight);
    }

    private BorderPane loginPane()
    {
        //Initializing outermost holder of content nodes
        borderPane = new BorderPane();

        //Initialize any content specific to the Login

        usernameField = new TextField();
        usernameField.setPromptText("Username");

        passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        usernameText = new Text("User Name:");
        passwordText = new Text("Password:");

        loginBtn = new Button("Log In");
        loginBtn.setOnAction(event ->
        {
            if(!usernameField.getText().isEmpty() || !passwordField.getText().isEmpty())
            {
                UserRepoImplementation repo = new UserRepoImplementation();
                Validator validator = new Validator(repo);
                if(repo.passwordValid(usernameField.getText(),passwordField.getText()))
                {
                    ViewController.sceneSwitchHelper(new StartMenuView());
                }
                else if(true)
                {
                    //TODO: Remove else if when database is implemented
                    ViewController.sceneSwitchHelper(new StartMenuView());
                }
                else
                {
                    loginFailed = new Text();
                    loginFailed.setText("Username and/or Password doesn't match");
                    loginFailed.setFill(new Color(1,0,0,1.0));
                    gridPane.add(loginFailed, 1,4,3,1);
                }
            }
        });

        loginBtn.setPrefSize(100,25);

        exitBtn = new Button("Exit");
        exitBtn.setOnAction(event -> System.exit(0));
        exitBtn.setPrefSize(100,25);

        //Set up of gridpane
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setGridLinesVisible(false);
        gridPane.setHgap(gridGap);
        gridPane.setVgap(gridGap);
        gridPane.setAlignment(Pos.BASELINE_CENTER);

        //Arrangement of gridpane
        gridPane.add(loginBtn,1,3);
        gridPane.add(exitBtn,2,3);
        gridPane.add(usernameField,1,1,2,1);
        gridPane.add(passwordField,1,2,2,1);
        gridPane.add(usernameText,0,1);
        gridPane.add(passwordText,0,2);

        //Place content in the borderpane
        borderPane.setCenter(gridPane);

        return borderPane;
    }

    public Scene getScene(){
        return scene;
    }

    @Override
    public String getTitle(){
        return sceneTitle;
    }
}
