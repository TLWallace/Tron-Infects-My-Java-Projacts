/* From 19.10 on p.759
 * "(Largest element in an ArrayList)
 * Write the following method that returns the largest element in an ArrayList:
 * public static <E extends Comparable<E>> E max(ArrayList<E> list)"
 * 
 * THOMAS' NOTE | Decided to take user input for generating the ArrayList.
 * 				Added an animation for kicks :)
 */
import java.util.ArrayList;
import java.util.Scanner;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
public class Ch19Ex_19_10 extends Application
{
public static void main(String[] args)
	{
	launch(args);
	}
{
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println("Enter a number below User;\n"
			+"Bit will then generate a random array,\n"
			+"and present the max value to you:");
	Scanner userFeedsBit = new Scanner(System.in);
	int i = userFeedsBit.nextInt();
	for (i = 0; i < 10; i++)
		{
		list.add((int)(i+101*(Math.random())));
		}
	userFeedsBit.close();
	System.out.println("Yes! Yes! Yes! Yes! Yes!\n"+list+"\nNo! No! No! No! No! No!\n"+max(list));
	}
public static <E extends Comparable<E>> E max(ArrayList<E> list)
	{
	E max = list.get(0);
	for (int i = 0; i < list.size(); i++)
		{
		if (list.get(i).compareTo(max) > 0)
			{
			max = list.get(i);
            }
		}
	return max;
	}
public void start(Stage primeStage)
	{
	Pane pane = new Pane();
		pane.setStyle("-fx-background-color: black;");
		ImageView bitView = new ImageView("image/Bit.jpg");
		pane.getChildren().add(bitView);
	PathTransition pathTran = new PathTransition(Duration.millis(1024), new Circle(128, 128, 64), bitView);
		pathTran.setCycleCount(Timeline.INDEFINITE);
		pathTran.setAutoReverse(true);
		pathTran.play();
	Scene scene = new Scene(pane, 256, 256);
		primeStage.setTitle("Bit Bit Bit Bit Bit");
		primeStage.setScene(scene);
		primeStage.show();
	}
}