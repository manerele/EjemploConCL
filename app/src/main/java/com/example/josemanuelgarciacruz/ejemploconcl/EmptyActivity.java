package com.example.josemanuelgarciacruz.ejemploconcl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmptyActivity extends AppCompatActivity {
    Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        Button buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextWhoAreYou = (EditText) findViewById(R.id.editTextWhoAreYou);
                String name = editTextWhoAreYou.getText().toString();

                editTextWhoAreYou.setError(null);

                if (TextUtils.isEmpty(name.trim())){
                    editTextWhoAreYou.setError("Field Required");
                    editTextWhoAreYou.requestFocus();
                    return;
                }

                Intent intent = new Intent(getApplicationContext(), BasicActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}
