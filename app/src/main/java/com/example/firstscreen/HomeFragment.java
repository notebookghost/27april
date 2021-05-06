package com.example.firstscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    private Button mLogOutBtn;
    private FirebaseAuth mAuth;
    private ImageButton netflix_btn, amazon_btn, zee_btn, spotify_btn, alt_btn, hotstar_btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mLogOutBtn = view.findViewById(R.id.log_out_btn);
        netflix_btn = view.findViewById(R.id.imageButtonnetflix);
        amazon_btn = view.findViewById(R.id.imageButtonprime);
        alt_btn = view.findViewById(R.id.imageButtonalt);
        hotstar_btn = view.findViewById(R.id.imageButtonhotstar);
        zee_btn = view.findViewById(R.id.imageButtonzee);
        spotify_btn = view.findViewById(R.id.imageButtonspotify);

        mAuth = FirebaseAuth.getInstance();

        mLogOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(getActivity() , SecondScreen.class));
            }
        });

        netflix_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListingActivity.class);
                startActivity(intent);
            }
        });

        amazon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListingActivity.class);
                startActivity(intent);
            }
        });

        spotify_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListingActivity.class);
                startActivity(intent);
            }
        });

        alt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListingActivity.class);
                startActivity(intent);
            }
        });

        zee_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListingActivity.class);
                startActivity(intent);
            }
        });

        hotstar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListingActivity.class);
                startActivity(intent);
            }
        });
    }
}
