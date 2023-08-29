package com.example.localfoodoasis;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FruitFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FruitFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FruitFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FruitFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FruitFragment newInstance(String param1, String param2) {
        FruitFragment fragment = new FruitFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_fruit, container, false);

        ImageView melonImageView = view.findViewById(R.id.melonImage);
        Glide.with(this)
                .load(R.drawable.melon)
                .apply(new RequestOptions().transform(new RoundedCorners(20)))
                .into(melonImageView);

        ImageView peachImageView = view.findViewById(R.id.peachImage);
        Glide.with(this)
                .load(R.drawable.peach)
                .apply(new RequestOptions().transform(new RoundedCorners(20)))
                .into(peachImageView);

        ImageView grapeImageView = view.findViewById(R.id.grapeImage);
        Glide.with(this)
                .load(R.drawable.grape)
                .apply(new RequestOptions().transform(new RoundedCorners(20)))
                .into(grapeImageView);

        ImageView blueberryImageView = view.findViewById(R.id.blueberryImage);
        Glide.with(this)
                .load(R.drawable.blueberry)
                .apply(new RequestOptions().transform(new RoundedCorners(20)))
                .into(blueberryImageView);

        ImageView kmelonImageView = view.findViewById(R.id.kmelonImage);
        Glide.with(this)
                .load(R.drawable.kmelon)
                .apply(new RequestOptions().transform(new RoundedCorners(20)))
                .into(kmelonImageView);

        ImageView plumImageView = view.findViewById(R.id.plumImage);
        Glide.with(this)
                .load(R.drawable.plum)
                .apply(new RequestOptions().transform(new RoundedCorners(20)))
                .into(plumImageView);

        ConstraintLayout watermelonButton = (ConstraintLayout) view.findViewById(R.id.watermelonButton);

        watermelonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),watermelon.class);
                startActivity(intent);

            }
        });
        // Inflate the layout for this fragment
        return view;
    }



}