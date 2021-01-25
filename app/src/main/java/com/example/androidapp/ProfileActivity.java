package com.example.androidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

public class ProfileActivity extends AppCompatActivity {
    public static final String USER_KEY = "USER_KEY";

    private AppCompatImageView mPhoto;
    private TextView mLogin;
    private TextView mPassword;
    private SharedPreferencesHelper mSharedPreferencesHelper;
    private User mUser;

    private View.OnClickListener mOnPhotoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_profile);

        mSharedPreferencesHelper = new SharedPreferencesHelper(this);

        mPhoto = findViewById(R.id.ivPhoto);
        mLogin = findViewById(R.id.tvEmail);
        mPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();
        mUser = (User) bundle.get(USER_KEY);
        mLogin.setText(mUser.getLogin());
        mPassword.setText(mUser.getPassword());

        mPhoto.setOnClickListener(mOnPhotoClickListener);
    }
}
