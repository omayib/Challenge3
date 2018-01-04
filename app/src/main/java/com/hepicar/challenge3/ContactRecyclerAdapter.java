package com.hepicar.challenge3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * Created by omayib on 30/10/17.
 */

public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    private ArrayList<Account> accounts;

    public ContactRecyclerAdapter(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ContactViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        Account account = accounts.get(position);
        holder.bindContact(account);
    }

    @Override
    public int getItemCount() {
        return this.accounts.size();
    }
}
