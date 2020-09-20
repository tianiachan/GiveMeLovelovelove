package c.tiania.lovereminder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method called when tap let's begin button
    public void letsBeginPressed(View view)
    {
        //bind the two activites together using an intent
        Intent intent = new Intent(this, FiveLanguagesActivity.class);
        //start new activity to show fie languages menu
        startActivity(intent);
    }
}