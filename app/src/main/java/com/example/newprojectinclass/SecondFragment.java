package com.example.newprojectinclass;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class SecondFragment extends Fragment {

    ImageView imgv;
    TextView txt_pname, txt_desc , txt_type, txt_height, txt_weight, txt_ability;

    private NavController navController;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        navController = Navigation.findNavController(getActivity(),R.id.nav_host_fragment);

        Pokemon_ p = getArguments().getParcelable("data");
         imgv = view.findViewById(R.id.imageView);
         txt_pname = view.findViewById(R.id.textView);
         txt_desc = view.findViewById(R.id.textView2);
         txt_type = view.findViewById(R.id.textView3);
         txt_height = view.findViewById(R.id.textView4);
         txt_weight = view.findViewById(R.id.textView7);
         txt_ability = view.findViewById(R.id.textView8);
         genView(p);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    public  void genView (Pokemon_ p){

        Picasso.get().load(p.getImage()).into(imgv);
        txt_pname.setText(p.getName());
        txt_desc.setText(p.getDescription());
        txt_type.setText("Type : "+p.getType());
        txt_ability.setText("Ability : "+p.getAbility());
        txt_height.setText("Height : "+p.getHeight());
        txt_weight.setText("Weight : "+p.getWeight());

    }


}
