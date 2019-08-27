package ui.wahyuapps.login;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{
	private Toolbar mToolbar;
	private ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		mToolbar = findViewById(R.id.toolbar);
		setSupportActionBar(mToolbar);
		mActionBar = getSupportActionBar();
    }

}
