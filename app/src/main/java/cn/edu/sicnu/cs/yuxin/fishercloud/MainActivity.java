package cn.edu.sicnu.cs.yuxin.fishercloud;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cardGameOnClick(View view) {
        switch (view.getId()) {
            case R.id.cardGameButton:
                try {
                    Intent intent = new Intent(MainActivity.this, CardGameActivity.class);
                    startActivity(intent);
                    //Toast.makeText(MainActivity.this, "ToCardGame", Toast.LENGTH_SHORT).show();
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
