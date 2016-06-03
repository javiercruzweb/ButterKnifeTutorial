package mx.caltec.butterknifetutorial;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    //TODO mostrar error views tipo provate, error view incorrecta


    @BindView(R.id.textView)
    public TextView textView;

    @BindView(R.id.editText)
    public EditText editText;

    @BindView(R.id.imageView)
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //usamos nuestras views
        textView.setText("Hola!");
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.shop_icon));
    }

    @OnClick(R.id.button) void showToast(){
        Toast.makeText(this, String.valueOf(editText.getText().toString()), Toast.LENGTH_SHORT).show();
    }

}
