package com.base.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private static  final NumberFormat currencyFormatValue = NumberFormat.getCurrencyInstance();
    private static  final NumberFormat percentFormatValue = NumberFormat.getPercentInstance();

    private double billAmount = 0.0;
    private double tipPercent = 0.25;
    private double totalSalary = 0.0;
    private double savingPercent = 0.25;
    private TextView txtBillAmount,txtTipPercent,txtTip,txtTotalBillAmount, txtSavePercent,txtMoneySaved;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}