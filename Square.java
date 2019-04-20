import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.GradientPaint;
import java.util.*;

class Square extends Pane {

    static final int SIZE = 9;
    static final int ROW = 3;

    public Square(List<Tile> tiles) {
        
        for (int i = 0; i < SIZE; i++) {
            Tile tile = tiles.get(i);
            tile.setTranslateX(30 * (i % ROW));
            tile.setTranslateY(30 * (i / ROW));
            getChildren().add(tile);
        }
    }


    public static void main(String[] args) {
        
    }
}