package com.example.administrator.siso11;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by present on 2016-10-16.
 */
public class TabFragment2 extends Fragment implements OnMapReadyCallback{

    private GoogleMap mMap;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab_fragment_2, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        final SupportMapFragment myMAPF = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        myMAPF.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sydney = new LatLng(38, 127);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


    }

}
