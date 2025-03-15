package com.example.vk9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddNoteActivity extends AppCompatActivity {
    private EditText TitleEdit;
    private EditText ContentEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);

        TitleEdit = findViewById(R.id.TitleEdit);
        ContentEdit = findViewById(R.id.ContentEdit);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void switchToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addNote(View view) {
        String title = TitleEdit.getText().toString();
        String content = ContentEdit.getText().toString();
        Note newNote = new Note(title, content);
        NoteStorage.getInstance().addNote(newNote);
    }
}