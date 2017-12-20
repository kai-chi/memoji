package kaichi.memoji;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity
        implements WelcomeFragment.WelcomeFragmentListener {

    private final String TAG = MainActivity.class.getName();

    WelcomeFragment welcomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeFragment = new WelcomeFragment();
        getSupportFragmentManager().beginTransaction()
                                   .replace(R.id.fragmentContainer,
                                            welcomeFragment)
                                   .commit();
    }

    @Override
    public void onStartGameButtonClicked() {
        TextInputLayout textInputLayout = findViewById(R.id.boardSizeTextInputLayout);
        String boardSize = textInputLayout.getEditText().getText().toString();
        if (boardSize.equals("")) {
            Snackbar.make(findViewById(android.R.id.content),
                          R.string.snack_board_size,
                          Snackbar.LENGTH_LONG).show();
        } else {
            int size = Integer.valueOf(boardSize);
            Log.i(TAG,
                  "Create board game of size " + size);
        }
    }
}
