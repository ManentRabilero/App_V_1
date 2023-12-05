package com.tesis.app_v_1.ui.dinamicas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tesis.app_v_1.databinding.FragmentDinamicasBinding;

public class DinamicasFragment extends Fragment {

    private FragmentDinamicasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DinamicasViewModel dinamicasViewModel =
                new ViewModelProvider(this).get(DinamicasViewModel.class);

        binding = FragmentDinamicasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDinamicas;
        dinamicasViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}