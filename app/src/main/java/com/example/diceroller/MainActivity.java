package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.dice);
        button = findViewById(R.id.buttonnn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }
    private void rollDice() {

        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                button.setEnabled(false);

                Timer buttonTimer = new Timer();
                buttonTimer.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                button.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                imageViewDice.setImageResource(R.drawable.done);
                break;
            case 2:
                button.setEnabled(false);

                Timer buttonTimer2 = new Timer();
                buttonTimer2.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                button.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                imageViewDice.setImageResource(R.drawable.dtwo);
                break;
            case 3:
                button.setEnabled(false);

                Timer buttonTimer3 = new Timer();
                buttonTimer3.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                button.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                imageViewDice.setImageResource(R.drawable.dthree);
                break;
            case 4:
                button.setEnabled(false);

                Timer buttonTimer4 = new Timer();
                buttonTimer4.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                button.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                imageViewDice.setImageResource(R.drawable.dfour);
                break;
            case 5:
                button.setEnabled(false);

                Timer buttonTimer5 = new Timer();
                buttonTimer5.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                button.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                imageViewDice.setImageResource(R.drawable.dfive);
                break;
            case 6:
                button.setEnabled(false);

                Timer buttonTimer6 = new Timer();
                buttonTimer6.schedule(new TimerTask() {

                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                button.setEnabled(true);
                            }
                        });
                    }
                }, 2000);
                imageViewDice.setImageResource(R.drawable.dsix);
                break;
        }
    }
}
