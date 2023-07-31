package com.georgiancollege.week13;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class BooksController implements Initializable {

    @FXML
    private Label booksLabel;

    @FXML
    private TableView<BookData> tableView;

    @FXML
    private TableColumn<BookData, Integer> idColumn;

    @FXML
    private TableColumn<BookData, String> titleColumn;

    @FXML
    private TableColumn<BookData, String> authorColumn;

    @FXML
    private TableColumn<BookData, String> genreColumn;

    @FXML
    private TableColumn<BookData, String> publishedDateColumn;

    @FXML
    private TableColumn<BookData, String> publisherColumn;

    @FXML
    private TextArea descriptionTextArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ApiResponse apiResponse = Utility.getDataFromApi();
        System.out.println(apiResponse);

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
        publishedDateColumn.setCellValueFactory(new PropertyValueFactory<>("publishedDate"));
        publisherColumn.setCellValueFactory(new PropertyValueFactory<>("publisher"));

        tableView.getItems().addAll(apiResponse.getBookData());

        tableView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldBookData, newBookData) -> {
                    booksLabel.setText(newBookData.getTitle());
                    descriptionTextArea.setText(newBookData.getDescription());
                }
        );
    }
}
