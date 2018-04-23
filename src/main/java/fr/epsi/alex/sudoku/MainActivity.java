package fr.epsi.alex.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button easy = (Button)findViewById(R.id.easy);
        final MainActivity context = this;

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Easy.class);
                startActivity(intent);
            }
        });
    }
}
