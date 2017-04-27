package Controllers;

import Views.LoginView;
import Views.AbstractViews.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewController extends Application
{
    Scene scene;
    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        stage = primaryStage;

        //First scene when booting

        LoginView loginView = new LoginView();

        scene = loginView.getScene();

        stage.setScene(scene);

        stage.setTitle("Log In");

        stage.centerOnScreen();

        stage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }

    public static void sceneSwitchHelper(View view, String sceneTitle)
    {
        stage.setScene(view.getScene());

        stage.setTitle(sceneTitle);

        stage.centerOnScreen();

        stage.show();
    }

    public static void sceneSwitchHelper(View view)
    {
        stage.setScene(view.getScene());

        stage.setTitle("ProjectLab 2017 - " + view.getTitle());

        stage.centerOnScreen();

        stage.show();
    }

}
