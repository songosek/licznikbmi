package licznikbmi.licznikbmi;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText wzrost;
    private EditText waga;
    private TextView wynik;
    private TextView wynik2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wzrost=findViewById(R.id.wzrost);
        waga=findViewById(R.id.waga);
        wynik=findViewById(R.id.wynik);
        wynik2=findViewById(R.id.wynik2);
    }

    public void obliczanieBMI(View view){
        double wzrostWartosc=Double.parseDouble(wzrost.getText().toString());
        double wagaWartosc=Double.parseDouble(waga.getText().toString());
        double wynikWartosc=wagaWartosc/(wzrostWartosc*wzrostWartosc);
        wynik.setText(Double.toString(wynikWartosc));
        if(wynikWartosc<18.5){
            wynik2.setText("Niedowaga");
            wynik2.setTextColor(Color.RED);
        }
        else if(wzrostWartosc>25){
            wynik2.setText("Nadwaga");
            wynik2.setTextColor(Color.RED);
        }
        else{
            wynik2.setText("Normalna waga");
            wynik2.setTextColor(Color.GREEN);
        }
    }
}
