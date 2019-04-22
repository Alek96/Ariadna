package com.example.ariadna;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class TestsFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tests, container, false);

        view.findViewById(R.id.ButtonBluetoothTest).setOnClickListener(this);
        view.findViewById(R.id.ButtonBatteryTest).setOnClickListener(this);
        view.findViewById(R.id.ButtonMotorsTests).setOnClickListener(this);
        view.findViewById(R.id.ButtonSensorsTest).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.ButtonBluetoothTest) {
            Toast.makeText(getActivity(), "Run", Toast.LENGTH_SHORT).show();
            getFragmentManager().beginTransaction().replace(R.id.fragment_test_container,
                    new TestResultFragment()).commit();
        } else if (id == R.id.ButtonBatteryTest) {
            Toast.makeText(getActivity(), "Run", Toast.LENGTH_SHORT).show();
            getFragmentManager().beginTransaction().replace(R.id.fragment_test_container,
                    new TestResultFragment()).commit();
        } else if (id == R.id.ButtonMotorsTests) {
            getFragmentManager().beginTransaction().replace(R.id.fragment_test_container,
                    new MotorsTestsFragment()).commit();
        } else if (id == R.id.ButtonSensorsTest) {
            getFragmentManager().beginTransaction().replace(R.id.fragment_test_container,
                    new SensorsTestsFragment()).commit();
        }
    }
}
