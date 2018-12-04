package cs147.flexivoice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyCommands extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_commands);
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

        final TextView tv1= (TextView) findViewById(R.id.textView32);
        final Button b1= (Button) findViewById(R.id.size8);
        final View v1= (View) findViewById(R.id.view5);
        final ImageButton b2= (ImageButton) findViewById(R.id.alexa3);
        boolean commandCreated= getIntent().getBooleanExtra("CREATED",false);
        if(commandCreated){
            tv1.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
            v1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
        }

        Button save = (Button) findViewById(R.id.size2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MyCommands.this, AddNewCommand.class);
                startActivity(intent);

            }
        });
        ImageButton back = (ImageButton) findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyCommands.this, HomePage.class);
                startActivity(intent);

            }
        });
    }


}
