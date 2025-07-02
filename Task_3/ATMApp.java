import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ATMApp extends Application {

    private BankAccount account = new BankAccount(1000); // Starting balance ₹1000

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ATM Interface");

        Label balanceLabel = new Label("Balance: ₹" + account.getBalance());
        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount");

        Button depositBtn = new Button("Deposit");
        Button withdrawBtn = new Button("Withdraw");
        Button checkBalanceBtn = new Button("Check Balance");

        Label messageLabel = new Label();

        depositBtn.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (account.deposit(amount)) {
                    messageLabel.setText("✅ Deposited: ₹" + amount);
                } else {
                    messageLabel.setText("❌ Invalid deposit amount.");
                }
                balanceLabel.setText("Balance: ₹" + account.getBalance());
            } catch (NumberFormatException ex) {
                messageLabel.setText("❌ Please enter a valid number.");
            }
        });

        withdrawBtn.setOnAction(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (account.withdraw(amount)) {
                    messageLabel.setText("✅ Withdrawn: ₹" + amount);
                } else {
                    messageLabel.setText("❌ Insufficient balance or invalid amount.");
                }
                balanceLabel.setText("Balance: ₹" + account.getBalance());
            } catch (NumberFormatException ex) {
                messageLabel.setText("❌ Please enter a valid number.");
            }
        });

        checkBalanceBtn.setOnAction(e -> {
            balanceLabel.setText("Balance: ₹" + account.getBalance());
            messageLabel.setText("💰 Current Balance Displayed.");
        });

        VBox vbox = new VBox(10, balanceLabel, amountField, depositBtn, withdrawBtn, checkBalanceBtn, messageLabel);
        vbox.setPadding(new Insets(20));
        primaryStage.setScene(new Scene(vbox, 300, 300));
        primaryStage.show();
    }
}
