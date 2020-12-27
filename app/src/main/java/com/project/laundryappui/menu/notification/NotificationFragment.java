package com.project.laundryappui.menu.notification;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.laundryappui.R;
import com.project.laundryappui.menu.home.adapter.HomeAdapter;
import com.project.laundryappui.menu.home.model.HomeModel;
import com.project.laundryappui.menu.notification.adapter.NotificationAdapter;
import com.project.laundryappui.menu.notification.model.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {
    private Context mContext;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private NotificationAdapter notificationAdapter;
    private List<NotificationModel> notificationModelList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setAdapterType(view);
        setAdapter();
    }

    private void initData() {
        notificationModelList = new ArrayList<>();

        notificationModelList.add(new NotificationModel(R.drawable.ic_box, "Order No : #73636265", "Order Confirmed" ));
        notificationModelList.add(new NotificationModel(R.drawable.ic_box, "Order No : #63231323", "Order Confirmed" ));
    }

    private void setAdapterType(View view) {
        recyclerView    = view.findViewById(R.id.recyclerview_order);
        layoutManager   = new LinearLayoutManager(mContext);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        recyclerView.setNestedScrollingEnabled(true);
    }

    private void setAdapter() {
        initData();

        notificationAdapter = new NotificationAdapter(notificationModelList);
        recyclerView.setAdapter(notificationAdapter);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }
}