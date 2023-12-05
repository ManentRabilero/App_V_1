package com.tesis.app_v_1.ui.puntuaciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tesis.app_v_1.databinding.FragmentPuntuacionesBinding;

public class PuntuacionesFragment extends Fragment {

    private FragmentPuntuacionesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PuntuacionesViewModel puntuacionesViewModel =
                new ViewModelProvider(this).get(PuntuacionesViewModel.class);

        binding = FragmentPuntuacionesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPuntuaciones;
        puntuacionesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}