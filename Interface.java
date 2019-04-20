import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.GradientPaint;
import java.util.*;

public class Interface extends Application {

    public static final int SIZE = 9;
    public static final int ROW = 3;

    private Parent createContent() {

        VBox root = new VBox(10);
        root.setPadding(new Insets(10,10,40,10));

        GridPane gridpane = new GridPane();
        gridpane.setMinSize(400, 400);
        gridpane.setPadding(new Insets(0, 50, 0, 0));
        gridpane.setVgap(23);
        gridpane.setHgap(23);


        // Create the original board
        for (int i = 0; i < SIZE; i++) {
            List<Tile> tiles = new ArrayList<>();
            for (int j = 0; j < SIZE; j++) {
                tiles.add(new Tile(String.valueOf(i)));
            }
            Square square = new Square(tiles);
            
            gridpane.add(square, i % ROW *2, i / ROW *2);
        }
        gridpane.setAlignment(Pos.CENTER);

        // Create input button
        HBox buttonHbox = new HBox(10);
        Button[] bs = new Button[9];
        for (int i = 0; i < 9; i++) {
            bs[i] = new Button("" + (i+1));
            buttonHbox.getChildren().add(bs[i]);
        }
        buttonHbox.setAlignment(Pos.CENTER);
        // gridpane.add(buttonHbox, 0, 3);
        // GridPane.setConstraints(buttonHbox, 0, 3, 2, 3, HPos.CENTER, VPos.CENTER);
        
        root.getChildren().addAll(gridpane, buttonHbox);

        return root;
    }


    public void start(Stage stage) {

        stage.setTitle("Sudoku");

        stage.setScene(new Scene(createContent()));
        stage.show();
    }


}




