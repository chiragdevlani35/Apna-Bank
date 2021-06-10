package com.chirag.apnabank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomerAdapter_userlist extends RecyclerView.Adapter<com.chirag.apnabank.ViewHolder> {

    com.chirag.apnabank.user_list UserList;
    List<Model> modelList;
    Context context;

    public CustomerAdapter_userlist(com.chirag.apnabank.user_list userList, List<Model> modelList) {
        this.UserList = userList;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public com.chirag.apnabank.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.userslist, parent, false);

        com.chirag.apnabank.ViewHolder viewHolder = new com.chirag.apnabank.ViewHolder(itemView);
        viewHolder.setOnClickListener(new com.chirag.apnabank.ViewHolder.ClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                UserList.nextActivity(position);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull com.chirag.apnabank.ViewHolder holder, int position) {
        holder.mName.setText(modelList.get(position).getName());
        holder.mPhonenumber.setText(modelList.get(position).getPhoneno());
        holder.mBalance.setText(modelList.get(position).getBalance());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
