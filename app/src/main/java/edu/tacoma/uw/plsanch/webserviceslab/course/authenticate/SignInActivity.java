package edu.tacoma.uw.plsanch.webserviceslab.course.authenticate;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.tacoma.uw.plsanch.webserviceslab.R;

public class SignInActivity extends AppCompatActivity implements LoginFragment.LoginInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new LoginFragment() )
                .commit();

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    @Override
    public void login(String userId, String pwd) {

    }
}
