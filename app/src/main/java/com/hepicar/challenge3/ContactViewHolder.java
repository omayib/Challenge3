package com.hepicar.challenge3;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.UUID;

/**
 * Created by omayib on 04/01/18.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView itemName;
    private TextView itemPhone;

    public ContactViewHolder(View itemView) {
        super(itemView);
        itemName = (TextView) itemView.findViewById(R.id.textViewName);
        itemPhone = (TextView) itemView.findViewById(R.id.textViewPhoneNumber);
    }

    public void bindContact(Account account){
        this.itemName.setText(account.name);
        this.itemPhone.setText(account.phoneNumber);
    }

}
