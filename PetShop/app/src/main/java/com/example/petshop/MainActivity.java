package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // OnCreate() is the main entry point

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Declare Vars
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");
        ArrayList petList = new ArrayList(); // Can store both Cat and Dog objects since they both inherit from pet
        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();

        // Function Body
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        pettablePets.add(cat);
        pettablePets.add(dog);
        // pettablePets.add(scorpion); // should throw an error

    }
}