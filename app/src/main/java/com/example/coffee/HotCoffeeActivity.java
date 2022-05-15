package com.example.coffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HotCoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_coffee);

        Button brewedCoffee = findViewById(R.id.brewed_coffee_btn);
        Button americanoBtn = findViewById(R.id.americano_btn);

        brewedCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent brewedCoffeActivity = new Intent(HotCoffeeActivity.this,
                        BrewedActivity.class);
                startActivity(brewedCoffeActivity);
            }
        });

        americanoBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent americanoActivity = new Intent(HotCoffeeActivity.this,
                        AmericanoActivity.class);
                startActivity(americanoActivity);
            }
        });
    }

}
