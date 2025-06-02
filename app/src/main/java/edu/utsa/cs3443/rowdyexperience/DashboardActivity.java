package edu.utsa.cs3443.rowdyexperience;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
<<<<<<< HEAD
import android.widget.ImageButton;
=======
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;

import edu.utsa.cs3443.rowdyexperience.model.Checklist;
import edu.utsa.cs3443.rowdyexperience.model.User;

public class DashboardActivity extends AppCompatActivity {

    private User mainUser;

    int[] ImageIdsAccToTier = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.finalbadge};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        setupUser();

        ImageView food = findViewById(R.id.foodbadge);
        food.setImageResource(ImageIdsAccToTier[mainUser.getBadgeFromName("food").getTier()-1]);

        ImageView nightlife = findViewById(R.id.nightlifebadge);
        nightlife.setImageResource(ImageIdsAccToTier[mainUser.getBadgeFromName("nightlife").getTier()-1]);

        ImageView sports = findViewById(R.id.sportsbadge);
        sports.setImageResource(ImageIdsAccToTier[mainUser.getBadgeFromName("sports").getTier()-1]);

        ImageView buildings = findViewById(R.id.buildingsbadge);
        buildings.setImageResource(ImageIdsAccToTier[mainUser.getBadgeFromName("buildings").getTier()-1]);

        ImageView activities = findViewById(R.id.activitiesbadge);
        activities.setImageResource(ImageIdsAccToTier[mainUser.getBadgeFromName("activities").getTier()-1]);





        // food button
<<<<<<< HEAD
        ImageButton food_button = findViewById(R.id.foodButton);
=======
        Button food_button = findViewById(R.id.foodButton);
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchChecklistActivity("food");
            }
        });

<<<<<<< HEAD
        ImageButton nightlife_Button = findViewById(R.id.nightlifeButton);
=======
        Button nightlife_Button = findViewById(R.id.nightlifeButton);
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
        nightlife_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchChecklistActivity("nightlife");
            }
        });

<<<<<<< HEAD
        ImageButton sports_Button = findViewById(R.id.sportsButton);
=======
        Button sports_Button = findViewById(R.id.sportsButton);
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
        sports_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchChecklistActivity("sports");
            }
        });

<<<<<<< HEAD
        ImageButton buildings_Button = findViewById(R.id.buildingsButton);
=======
        Button buildings_Button = findViewById(R.id.buildingsButton);
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
        buildings_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchChecklistActivity("buildings");
            }
        });

<<<<<<< HEAD
        ImageButton activities_Button = findViewById(R.id.activitiesButton);
=======
        Button activities_Button = findViewById(R.id.activitiesButton);
>>>>>>> 15312c2d50d55c11f89d629af8546c5e93fa43f7
        activities_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchChecklistActivity("activities");
            }
        });


    }


    public void findUser(String username) {
        // Build the correct path to the user's CSV file
        File userFile = new File(getFilesDir(), "users/" + username + "/user.csv");

        if (userFile.exists()) {
            mainUser = User.readUser(this, userFile.getAbsolutePath());
        } else {
            Toast.makeText(this, "User file not found for " + username, Toast.LENGTH_SHORT).show();
        }
    }


    public void launchChecklistActivity(String val) {
        Intent intent = new Intent(this, ChecklistActivity.class);
        intent.putExtra("username",mainUser.getUserName());
        intent.putExtra("button",val);
        startActivity(intent);
    }

    public void setupUser(){
        String editor = getIntent().getStringExtra("username");
        findUser(editor);

        //setting the values
        TextView username = findViewById(R.id.username_dash);
        username.setText(mainUser.getUserName());

        TextView names = findViewById(R.id.first_last_name);
        editor = mainUser.getFirstName()+" "+mainUser.getLastName();
        names.setText(editor);

        TextView year = findViewById(R.id.graduation_txt);
        editor = "Class of "+mainUser.getYear();
        year.setText(editor);
    }

}