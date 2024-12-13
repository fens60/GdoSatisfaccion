package es.ieslosmontecillos.gdosatisfaccion;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class GdoSatisfaccion extends VBox {

    @FXML
    private Slider slider;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private ProgressIndicator progressIndicator;

    public GdoSatisfaccion() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GdoSatisfaccion.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Agregar un listener al slider
        slider.valueProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    double progress = new_val.doubleValue() / 100;
                    progressBar.setProgress(progress);
                    progressIndicator.setProgress(progress);
                    System.out.println("progress: " + progress);
                }
        );
    }

    // Métodos getter y setter
    public ProgressBar getProgressBar() {
        return progressBar;
    }

    public Slider getSlider() {
        return slider;
    }

    public ProgressIndicator getProgressIndicator() {
        return progressIndicator;
    }

    public void setProgressIndicator(ProgressIndicator progressIndicator) {
        this.progressIndicator = progressIndicator;
    }

    public void setSlider(Slider slider) {
        this.slider = slider;
    }

    public void setProgress(double progress) {
        progressIndicator.setProgress(progress);
    }
}
