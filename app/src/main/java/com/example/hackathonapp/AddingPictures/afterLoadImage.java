package com.example.hackathonapp.AddingPictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.hackathonapp.R;

public class afterLoadImage extends AppCompatActivity {
private ImageView mImageFromGallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_after_load_image);

        mImageFromGallery = (ImageView) findViewById(R.id.image_after_load);
        Log.v("Tag", getIntent().toString());
//        Intent intent = getIntent();
//        Bitmap bitgetParcelableExtra("image");
        Bitmap map = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("byteArray"),0, getIntent().getByteArrayExtra("byteArray").length);
        mImageFromGallery.setImageBitmap(map);
    }
}