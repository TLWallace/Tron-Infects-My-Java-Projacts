/* From Chapter 14, exercise 14.1 on p.578 & Chapter 15, exercise 15.6 on p.622
 * 14.1 "(Display Images)
 * Write a program that displays four images in a grid pane (...)"
 * 
 * THOMAS' NOTE | Used my own images in place of flags.
 * 
 * 15.6 "(Alternate two messages)
 * Write a program to display the text Java is fun and
 * Java is powerful alternately with a mouse click."
 * 
 * THOMAS' NOTE | Implemented two alternating texts against images other than flags.
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
public class Ch14Ex_14_1_Ch15Ex_15_6 extends Application
{
public static void main(String[] args)
	{
	launch(args);
	}
public void start(Stage primaryStage)
	{
	GridPane pane = new GridPane();
		Image bradley2010 = new Image("image/Bradley_2010.jpg");
		Image bradley1982 = new Image("image/Bradley_1982.jpg");
		Image flynn2010 = new Image("image/Flynn_2010.jpg");
		Image flynn1982 = new Image("image/Flynn_1982.jpg");
			ImageView bradleyAfter = new ImageView(bradley2010);
			ImageView bradleyBefore = new ImageView(bradley1982);
			ImageView flynnAfter = new ImageView(flynn2010);
			ImageView flynnBefore = new ImageView(flynn1982);
	Text bradleyQuote = new Text("\"I was paged last night.\"\n\t~ Alan Bradley, 2010");
	Text flynnQuote = new Text("\"Radical, man.\"\n\t~ Kevin Flynn, 2010");
	GridPane.setHalignment(flynnQuote, HPos.LEFT);
	GridPane.setHalignment(bradleyQuote, HPos.LEFT);
	pane.setOnMouseClicked(e ->
		{
		if (bradleyQuote.getText().equals("\"I was paged last night.\"\n\t~ Alan Bradley, 2010"))
			{
			bradleyQuote.setText("\"Try to look official. Here comes the boss.\"\n\t~ Alan Bradley, 1982");
			}
			else
				{
				bradleyQuote.setText("\"I was paged last night.\"\n\t~ Alan Bradley, 2010");
				}
		if (flynnQuote.getText().equals("\"Radical, man.\"\n\t~ Kevin Flynn, 2010"))
			{
			flynnQuote.setText("\"Greetings, programs.\"\n\t~ Kevin Flynn, 1982");
			}
			else
				{
				flynnQuote.setText("\"Radical, man.\"\n\t~ Kevin Flynn, 2010");
				}
		});
	Scene scene = new Scene(pane, 480, 440);
		pane.add(bradleyAfter, 0, 0);
		pane.add(bradleyBefore, 1, 0);
		pane.add(flynnAfter, 0, 1);
		pane.add(flynnBefore, 1, 1);
		pane.add(bradleyQuote, 2, 0);
		pane.add(flynnQuote, 2, 1);
	primaryStage.setScene(scene);
		primaryStage.setTitle("A Legacy of Fighting for the Users");
			primaryStage.show();
	}
}