package ui.wahyuapps.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements OnClickListener
{
	private CardView mRegister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		mRegister = findViewById(R.id.register);
		mRegister.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.register:
				register();
				break;
		}
	}

	private void register() {
		EditText mName = findViewById(R.id.edit_name);
		EditText mEmail = findViewById(R.id.edit_email);
		EditText mPassword = findViewById(R.id.edit_password);

		String name = mName.getText().toString();
		String email = mEmail.getText().toString();
		String password = mPassword.getText().toString();

		if (name.isEmpty()) {
			mName.setError("Harus Diisi");
			return;
		}
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
