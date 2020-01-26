package id.ac.poliban.mi.andre.inputmahasiswa2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_CODE = 100;
    MhsInfo mhsInfo;
    TextView txResult;
    String nim;
    String nama;
    String alamat;
    String telp;

    @Override
    public void onBackPressed() {

        new android.app.AlertDialog.Builder(this)
                .setTitle("Close Confirmasion")
                .setTitle("Close App")
                .setIcon(android.R.drawable.star_big_on)
                .setCancelable(true)
                .setPositiveButton("YES", (dialog, which) -> super.onBackPressed())
                .setNegativeButton("NO", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btInput = findViewById(R.id.btInput);
        Button btData = findViewById(R.id.btData);
        txResult = findViewById(R.id.txResult);
        btInput.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MhsActivity.class);
            startActivityForResult(intent, 1);
        });


        btData.setOnClickListener(v -> {
//            mhsInfo = (MhsInfo) getIntent().getSerializableExtra("seri");
//            String nim = mhsInfo.getNime();
//            String nama = mhsInfo.getNama();
//            String alamat = mhsInfo.getAlamat();
//            String telp = mhsInfo.getTelp();
//            String dataNim = getIntent().getStringExtra(MhsActivity.EXTRA_NIM);
//            Intent intent = getIntent();
//            String nime = intent.getStringExtra("datanim");

//            if(getIntent().getExtras() !=null){
            new AlertDialog.Builder(this)
                    .setTitle("Info")
                    .setMessage(
//                            "NIM: "+nim+"\n"+
//                            "Nama: " + nama + "\n"+
//                            "Alamat: " + alamat + "\n" +
//                            "Telp: " + telp + "\n" + "\n"
                            "NIM: " + getIntent().getStringExtra("datanim") + "\n" +
                                    "Nama: " + getIntent().getStringExtra("datanama") + "\n" +
                                    "Alamat: " + getIntent().getStringExtra("dataalamat") + "\n" +
                                    "Telp: " + getIntent().getStringExtra("datatelp") + "\n"
                    )
                    .setPositiveButton("OK", null).show();
//            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                if (data.getExtras() != null) {
//                    String nim;
//                    String nama;
//                    String alamat;
//                    String telp;

                    nim = data.getStringExtra("dataNim");
                    nama = data.getStringExtra("dataNama");
                    alamat = data.getStringExtra("dataAlamat");
                    telp = data.getStringExtra("dataTelp");
                }
            }
        }
    }

}
