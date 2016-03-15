package com.example.yangjw.liwushuodemo.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yangjw.liwushuodemo.BaseFragment;
import com.example.yangjw.liwushuodemo.R;

/**
 * 除了精选之外的所有类型的公共Fragment
 * created by yangjw 16.3.15
 */
public class CategoryCommonFragment extends BaseFragment {


    private OnFragmentInteractionListener mListener;

    public CategoryCommonFragment() {
        // Required empty public constructor
    }


    public static CategoryCommonFragment newInstance() {
        CategoryCommonFragment fragment = new CategoryCommonFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_common, container, false);
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


}
