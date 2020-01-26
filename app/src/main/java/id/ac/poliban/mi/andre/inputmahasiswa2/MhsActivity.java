package id.ac.poliban.mi.andre.inputmahasiswa2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MhsActivity extends AppCompatActivity {

    MhsInfo mhsInfo;
    public static final String EXTRA_NIM = "com.example.application.example.EXTRA_NIM";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mhs_activity);

        mhsInfo = (MhsInfo)getIntent().getSerializableExtra("mydata");
        EditText etNime = findViewById(R.id.etNim);
        EditText etNama = findViewById(R.id.etNama);
        EditText etAlamat = findViewById(R.id.etAlamat);
        EditText etTelp = findViewById(R.id.etTelp);
        Button btSend = findViewById(R.id.btSend);

//        btSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                String dataNim = etNime.getText().toString();
////                Intent intent = new Intent(MhsActivity.this, MainActivity.class);
////                intent.putExtra(EXTRA_NIM, dataNim);
////                finish();
////                sendUserData(etNime.getText().toString(),
////                        etNama.getText().toString(),
////                        etAlamat.getText().toString(),
////                        etTelp.getText().toString());
//            }
//        });





        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
//            Bundle bundle = new Bundle();
            String dataNim = etNime.getText().toString();
            String dataNama = etNama.getText().toString();
            String dataAlamat = etAlamat.getText().toString();
            String dataTelp = etTelp.getText().toString();
//
//            bundle.putSerializable("mynim",dataNim);
            intent.putExtra("nime", dataNim);
            intent.putExtra("dataNim", dataNim);
            intent.putExtra("dataNama", dataNama);
            intent.putExtra("dataAlamat", dataAlamat);
            intent.putExtra("dataTelp", dataTelp);
//            startActivity(intent);
            setResult(Activity.RESULT_OK, intent);
            finish();
        });

    }
    private void sendUserData(String inNim, String inNama, String inAlamat, String inTelp){
        MhsInfo mhsInfo = new MhsInfo();
        mhsInfo.setNime(inNim);
        mhsInfo.setNama(inNama);
        mhsInfo.setAlamat(inAlamat);
        mhsInfo.setTelp(inTelp);
        Bundle b = new Bundle();
        Intent intent = new Intent(this,MainActivity.class);
//        b.putSerializable("seri", mhsInfo);
//        intent.putExtras(b);
        finish();
    }
}
