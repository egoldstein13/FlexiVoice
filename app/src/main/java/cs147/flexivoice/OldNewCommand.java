package cs147.flexivoice;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OldNewCommand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_new_command);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button addNewCommand = (Button) findViewById(R.id.button7);
        addNewCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "New Command Created!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(OldNewCommand.this, MyCommands.class);
                intent.putExtra("CREATED", true);
                startActivity(intent);

            }
        });

        final Spinner spinner;
        final String[] arrayForSpinner = {"Alexa, turn on smart light"};
        spinner = (Spinner)findViewById(R.id.spinner);
        //ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        //spinner.setAdapter(dataAdapter);
        final ArrayAdapter<String> spinnerAdapter = new  ArrayAdapter<String>(OldNewCommand.this,android.R.layout.simple_spinner_dropdown_item, arrayForSpinner);
        final TextView oldCommand = (TextView) findViewById(R.id.textView13);
        oldCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(OldNewCommand.this)
                        .setTitle("Built-in Commands")
                        .setAdapter(spinnerAdapter, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                oldCommand.setText(arrayForSpinner[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();


            }
        });

        final TextView newCommand = (TextView) findViewById(R.id.textView15);
        newCommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newCommand.setText("Alexa, turn on my awesome light");
            }
        });
        ImageButton back = (ImageButton) findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OldNewCommand.this, AddNewCommand.class);
                startActivity(intent);

            }
        });



    }

}
