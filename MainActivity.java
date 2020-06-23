package com.example.churdlab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int mStatus = 0;
    int[][] mStatusArray = new int[11][7];


    @Override
    public void onSaveInstanceState(Bundle state) {
        Bundle bundle = new Bundle();
        //stash stuff in bundle?


        state.putInt("myStatus", mStatus);
        super.onSaveInstanceState(state);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mStatus  = savedInstanceState.getInt("myStatus");
        mStatus -=1;
        setmStatus();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createStatusArray();
        SevenSegment sg = findViewById(R.id.sevenSegment2);
        sg.setStatus(0);
        SevenSegment sgLL1 = findViewById(R.id.sevenSegmentLL1);
        sgLL1.setStatus(1);
        SevenSegment sgLL2 = findViewById(R.id.sevenSegmentLL2);
        sgLL2.setStatus(2);
        SevenSegment sgLL3 = findViewById(R.id.sevenSegmentLL3);
        sgLL3.setStatus(3);
        SevenSegment sgLL4 = findViewById(R.id.sevenSegmentLL4);
        sgLL4.setStatus(4);

    }

    private void createStatusArray() {
        //for 0 & 10
        for(int x = 0; x < 7; x++){
            mStatusArray[0][x] = 0;
        }
        //for 1
        for(int x = 0; x < 7; x++){
            if(x==2 || x==5 ){
                mStatusArray[1][x] = 1;
            }
            else{
                mStatusArray[1][x] = 0;}
        }
        //for 2
        for(int x = 0; x < 7; x++){
            if(x==1 || x == 5){
            mStatusArray[2][x] = 0;}
            else mStatusArray[2][x] = 1;
        }
        //for 3
        for(int x = 0; x < 7; x++){
            if(x==1 || x==4){
                mStatusArray[3][x] = 0;}
            else mStatusArray[3][x] = 1;
        }
        //for 4
        for(int x = 0; x < 7; x++){
            if(x==0 || x==4 || x== 6){
                mStatusArray[4][x] = 0;}
            else mStatusArray[4][x] = 1;
        }
        //for 5

        for(int x = 0; x < 7; x++){
            if(x==2 || x==4){
                mStatusArray[5][x] = 0;}
            else mStatusArray[5][x] = 1;
        }
        //for 6
        for(int x = 0; x < 7; x++){
            if(x==2){
                mStatusArray[6][x] = 0;}
            else mStatusArray[6][x] = 1;
        }
        //for 7
        for(int x = 0; x < 7; x++){
            if(x==1 || x==3 || x==4 || x==6){
                mStatusArray[7][x] = 0;}
            else mStatusArray[7][x] = 1;
        }
        //for 8
        for(int x = 0; x < 7; x++){
                mStatusArray[8][x] = 1;
        }
        //for 9
        for(int x = 0; x < 7; x++){
            if(x==4){
                mStatusArray[9][x] = 0;}
            else mStatusArray[9][x] = 1;
        }
        //for 10
        for(int x = 0; x < 7; x++){
            mStatusArray[10][x] = 0;
        }

    }

    //Template for future applications
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // This adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public void onAbout(MenuItem item) {
        Toast.makeText(this, "Lab 4, Spring 2020, Chaz C Hurd", Toast.LENGTH_SHORT).show();
    }
    // end template

   public void onButtonClick(View view){
        setmStatus();
   }
   public int getStatus(){
        return mStatus;
   }


   public void setmStatus(){
        int bLL= 0, bL= 0, bR = 0, bRR = 0;
        switch(mStatus) {
            case (0):
                mStatus = 1;
                bLL = 2;
                bL = 3;
                bR = 4;
                bRR = 5;
                break;
            case (1):
                mStatus = 2;
                bLL = 3;
                bL = 4;
                bR = 5;
                bRR = 6;
                break;
            case (2):
                mStatus = 3;
                bLL = 4;
                bL = 5;
                bR = 6;
                bRR = 7;
                break;
            case (3):
                mStatus = 4;
                bLL = 5;
                bL = 6;
                bR = 7;
                bRR = 8;
                break;
            case (4):
                mStatus = 5;
                bLL = 6;
                bL = 7;
                bR = 8;
                bRR = 9;
                break;
            case (5):
                mStatus = 6;
                bLL = 7;
                bL = 8;
                bR = 9;
                bRR = 10;
                break;
            case (6):
                mStatus = 7;
                bLL = 8;
                bL = 9;
                bR = 10;
                bRR = 0;
                break;
            case (7):
                mStatus = 8;
                bLL = 9;
                bL = 10;
                bR = 0;
                bRR = 1;
                break;
            case (8):
                mStatus = 9;
                bLL = 10;
                bL = 0;
                bR = 1;
                bRR = 2;
                break;
            case (9):
                mStatus = 10;
                bLL = 0;
                bL = 1;
                bR = 2;
                bRR = 3;
                break;
            case (10):
                mStatus = 0;
                bLL = 1;
                bL = 2;
                bR = 3;
                bRR = 4;
                break;
        }
       SevenSegment sg = findViewById(R.id.sevenSegment2);
       SevenSegment sgll = findViewById(R.id.sevenSegmentLL1);
       SevenSegment sgll2 = findViewById(R.id.sevenSegmentLL2);
       SevenSegment sgll3 = findViewById(R.id.sevenSegmentLL3);
       SevenSegment sgll4 = findViewById(R.id.sevenSegmentLL4);

        sg.setStatus(mStatus);
        sgll.setStatus(bLL);
        sgll2.setStatus(bL);
        sgll3.setStatus(bR);
        sgll4.setStatus(bRR);

        sg.invalidate();
        sgll.invalidate();
        sgll2.invalidate();
        sgll3.invalidate();
        sgll4.invalidate();
        }

   }

