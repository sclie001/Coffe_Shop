package com.example.coffee;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BrewedActivity extends AppCompatActivity {
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
                Toast.makeText(BrewedActivity.this, flavor.getText(),
                        Toast.LENGTH_SHORT).show();
                String flavorSelcted = flavor.getText().toString();

                selectedId = sweeteners.getCheckedRadioButtonId();
                RadioButton sweetener = findViewById(selectedId);
                Toast.makeText(BrewedActivity.this, sweetener.getText(),
                        Toast.LENGTH_SHORT).show();
                String sweetenerSelected = sweetener.getText().toString();

                selectedId = creamers.getCheckedRadioButtonId();
                RadioButton creamer = findViewById(selectedId);
                Toast.makeText(BrewedActivity.this, creamer.getText(),
                        Toast.LENGTH_SHORT).show();
                String creamerSelected = creamer.getText().toString();

                selectedId = sizes.getCheckedRadioButtonId();
                RadioButton size = findViewById(selectedId);
                Toast.makeText(BrewedActivity.this, size.getText(),
                        Toast.LENGTH_SHORT).show();
                String sizeSelected = size.getText().toString();

                Coffee brewedCoffee = new Coffee(creamerSelected, sweetenerSelected,
                        flavorSelcted, sizeSelected);

                /*create a list and display as receipt*/
                /*when button clicked, it takes you to another activity to show receipt*/

            }
        });



    }
}
