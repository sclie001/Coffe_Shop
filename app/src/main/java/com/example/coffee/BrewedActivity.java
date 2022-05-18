package com.example.coffee;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BrewedActivity extends AppCompatActivity {
    private static final String TAG = "Brewed Activity";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brewed_order_form);

        RadioGroup flavors = findViewById(R.id.flavors_rad_group);
        RadioGroup sweeteners = findViewById(R.id.sweeteners_rad_group);
        RadioGroup creamers = findViewById(R.id.creamer_rad_group);
        RadioGroup sizes = findViewById(R.id.size_rad_group);


        Button order = findViewById(R.id.order_btn);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = flavors.getCheckedRadioButtonId();
                RadioButton flavor =  findViewById(selectedId);
                String flavorSelcted = flavor.getText().toString();

                Log.i(TAG, "Brewed Activity flavors radio clicked: " + flavorSelcted);

                selectedId = sweeteners.getCheckedRadioButtonId();
                RadioButton sweetener = findViewById(selectedId);
                String sweetenerSelected = sweetener.getText().toString();

                Log.i(TAG, "Brewed Activity sweetener radio clicked: " + sweetenerSelected);

                selectedId = creamers.getCheckedRadioButtonId();
                RadioButton creamer = findViewById(selectedId);
                String creamerSelected = creamer.getText().toString();

                Log.i(TAG, "Brewed Activity creamer radio clicked: " + creamerSelected);

                selectedId = sizes.getCheckedRadioButtonId();
                RadioButton size = findViewById(selectedId);
                String sizeSelected = size.getText().toString();

                Log.i(TAG, "Brewed Activity size radio clicked: " + sizeSelected);

                Coffee brewedCoffee = new Coffee(creamerSelected, sweetenerSelected,
                        flavorSelcted, sizeSelected);

                /*create a list and display as receipt
                when button clicked, it takes you to another activity to show receipt*/

            }
        });



    }
}
