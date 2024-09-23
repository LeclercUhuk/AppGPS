package com.example.appgps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        Button btnBinus = findViewById(R.id.btnBinus);
        Button btnBraga = findViewById(R.id.btnBraga);
        Button btnAlunAlun = findViewById(R.id.btnAlunAlun);
        Button btnGazibu = findViewById(R.id.btnGazibu);

        btnBinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myMap != null) {
                    LatLng binus = new LatLng(-6.9153653, 107.5886954);
                    myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(binus, 16));
                }
            }
        });

        btnBraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myMap != null) {
                    LatLng braga = new LatLng(-6.9178283, 107.6045685);
                    myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(braga, 16));
                }
            }
        });

        btnAlunAlun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myMap != null) {
                    LatLng alunAlun = new LatLng(-6.9218295, 107.6021967);
                    myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(alunAlun, 16));
                }
            }
        });

        btnGazibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myMap != null) {
                    LatLng gazibu = new LatLng(-6.9002779, 107.6161296);
                    myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gazibu, 16));
                }
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        myMap = googleMap;

        LatLng binus = new LatLng(-6.9153653, 107.5886954);
        LatLng braga = new LatLng(-6.9178283, 107.6045685);
        LatLng alunAlun = new LatLng(-6.9218295, 107.6021967);
        LatLng gazibu = new LatLng(-6.9002779, 107.6161296);

        myMap.addMarker(new MarkerOptions().position(binus).title("Kampus Binus Bandung"));
        myMap.addMarker(new MarkerOptions().position(braga).title("Braga"));
        myMap.addMarker(new MarkerOptions().position(alunAlun).title("Alun-Alun Kota Bandung"));
        myMap.addMarker(new MarkerOptions().position(gazibu).title("Lapangan Gazibu"));

        myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(binus, 16));
    }
}
