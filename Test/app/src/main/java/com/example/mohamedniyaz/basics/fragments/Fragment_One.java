package com.example.mohamedniyaz.basics.fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.mohamedniyaz.basics.Interface.FragmentInterface;
import com.example.mohamedniyaz.basics.R;

import static android.content.ContentValues.TAG;

public class Fragment_One extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_one,null);
        init(root);
        return root;

    }

    FragmentInterface fragmentInterface;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            fragmentInterface = (FragmentInterface)getActivity();
        }

        catch (Exception e){

            Log.d(TAG, "onAttach: Must implement Button");
        }


    }

     void init(final ViewGroup root) {

         Button button = (Button)root.findViewById(R.id.fragment1_button1);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 EditText editText = (EditText)root.findViewById(R.id.fragment1_textView1);
                 String msg = editText.getText().toString();
                 fragmentInterface.FragmentMessage(msg);
             }
         });

    }
}
