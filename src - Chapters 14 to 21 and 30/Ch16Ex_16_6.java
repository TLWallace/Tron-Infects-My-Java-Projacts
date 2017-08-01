/* From 16.6 on p.669
 * "(Demonstrate TextField properties)
 * Write a program that sets the horizontal-alignment and column-size properties
 * of a text field dynamically (...)."
 * 
 * THOMAS' NOTE | Used GridPane coordinates to add image on top of generic HBox use for nodes.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Ch16Ex_16_6 extends Application
{
public static void main(String[] args)
	{
	Application.launch(args);
	}
public void start(Stage primaryStage)
	{
	GridPane pane = new GridPane();
	Image mCP = new Image("image/MCP.jpg");
		ImageView mCPImage = new ImageView(mCP);
	pane.add(mCPImage, 0, 4);
	Label miscText = new Label("\tUSER CODE 00-DILLINGER.");
	HBox hBoxPrim = new HBox(miscText);
		hBoxPrim.setPadding(new Insets(5, 5, 5, 5));
		hBoxPrim.setAlignment(Pos.CENTER_LEFT);
		pane.add(hBoxPrim, 0, 0);
	TextField pWField = new TextField("MASTER");
		pWField.setPrefColumnCount(18);
		pWField.setAlignment(Pos.CENTER);
		Label pWLabel = new Label("\tPASSWORD:", pWField);
		pWLabel.setContentDisplay(ContentDisplay.RIGHT);
	HBox hBoxSeco = new HBox(pWLabel);
		hBoxSeco.setPadding(new Insets(5, 5, 5, 5));
		hBoxSeco.setAlignment(Pos.CENTER_LEFT);
		pane.add(hBoxSeco, 0, 1);
		ToggleGroup radioGaga = new ToggleGroup();
			RadioButton radBuL = new RadioButton();
			Label radBuLLabel = new Label("Left", radBuL);
				radBuL.setOnAction(e -> pWField.setAlignment(Pos.CENTER_LEFT));
				radBuL.setToggleGroup(radioGaga);
			RadioButton radBuC = new RadioButton();
			Label radBuCLabel = new Label("Center", radBuC);
				radBuC.setSelected(true);
				radBuC.setOnAction(e-> pWField.setAlignment(Pos.CENTER));
				radBuC.setToggleGroup(radioGaga);
			RadioButton radBuR = new RadioButton();
			Label radBuRLabel = new Label("Right", radBuR);
				radBuR.setOnAction(e-> pWField.setAlignment(Pos.CENTER_RIGHT));
				radBuR.setToggleGroup(radioGaga);
			HBox hBoxTert = new HBox(radBuLLabel, radBuCLabel, radBuRLabel);
				hBoxTert.setSpacing(10);
				hBoxTert.setPadding(new Insets(5, 5, 5, 5));
				hBoxTert.setAlignment(Pos.CENTER_RIGHT);
				pane.add(hBoxTert, 0, 2);
		TextField resizeField = new TextField();
		Label resizeLabel = new Label("Resize PW Field", resizeField);
			resizeField.setPrefColumnCount(10);
			resizeField.setText("18");
			resizeField.setOnAction(e-> pWField.setPrefColumnCount(Integer.parseInt(resizeField.getText())));
			resizeLabel.setContentDisplay(ContentDisplay.RIGHT);
		HBox hBoxQuat = new HBox(resizeLabel);
			hBoxQuat.setPadding(new Insets(5, 5, 10, 5));
			hBoxQuat.setAlignment(Pos.TOP_RIGHT);
			pane.add(hBoxQuat, 0, 3);
	primaryStage.setScene(new Scene(pane));
	primaryStage.setWidth(480);
	primaryStage.setTitle(" REQUEST: ACCESS TO MASTER CONTROL PROGRAM");
	primaryStage.show();
    }
}