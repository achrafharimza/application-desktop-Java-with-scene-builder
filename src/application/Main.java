package application;
	import Controllers.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
			Scene scene = new Scene(root,821,559);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Login");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	 public void changeScene(String fxml)  {
//		
//		 Stage primaryStage =new Stage();
//			try {
//				Parent root = FXMLLoader.load(getClass().getResource(fxml));
//			
//				Scene scene = new Scene(root,821,559);
//				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//				
//				primaryStage.setScene(scene);
//				primaryStage.setTitle("Login");
//				primaryStage.show();
//			} catch(Exception e) {
//				e.printStackTrace();
//			}
//	        
//	    }
	
	public static void main(String[] args) {
		launch(args);
		
			}
}
