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

class Tile extends StackPane {

    private Text text = new Text();

    public Tile(String value) {

        Rectangle border = new Rectangle(30,30);
        border.setFill(null);
        border.setStroke(Color.BLACK);

        // 0 represents the position can be edited
        if(value.equals("0")){
            text.setText("");
        }
        else {
            text.setText(value);
        }
        
        text.setFont(Font.font(20));
        
        setAlignment(Pos.CENTER);
        getChildren().addAll(border,text);
    }

    public static void main(String[] args) {
        
    }
}