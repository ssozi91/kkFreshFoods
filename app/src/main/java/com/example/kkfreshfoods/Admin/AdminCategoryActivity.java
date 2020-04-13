package com.example.kkfreshfoods.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kkfreshfoods.HomeActivity;
import com.example.kkfreshfoods.MainActivity;
import com.example.kkfreshfoods.R;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView cassava, yam, sweetPotato;
    private ImageView sugarcane, ovacado, jackFruit;
    private ImageView matooke, pineApple, cabbage;

    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);



        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminiNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        cassava = (ImageView) findViewById(R.id.cassava);
        yam = (ImageView) findViewById(R.id.yam);
        sweetPotato = (ImageView) findViewById(R.id.sweetPotato);

        sugarcane = (ImageView) findViewById(R.id.sugarcane);
        ovacado = (ImageView) findViewById(R.id.ovacado_fruit);
        jackFruit = (ImageView) findViewById(R.id.jackfruit);

        matooke = (ImageView) findViewById(R.id.matooke);
        pineApple = (ImageView) findViewById(R.id.pineApple);
        cabbage = (ImageView) findViewById(R.id.cabbage);


        cassava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "cassava");
                startActivity(intent);
            }
        });

        yam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Yam");
                startActivity(intent);
            }
        });


        sweetPotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sweet Potato");
                startActivity(intent);
            }
        });


        sugarcane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Sugarcane");
                startActivity(intent);
            }
        });


        ovacado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Ovacado");
                startActivity(intent);
            }
        });



        jackFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "JackFruit");
                startActivity(intent);
            }
        });



        matooke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Matooke");
                startActivity(intent);
            }
        });


        pineApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "PineApple");
                startActivity(intent);
            }
        });


        cabbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Cabbage");
                startActivity(intent);
            }
        });
    }
}
