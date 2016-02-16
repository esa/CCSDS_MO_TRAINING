/* ----------------------------------------------------------------------------
 * Copyright (C) 2016      European Space Agency
 *                         European Space Operations Centre
 *                         Darmstadt
 *                         Germany
 * ----------------------------------------------------------------------------
 * System                : CCSDS MO Training Test Application
 * ----------------------------------------------------------------------------
 * Licensed under the European Space Agency Public License, Version 2.0
 * You may not use this file except in compliance with the License.
 *
 * Except as expressly set forth in this License, the Software is provided to
 * You on an "as is" basis and without warranties of any kind, including without
 * limitation merchantability, fitness for a particular purpose, absence of
 * defects or errors, accuracy or non-infringement of intellectual property rights.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * ----------------------------------------------------------------------------
 */
package esa.mo.training.test.jfx;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Main entry point for the JavaFX MO test application
 */
public class TestMain extends Application
{
  /**
   * The main() method is ignored in correctly deployed JavaFX application. main() serves only as fallback in case the application
   * can not be launched through deployment artifacts, e.g., in IDEs with limited FX support
   *
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception
  {
    stage.setTitle("MO Training Test Application");
    Button btn = new Button();
    btn.setText("Click Me!");
    btn.setOnAction((ActionEvent event) ->
            {
              Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
              alert.setTitle("Everything looks good!");
              alert.setHeaderText("Pick either button, this is just a test!");

              ButtonType buttonTypeTrue = new ButtonType("Send TRUE");
              ButtonType buttonTypeFalse = new ButtonType("Send FALSE");

              alert.getButtonTypes().setAll(buttonTypeTrue, buttonTypeFalse);

              Optional<ButtonType> result = alert.showAndWait();
            });

    StackPane root = new StackPane();
    root.getChildren().add(btn);
    stage.setScene(new Scene(root, 350, 100));
    stage.show();
  }
}
