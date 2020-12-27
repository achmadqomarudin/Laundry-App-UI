package com.project.laundryappui.menu.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.laundryappui.R;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {
    private Context mContext;
    private RecyclerView recyclerView;
    private SearchAdapter homeAdapter;
    private List<SearchModel> searchModelList;
    public LinearLayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setAdapterType(view);
        setAdapter();
    }

    private void initData() {
        searchModelList = new ArrayList<>();

        searchModelList.add(new SearchModel(R.drawable.bg_post1, "Adek Laundry \nCompany and Co.", "7.5", "Distance 1.5 km"));
        searchModelList.add(new SearchModel(R.drawable.bg_post2, "Saudara Laundry \nCompany and Co.", "8.5", "Distance 2.5 km"));
        searchModelList.add(new SearchModel(R.drawable.bg_post3, "Ponakan Laundry \nCompany and Co.", "9.5", "Distance 3.5 km"));
    }

    private void setAdapterType(View view) {
        recyclerView = view.findViewById(R.id.recyclerview_maps);
        layoutManager = new LinearLayoutManager(mContext);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setNestedScrollingEnabled(true);
    }

    private void setAdapter() {
        initData();

        homeAdapter = new SearchAdapter(searchModelList);
        recyclerView.setAdapter(homeAdapter);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }
}