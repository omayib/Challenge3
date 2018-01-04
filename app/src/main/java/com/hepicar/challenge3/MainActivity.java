package com.hepicar.challenge3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<Account> accounts = new ArrayList<>();
    private ContactRecyclerAdapter adapter;
    private Button buttonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerRecentConversation);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new ContactRecyclerAdapter(accounts);
        recyclerView.setAdapter(adapter);

        setupTheData();
    }

    private void setupTheData() {
        accounts.add(new Account("Anwar","08765678"));
        accounts.add(new Account("Adi","08564700"));
        accounts.add(new Account("Susilo","0886545569"));
        accounts.add(new Account("Ikhwan Nur","08795564"));
        accounts.add(new Account("Awaludin","08564789"));
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, AddContactActivity.class));
    }
}
