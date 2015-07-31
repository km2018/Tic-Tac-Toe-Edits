package com.example.abhi.demapples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//Test Comment
public class TicTic extends AppCompatActivity implements View.OnClickListener {

    private int i;
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button b10;
    boolean n1, n2, n3, n4, n5, n6, n7, n8, n9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        n1 = true;
        n2 = true;
        n3 = true;
        n4 = true;
        n5 = true;
        n6 = true;
        n7 = true;
        n8 = true;
        n9 = true;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tic);
        b1 = (ImageButton) this.findViewById(R.id.button_1);
        b1.setOnClickListener(this);
        b2 = (ImageButton) this.findViewById(R.id.button_2);
        b2.setOnClickListener(this);
        b3 = (ImageButton) this.findViewById(R.id.button_3);
        b3.setOnClickListener(this);
        b4 = (ImageButton) this.findViewById(R.id.button_4);
        b4.setOnClickListener(this);
        b5 = (ImageButton) this.findViewById(R.id.button_5);
        b5.setOnClickListener(this);
        b6 = (ImageButton) this.findViewById(R.id.button_6);
        b6.setOnClickListener(this);
        b7 = (ImageButton) this.findViewById(R.id.button_7);
        b7.setOnClickListener(this);
        b8 = (ImageButton) this.findViewById(R.id.button_8);
        b8.setOnClickListener(this);
        b9 = (ImageButton) this.findViewById(R.id.button_9);
        b9.setOnClickListener(this);
        b10 = (Button) this.findViewById(R.id.new_game);
        b10.setOnClickListener(this);
        i = 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tic_tic, menu);
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

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_1:
                    if (n1 == true) {
                        if (i % 2 == 0) {
                            b1.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b1.setImageResource(R.drawable.blue);
                        }
                        n1 = false;
                        i++;
                    }
                    break;
                case R.id.button_2:

                    if (n2 == true) {
                        if (i % 2 == 0) {
                            b2.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b2.setImageResource(R.drawable.blue);
                        }
                        i++;
                        n2 = false;
                    }


                    break;
                case R.id.button_3:
                    if (n3 == true) {
                        if (i % 2 == 0) {
                            b3.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b3.setImageResource(R.drawable.blue);
                        }
                        i++;
                        n3 = false;
                    }


                    break;
                case R.id.button_4:
                    if (n4 == true) {
                        if (i % 2 == 0) {
                            b4.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b4.setImageResource(R.drawable.blue);

                        }
                        i++;
                        n4 = false;
                    }

                    break;
                case R.id.button_5:
                    if (n5 == true) {
                        if (i % 2 == 0) {
                            b5.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b5.setImageResource(R.drawable.blue);
                        }
                        i++;
                        n5 = false;
                    }
                    break;
                case R.id.button_6:
                    if (n6 == true) {
                        if (i % 2 == 0) {
                            b6.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b6.setImageResource(R.drawable.blue);
                        }
                        i++;
                        n6 = false;
                    }
                    break;
                case R.id.button_7:
                    if (n7 == true) {
                        if (i % 2 == 0) {
                            b7.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b7.setImageResource(R.drawable.blue);
                        }
                        i++;
                        n7 = false;
                    }
                    break;
                case R.id.button_8:
                    if (n8 == true) {
                        if (i % 2 == 0) {
                            b8.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b8.setImageResource(R.drawable.blue);
                        }
                        i++;
                        n8 = false;
                    }
                    break;
                case R.id.button_9:
                    if (n9 == true) {
                        if (i % 2 == 0) {
                            b9.setImageResource(R.drawable.red);
                        }
                        if (i % 2 == 1) {
                            b9.setImageResource(R.drawable.blue);
                        }
                        i++;
                        n9 = false;
                    }
                    break;
                case R.id.new_game:
                    i = 0;
                    finish();
                    startActivity(getIntent());


                    break;


            }



    }
}

//This is just a test comment



