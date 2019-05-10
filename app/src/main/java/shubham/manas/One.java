package shubham.manas;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class One extends Fragment {

    Button button;
    int count = 0;
     BridgeFragone bridgeFragone;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        button = v.findViewById(R.id.btnone);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Toast.makeText(getActivity(), "one", Toast.LENGTH_SHORT).show();
                bridgeFragone.data(count);
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BridgeFragone) {
            bridgeFragone = (BridgeFragone) context;
        }
    }

    public interface BridgeFragone {
        void data(int count);
    }

}
