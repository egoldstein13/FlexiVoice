package cs147.flexivoice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class ShareAlexaDevices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_alexa_devices);
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
        final Button sharePersonalizedCommands = (Button) findViewById(R.id.button10);
        final Button sharePreinstalledCommands = (Button) findViewById(R.id.button9);
        final Button x = (Button) findViewById(R.id.button8);
        final TextView airDrop = (TextView) findViewById(R.id.textView19);
        final TextView email = (TextView) findViewById(R.id.textView21);
        final TextView messenger = (TextView) findViewById(R.id.textView20);
        final TextView other = (TextView) findViewById(R.id.textView23);
        final TextView text = (TextView) findViewById(R.id.textView22);

        final TextView text1 = (TextView) findViewById(R.id.textView24);
        final TextView text2 = (TextView) findViewById(R.id.textView25);
        final ScrollView text3 = (ScrollView) findViewById(R.id.scrollView);
        final Button x2 = (Button) findViewById(R.id.button12);
        final TextView text4 = (TextView) findViewById(R.id.textView26);
        final Button ok = (Button) findViewById(R.id.button14);
        ImageButton back = (ImageButton) findViewById(R.id.backbutton);
        final ImageButton textI = (ImageButton) findViewById(R.id.text);
        final ImageButton emailI = (ImageButton) findViewById(R.id.email);
        final ImageButton airdropI = (ImageButton) findViewById(R.id.airdrop);
        final ImageButton otherI = (ImageButton) findViewById(R.id.other);
        final ImageButton messengerI = (ImageButton) findViewById(R.id.messenger);
        final ImageButton search = (ImageButton) findViewById(R.id.search);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShareAlexaDevices.this, ShareMyDevices.class);
                startActivity(intent);

            }
        });

        sharePersonalizedCommands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ViewGroup layout = (ViewGroup) sharePreinstalledCommands.getParent();
                if(null!=layout) //for safety only  as you are doing onClick
                    layout.removeView(sharePreinstalledCommands);
                airDrop.setVisibility(View.VISIBLE);
                airDrop.bringToFront();
                email.setVisibility(View.VISIBLE);
                email.bringToFront();
                messenger.setVisibility(View.VISIBLE);
                messenger.bringToFront();
                other.setVisibility(View.VISIBLE);
                other.bringToFront();
                text.setVisibility(View.VISIBLE);
                text.bringToFront();
                x.setVisibility(View.VISIBLE);
                emailI.setVisibility(View.VISIBLE);
                airdropI.setVisibility(View.VISIBLE);
                otherI.setVisibility(View.VISIBLE);
                messengerI.setVisibility(View.VISIBLE);
                textI.setVisibility(View.VISIBLE);
                emailI.bringToFront();
                airdropI.bringToFront();
                otherI.bringToFront();
                messengerI.bringToFront();
                textI.bringToFront();

                x.bringToFront();
                x.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        airDrop.setVisibility(View.INVISIBLE);
                        email.setVisibility(View.INVISIBLE);
                        messenger.setVisibility(View.INVISIBLE);
                        other.setVisibility(View.INVISIBLE);
                        text.setVisibility(View.INVISIBLE);
                        x.setVisibility(View.INVISIBLE);
                        emailI.setVisibility(View.INVISIBLE);
                        airdropI.setVisibility(View.INVISIBLE);
                        otherI.setVisibility(View.INVISIBLE);
                        messengerI.setVisibility(View.INVISIBLE);
                        textI.setVisibility(View.INVISIBLE);
                        layout.addView(sharePreinstalledCommands);
                    }
                });

                text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        emailI.setVisibility(View.INVISIBLE);
                        airdropI.setVisibility(View.INVISIBLE);
                        otherI.setVisibility(View.INVISIBLE);
                        messengerI.setVisibility(View.INVISIBLE);
                        textI.setVisibility(View.INVISIBLE);
                        airDrop.setVisibility(View.INVISIBLE);
                        email.setVisibility(View.INVISIBLE);
                        messenger.setVisibility(View.INVISIBLE);
                        other.setVisibility(View.INVISIBLE);
                        text.setVisibility(View.INVISIBLE);
                        x.setVisibility(View.INVISIBLE);

                        search.setVisibility(View.VISIBLE);
                        text1.setVisibility(View.VISIBLE);
                        text2.setVisibility(View.VISIBLE);
                        text3.setVisibility(View.VISIBLE);
                        text4.setVisibility(View.VISIBLE);
                        x2.setVisibility(View.VISIBLE);
                        x2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                search.setVisibility(View.INVISIBLE);
                                text1.setVisibility(View.INVISIBLE);
                                text2.setVisibility(View.INVISIBLE);
                                text3.setVisibility(View.INVISIBLE);
                                text4.setVisibility(View.INVISIBLE);
                                ok.setVisibility(View.INVISIBLE);
                                x2.setVisibility(View.INVISIBLE);
                                text1.setText("CHOOSE CONTACT");
                                layout.addView(sharePreinstalledCommands);
                            }
                        });

                        text4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                text1.setText("Send Command to\nRachel J.?");
                                search.setVisibility(View.INVISIBLE);
                                text2.setVisibility(View.INVISIBLE);
                                text3.setVisibility(View.INVISIBLE);
                                ok.setVisibility(View.VISIBLE);
                                ok.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Toast.makeText(getApplicationContext(), "Command List Sent!", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(ShareAlexaDevices.this, HomePage.class);
                                        startActivity(intent);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });

    }

}
