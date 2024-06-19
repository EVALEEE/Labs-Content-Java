package comp1110.lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Board extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Pane as the root node
        Pane root = new Pane();

        // Set the size of the Pane to 600x519
        root.setPrefSize(600, 519);


//        //Step2:
//        // Create an upright equilateral triangle
//        double[] points = {0.0, -86.6, 100.0, 86.6, -100.0, 86.6};
//        Polygon triangle = new Polygon(points);
//        // Center the triangle in the middle of the window
//        triangle.setLayoutX(300); // (600 / 2) = 300
//        triangle.setLayoutY(259.5); // (519 - 173.2) / 2 ≈ 259.5
//        // Set the fill color of the triangle to LIGHTGREY
//        triangle.setFill(Color.LIGHTGREY);


//        //Step3:
//        // Create an instance of the Triangle class
//        Triangle triangle = new Triangle(300, 259.5, 200);
//        // Set the fill color of the triangle to LIGHTGREY
//        triangle.setFill(Color.LIGHTGREY);
//
//        // Add the triangle to the root pane
//        root.getChildren().add(triangle);
//

        //Step4:
        // Create an ArrayList to store triangles
        ArrayList<Triangle> triangles = new ArrayList<>();

        // Create the grid of triangles
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {

                // Calculate the position of the triangle
                double x = col * 100 + 100;
                double y = row * 173.2 + 58;

                // Create an upright equilateral triangle
                Triangle triangle = new Triangle(x, y, 196);

                // Set the fill color of the triangle to LIGHTGREY
                triangle.setFill(Color.LIGHTGREY);

                // Rotate triangles in alternate rows
                if (col == 1 || col == 3) {
                    triangle.setRotate(180);
                }
                // Add the triangle to the root pane and the list
                root.getChildren().add(triangle);
                triangles.add(triangle);

            }
        }

        //Step4:
        // Create a scene
        Scene scene = new Scene(root);

        // Set the scene of the stage to the scene we created
        primaryStage.setScene(scene);
        // Set the title of the stage
        primaryStage.setTitle("Board");
        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }


    // Inner class representing an equilateral triangle
    class Triangle extends Polygon {
        // Constructor to create an upright equilateral triangle
        public Triangle(double x, double y, double side) {
            // Calculate the coordinates of the triangle's vertices
            double height = Math.sqrt(3) * side / 2;
            double[] points = {
                    x, y - height / 3,
                    x + side / 2, y + 2 * height / 3,
                    x - side / 2, y + 2 * height / 3
            };
            // Set the vertices of the triangle
            this.getPoints().addAll(
                    points[0], points[1],
                    points[2], points[3],
                    points[4], points[5]
            );
        }
    }
}
