package com.example.andreza.harvardmuseums.fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.andreza.harvardmuseums.R;

public class MuseumFragment extends Fragment {

    public Listener listener;

    public interface Listener {
        void goToMuseumDetail(int museumId);
    }

    public MuseumFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (Listener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_museum, container, false);
        ImageView iconMap1 = view.findViewById(R.id.imageView_museum1_home);
        iconMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.goToMuseumDetail(1);
            }
        });
        ImageView iconMap2 = view.findViewById(R.id.imageView_museum2_home);
        iconMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.goToMuseumDetail(2);
            }
        });
        ImageView iconMap3 = view.findViewById(R.id.imageView_museum3_home);
        iconMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.goToMuseumDetail(3);
            }
        });

        return view;
    }

}