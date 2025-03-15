package com.example.vk9;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView NoteIdText, NoteTimeAndDateText, NoteTitleText, NoteContentText;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        NoteIdText = itemView.findViewById(R.id.txtNoteIdText);
        NoteTimeAndDateText = itemView.findViewById(R.id.txtNoteTimeAndDateText);
        NoteTitleText = itemView.findViewById(R.id.NoteTitleText);
        NoteContentText = itemView.findViewById(R.id.txtNoteContentText);
    }
}




