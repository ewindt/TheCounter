package ru.windt.thecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateCounterActivity extends AppCompatActivity {

    private EditText nameCounter;
    private Button btnCreate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_counter);

        nameCounter = (EditText) findViewById(R.id.editText);
        btnCreate = (Button) findViewById(R.id.btnCreate_cnt);

    }

    public void onClickCreateBtn(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.NEW_NAME, nameCounter.getText().toString());
        startActivity(intent);
    }
}
