package com.example.pictza;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ImageView user;
    TextView usertxt;
    String isAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        isAdmin=getIntent().getStringExtra("isadmin");

        ImageView user = findViewById(R.id.imageView42);
        TextView usertxt = findViewById(R.id.textView70);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isAdmin.equals("user")){

                    Toast t = Toast.makeText(getApplicationContext(), "Sorry, Only admin can manage users", Toast.LENGTH_SHORT);
                    t.show();
                    return;

                }

                if (isAdmin.equals("admin")){

                    Intent intent = new Intent(HomeActivity.this, addToAuctionOr.class);
                    startActivity(intent);
                    return;

                }

            }
        });

        usertxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isAdmin.equals("user")){

                    Toast t = Toast.makeText(getApplicationContext(), "Sorry, Only admin can manage users", Toast.LENGTH_SHORT);
                    t.show();
                    return;

                }

                if (isAdmin.equals("admin")){

                    Intent intent = new Intent(HomeActivity.this, addToAuctionOr.class);
                    startActivity(intent);
                    return;

                }

            }
        });

    }

    public void logout(View view) {
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void opencart(View view) {
        Intent intent = new Intent(HomeActivity.this, AddOrCart.class);
        startActivity(intent);
    }

    public void shows(View view) {
        Intent intent = new Intent(HomeActivity.this, viewOrEdit.class);
        startActivity(intent);
    }

    public void opensearch(View view) {
        Intent intent = new Intent(HomeActivity.this, ManagePainting.class);
        startActivity(intent);
    }

    public void openpaint(View view) {
        Intent intent = new Intent(HomeActivity.this, paintings.class);
        startActivity(intent);
    }

}
