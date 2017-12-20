package kaichi.memoji;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {


    private WelcomeFragmentListener listener;
    View.OnClickListener startGameListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            listener.onStartGameButtonClicked();
        }
    };

    public WelcomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome,
                                     container,
                                     false);
        Button startGameButton = view.findViewById(R.id.startGameButton);
        startGameButton.setOnClickListener(startGameListener);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (WelcomeFragmentListener) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface WelcomeFragmentListener {
        void onStartGameButtonClicked();
    }
}
