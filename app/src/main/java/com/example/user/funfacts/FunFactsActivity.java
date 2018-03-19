package com.example.user.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        // Assign the Views from the Layout File to the Corresponding Variables
        mFactTextView = findViewById(R.id.factTextView);
        mShowFactButton = findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked, so update the fact Text View with a new fact
                String[] facts = {
                        "Ants stretch when they wake up in the morning.",
                        "Ostriches can run faster than horses.",
                        "Olympic gold medals are actually made mostly of silver.",
                        "You are born with 300 bones, by the time you are an adult you will have up 206.",
                        "It takes about 8 minutes for light from the sun to hit the Earth.",
                        "Some bamboo plants can grow almost a metre in one day.",
                        "The state of Florida is bigger than England.",
                        "Some penguins can leap 2-3 metres out of the water.",
                        "On average, it takes 66 days to form a new habit.",
                        "Mammoths still walked on earth when the Great Pyramid was being built."};

                // Randomly select a fact
                Random randomGenerator = new Random();
                int randomNum = randomGenerator.nextInt(facts.length);

                String fact = facts[randomNum];

                // Update the screen with our dynamic fact
                mFactTextView.setText(fact);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }

}
