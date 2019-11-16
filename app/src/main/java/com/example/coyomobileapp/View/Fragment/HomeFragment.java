package com.example.coyomobileapp.View.Fragment;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.coyomobileapp.R;
import com.example.coyomobileapp.View.Activity.KtaActivity;
import com.example.coyomobileapp.View.Adapter.HomeAdapter;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton imgKTA = rootView.findViewById(R.id.imagebtnKTA);
        SliderView sliderView = rootView.findViewById(R.id.sliderViewHome);
        imgKTA.setOnClickListener(this);

        HomeAdapter homeAdapter = new HomeAdapter(getContext());
        sliderView.setSliderAdapter(homeAdapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent move = new Intent(getContext(), KtaActivity.class);
        startActivity(move);
    }
}
