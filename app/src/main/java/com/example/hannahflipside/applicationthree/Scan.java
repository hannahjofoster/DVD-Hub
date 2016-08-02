package com.example.hannahflipside.applicationthree;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Scan extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_scan,container,false);

        Button scanButton = (Button) v.findViewById(R.id.scanButton);

        //Try to get the QR/ Barcode Scanner working

        scanButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CaptureActivity.class);
                intent.setAction("com.google.zxing.client.android.SCAN");
                intent.putExtra("SAVE_HISTORY", false);
                startActivityForResult(intent, 0);
                Log.i("You pushed the button", "");
            }
        });

        return v;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //This code is called when you return from the scanner

       /* public void onActivityResult(int requestCode, int resultCode, Intent intent) {
            if (requestCode == 0) {
                if (resultCode == RESULT_OK) {
                    String contents = intent.getStringExtra("SCAN_RESULT");
                    String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
                    // Handle successful scan
                } else if (resultCode == RESULT_CANCELED) {
                    // Handle cancel
                }
            }
        }*/



    }

}
