package com.tesis.app_v_1.ui.puntuaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PuntuacionesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PuntuacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is puntuaciones fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}