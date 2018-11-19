package cs147.flexivoice;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AddNewCommand extends AppCompatActivity {
    boolean isClicked1 = false;
    boolean isClicked2 = false;
    boolean isClicked3 = false;
    boolean isClicked4 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_command);
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

        final Button  button= (Button) findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(isClicked1) {
                        button.setBackgroundResource(R.drawable.roundedbutton);
                        isClicked1 = false;
                    } else {
                        button.setBackgroundResource(R.drawable.roundedbuttonclicked);
                        isClicked1 = true;
                    }
                }
            });
        final Button  button2= (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isClicked2) {
                    button2.setBackgroundResource(R.drawable.roundedbutton);
                    isClicked2 = false;
                } else {
                    button2.setBackgroundResource(R.drawable.roundedbuttonclicked);
                    isClicked2 = true;
                }
            }
        });
        final Button  button3= (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isClicked3) {
                    button3.setBackgroundResource(R.drawable.roundedbutton);
                    isClicked3 = false;
                } else {
                    button3.setBackgroundResource(R.drawable.roundedbuttonclicked);
                    isClicked3 = true;
                }
            }
        });
        final Button  button4= (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isClicked4) {
                    button4.setBackgroundResource(R.drawable.roundedbutton);
                    isClicked4 = false;
                } else {
                    button4.setBackgroundResource(R.drawable.roundedbuttonclicked);
                    isClicked4 = true;
                }
            }
        });
        Button myCommands = (Button) findViewById(R.id.button6);
        myCommands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AddNewCommand.this, OldNewCommand.class);
                startActivity(intent);

            }
        });
        }



    }


