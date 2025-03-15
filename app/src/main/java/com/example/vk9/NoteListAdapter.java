package com.example.vk9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class NoteListAdapter extends RecyclerView.Adapter<NoteViewHolder> {
    private ArrayList<Note> notes;

    public NoteListAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_view, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.NoteIdText.setText("ID: " + note.getId());
        holder.NoteTitleText.setText(note.getTitle());
        holder.NoteContentText.setText(note.getContent());
        holder.NoteTimeAndDateText.setText(note.getTimeAndDate());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
