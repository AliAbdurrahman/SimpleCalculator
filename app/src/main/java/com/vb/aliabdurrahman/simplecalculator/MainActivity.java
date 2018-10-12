package com.vb.aliabdurrahman.simplecalculator;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.vb.aliabdurrahman.simplecalculator.Base.BaseView;
import com.vb.aliabdurrahman.simplecalculator.Login.presenter.AccesPresenter;
import com.vb.aliabdurrahman.simplecalculator.Login.view.AccessView;

public class MainActivity extends AppCompatActivity implements AccessView{

    TextInputEditText edtBilSatu, edtBilDua;
    Button Tambah, Kurang, Kali, Bagi, Clear;

    private AccesPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new AccesPresenter();
        onAttachView();

        Tambah = findViewById(R.id.btnTambah);
        Kurang = findViewById(R.id.btnKurang);
        Kali = findViewById(R.id.btnKali);
        Bagi = findViewById(R.id.btnBagi);
        Clear = findViewById(R.id.btnClear);

        edtBilSatu = findViewById(R.id.edtBilsatu);
        edtBilDua = findViewById(R.id.edtBilDua);

        final String bilangan1 = edtBilSatu.getText().toString();
        final String bilangan2 = edtBilDua.getText().toString();

        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.tambah(edtBilSatu.getText().toString(), edtBilDua.getText().toString());
            }
        });

        Kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.kurang(edtBilSatu.getText().toString(), edtBilDua.getText().toString());
            }
        });

        Kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.kali(edtBilSatu.getText().toString(), edtBilDua.getText().toString());
            }
        });

        Bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               presenter.bagi(edtBilSatu.getText().toString(), edtBilDua.getText().toString());
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtBilSatu.setText("");
                edtBilDua.setText("");
            }
        });

    }


    @Override
    public void onError(String msg) {

    }

    @Override
    public void onSuccess(String muncul) {
        Toast.makeText(this, muncul, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
    }
}
