package android.mymddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kogitune.activity_transition.ActivityTransition;
import com.kogitune.activity_transition.ExitActivityTransition;

public class SubActivity extends AppCompatActivity {

    ExitActivityTransition exitTransition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        exitTransition = ActivityTransition.with(getIntent()).to(findViewById(R.id.image_view)).duration(500).start(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        exitTransition.exit(this);
    }

}
