package com.undo3.justjava02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int quantity = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayQuantity() {
        TextView quantityView = (TextView) findViewById(R.id.quantityValue);

        quantityView.setText("" + quantity);
    }

    public void processOrder(View v) {
        TextView priceView = (TextView) findViewById(R.id.priceValue);
        TextView orderMessageView = (TextView) findViewById(R.id.orderMessage);

        priceView.setText("" + quantity * quantity);
        orderMessageView.setText("" + quantity + " cups of coffee cost " + priceView.getText() + "€");

    }

    public void quantityPlus(View v) {
        quantity++;
        displayQuantity();
    }

    public void quantityMinus(View v) {
        quantity--;
        displayQuantity();
    }
}
