package com.example.vk9;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ListNotesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NoteListAdapter adapter;
    private ArrayList<Note> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        recyclerView = findViewById(R.id.ListNotesRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        notes = NoteStorage.getInstance().getNotes();
        adapter = new NoteListAdapter(notes);
        recyclerView.setAdapter(adapter);
    }
    @Override
    protected void onResume() {
        super.onResume();
        notes = NoteStorage.getInstance().getNotes();
        adapter.notifyDataSetChanged();
    }
}