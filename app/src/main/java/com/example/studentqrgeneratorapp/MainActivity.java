package com.example.studentqrgeneratorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText studentName, studentNumber, studentSection;
        Button button2;

        studentName = findViewById(R.id.studentName);
        studentNumber = findViewById(R.id.studentNumber);
        studentSection = findViewById(R.id.studentNumber);
        button2 = findViewById(R.id.button2);

        String studentNameString = studentName.getText().toString();
        String studentNumberString = studentNumber.getText().toString();
        String studentSectionString = studentSection.getText().toString();

        String convertTexttoQR;

        button2.setOnClickListener(view -> {
            try {
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                Bitmap bitmap = barcodeEncoder.encodeBitmap("'Lustre, Darwin S.','2018-107574','CEIT-03-702E'", BarcodeFormat.QR_CODE, 500, 500);
                ImageView imageViewQrCode = (ImageView) findViewById(R.id.qrCode);
                imageViewQrCode.setImageBitmap(bitmap);
            } catch(Exception e) {

            }});




    }
}
