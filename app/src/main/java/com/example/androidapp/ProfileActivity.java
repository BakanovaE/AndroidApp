package com.example.androidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

public class ProfileActivity extends AppCompatActivity {
    public static String EMAIL_KEY = "EMAIL_KEY";
    public static String PASSWORD_KEY = "PASSWORD_KEY";

    private AppCompatImageView mPhoto;
    private TextView mLogin;
    private TextView mPassword;

    private View.OnClickListener mOnPhotoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //todo click action
        }
    };

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.ac_profile);

        mPhoto = findViewById(R.id.ivPhoto);
        mLogin = findViewById(R.id.tvEmail);
        mPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();
        mLogin.setText(bundle.getString(EMAIL_KEY));
        mPassword.setText(bundle.getString(PASSWORD_KEY));

        mPhoto.setOnClickListener(mOnPhotoClickListener);
    }
}
