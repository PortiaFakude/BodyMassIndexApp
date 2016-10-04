package za.co.codetribe.ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{

    RadioGroup rdg;
    RadioButton select;
    EditText h;

   double BMI = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdg = (RadioGroup) findViewById(R.id.radioGroup);
        h = (EditText) findViewById(R.id.height);

    }

    public void onClick(View view){

        int weight;
        double height;

        height = Double.parseDouble(h.getText().toString());

        DecimalFormat df = new DecimalFormat("#.##");

        switch (view.getId()){
            case R.id.rdg1 :

                weight = 50;
                BMI = weight / Math.pow(height,2);
                String bmi = df.format(BMI);

                Toast.makeText(MainActivity.this,"BMI : " + bmi+ " \nCategory : Underweight" ,Toast.LENGTH_LONG).show();
                break;

            case R.id.rdg2 :

                weight = 65;
                BMI = weight / Math.pow(height,2);
                String bmi1 = df.format(BMI);

                Toast.makeText(MainActivity.this,"BMI : " + bmi1+ "\nCategory : Normal",Toast.LENGTH_LONG).show();
                break;

            case R.id.rdg3 :

                weight = 80;
                BMI = weight / (Math.pow(height,2));
                String bmi2 = df.format(BMI);

                Toast.makeText(MainActivity.this,"BMI : " + bmi2 + "\nCategory : Overweight",Toast.LENGTH_LONG).show();
                break;

            case R.id.rdg4 :

                weight = 100;
                BMI = Math.round(weight / (Math.pow(height,2)));
                String bmi3 = df.format(BMI);

                Toast.makeText(MainActivity.this,"BMI : " + bmi3+ "\nCategory : Obese",Toast.LENGTH_LONG).show();
                break;

            case R.id.rdg5 :

                weight = 150;
                BMI = Math.round(weight / (Math.pow(height,2)));
                String bmi4 = df.format(BMI);

                Toast.makeText(MainActivity.this,"BMI : " + bmi4+ "\nCategory : Clinically Obese",Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void show(View view)
    {
        Intent i = new Intent(MainActivity.this,SecondActivity.class);

        startActivity(i);

    }
}
