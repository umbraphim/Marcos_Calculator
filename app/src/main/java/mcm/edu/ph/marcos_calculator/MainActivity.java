package mcm.edu.ph.marcos_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtVariable1, txtVariable2;
    Button btnAdd, btnSubtract, btnDivide, btnModulo, btnMultiply;
    TextView txtAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVariable1 = findViewById(R.id.txtVariable1);
        txtVariable2 = findViewById(R.id.txtVariable2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);
        btnMultiply = findViewById(R.id.btnMultiply);
        txtAnswer = findViewById(R.id.txtAnswer);


        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        double variable1, variable2, answer;

        variable1 = Double.parseDouble(String.valueOf(txtVariable1.getText()));
        variable2 = Double.parseDouble(String.valueOf(txtVariable2.getText()));


        switch (v.getId()) {

            case R.id.btnAdd:
                //code
                txtAnswer.setText(String.valueOf(add(variable1, variable2)));
                break;
            case R.id.btnSubtract:
                //code
                txtAnswer.setText(String.valueOf(subtract(variable1, variable2)));
                break;
            case R.id.btnDivide:
                //code
                txtAnswer.setText(String.valueOf(divide(variable1, variable2)));
                break;
            case R.id.btnModulo:
                //code
                txtAnswer.setText(String.valueOf(modulo(variable1, variable2)));
                break;
            case R.id.btnMultiply:
                //code
                txtAnswer.setText(String.valueOf(multiply(variable1, variable2)));
                break;

        }
    }
    //datatype name(datatype parameter1, datatype parameter2){return para1 para2}
    double add(double variable1, double variable2){return variable1 + variable2;}
    double subtract(double variable1, double variable2){return variable1 - variable2;}
    double divide(double variable1, double variable2){return variable1 / variable2;}
    double modulo(double variable1, double variable2){return variable1 % variable2;}
    double multiply(double variable1, double variable2){return variable1 * variable2;}
}




