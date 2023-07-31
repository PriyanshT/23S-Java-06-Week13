package com.georgiancollege.week13;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class BooksController {

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

}
