package ui.wahyuapps.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements OnClickListener
{
	private CardView mRegister;
	private CardView mLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		mLogin = findViewById(R.id.login);
		mRegister = findViewById(R.id.register);

		mRegister.setOnClickListener(this);
		mLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.login:
				login();
				break;
			case R.id.register:
				Intent i = new Intent(this, RegisterActivity.class);
				startActivity(i);
				break;
		}
	}

	private void login() {
		EditText mEmail = findViewById(R.id.edit_email);
		EditText mPassword = findViewById(R.id.edit_password);

		String email = mEmail.getText().toString();
		String password = mPassword.getText().toString();

		if (!email.contains("@") || !email.contains(".")) {
			mEmail.setError("Invalid Email Address");
			return;
		}
		if (password.length() <= 8) {
			mPassword.setError("Password Must 8 Char");
			return;
		}
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
	}

}
