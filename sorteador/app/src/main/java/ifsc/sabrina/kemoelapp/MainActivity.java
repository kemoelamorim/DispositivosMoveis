package ifsc.sabrina.kemoelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView numberMenor;
    TextView numberMaior;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberMenor = findViewById(R.id.editTextNumber);
        numberMaior = findViewById(R.id.editTextNumber2);
    }
    public void clickSortear(View view){
        int min = Integer.parseInt(numberMenor.getText().toString());
        int max = Integer.parseInt(numberMaior.getText().toString());

        int randomNum = min + (int)(Math.random() * (max - min));

        String res = String.valueOf(randomNum);
        TextView results = findViewById(R.id.number);
        results.setText(res);
    }
}