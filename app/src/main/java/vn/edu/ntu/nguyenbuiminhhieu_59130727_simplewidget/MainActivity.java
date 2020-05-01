package vn.edu.ntu.nguyenbuiminhhieu_59130727_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup grBt;
    Button btXacNhan;
    EditText ten ,ngaysinh ,khac;
    RadioButton btNam ,btNu;
    CheckBox cbPhim ,cbNhac ,cbCafe ,cbONha ,cbNauAn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }
    private void addViews()
    {
        ten = findViewById(R.id.ten);
        ngaysinh = findViewById(R.id.ngaysinh);
        grBt = findViewById(R.id.grBt);
        khac = findViewById(R.id.khac);
        btXacNhan = findViewById(R.id.btXacNhan);
        btNam = findViewById(R.id.btNam);
        btNu = findViewById(R.id.btNu);
        cbPhim = findViewById(R.id.cbPhim);
        cbNhac = findViewById(R.id.cbNhac);
        cbCafe = findViewById(R.id.cbCafe);
        cbNauAn = findViewById(R.id.cbNauAn);
        cbONha = findViewById(R.id.cbONha);

    }
    private  void addEvent()
    {
        btXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacnhan();
            }
        });
    }
    private void xacnhan()
    {
        int sex = this.grBt.getCheckedRadioButtonId();
        String name = ten.getText().toString().trim();
        String date = ngaysinh.getText().toString().trim();
        RadioButton grbt = this.findViewById(sex);
        String st ="";
        if(cbNhac.isChecked()){
            if (st.length()>0){
                st+= " ,";
            }
            st += "Nghe Nhạc";
        }
        if(cbPhim.isChecked()){
            if (st.length()>0){
                st+= " ,";
            }
            st += "Xem Phim";
        }
        if(cbNauAn.isChecked()){
            if (st.length()>0){
                st+= " ,";
            }
            st += "Vào Bếp Nấu Ăn";
        }
        if(cbONha.isChecked()){
            if (st.length()>0){
                st+= " ,";
            }
            st += "Ở nhà một mình";
        }
        if(cbCafe.isChecked()){
            if (st.length()>0){
                st+= " ,";
            }
            st += "Đi cafe với bạn";
        }
        st +=" ,";
        st += khac.getText().toString().trim();
        String xuat = name + "\nNgaySinh : " + date + "\nGiới Tính : " + grbt.getText() + "\nSở Thích : " + st ;
        Toast.makeText(getApplicationContext(), xuat, Toast.LENGTH_SHORT).show();
    }

}
