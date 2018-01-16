package com.abisayuti.biggerorsmaller10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etinput;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etinput = (EditText)findViewById(R.id.etinput);
        btnHitung = (Button) findViewById(R.id.btnsumbit);
        txtHasil = (TextView) findViewById(R.id.txthasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nnomor = etinput.getText().toString();

                int anomor = Integer.parseInt(nnomor);

                if (nnomor.isEmpty()) {
                    etinput.setError("tidak boleh kosong");

                }else if (anomor >= 10) {
                    txtHasil.setText("bigger than 10");
                }else {
                    txtHasil.setText("smaller than 10");
                }


            }
        });

    }
}
