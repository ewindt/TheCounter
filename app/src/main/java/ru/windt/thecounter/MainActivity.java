package ru.windt.thecounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    private Button btnCount;
    private TextView lblText;
    private TableRow tableLayout;

    public static final String NEW_NAME = "nameNewCounter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        //btnCount = (Button) findViewById(R.id.button);
        //lblText = (TextView) findViewById(R.id.textView);

        tableLayout = (TableRow) findViewById(R.layout.content_main);
        Intent intent = getIntent();
        String nameNewCounter = intent.getStringExtra(NEW_NAME);
        // создаем Layout -> button -> textView в TableRow
        //lblText.setText(nameNewCounter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btnClick(View v) {
        //int newCount = Integer.parseInt((String)btnCount.getText())+1;
        //lblText.setText(Integer.toString(newCount));
    }

    public void onClickCreate(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
        Intent intent = new Intent(this, CreateCounterActivity.class);
        startActivity(intent);
    }

}
