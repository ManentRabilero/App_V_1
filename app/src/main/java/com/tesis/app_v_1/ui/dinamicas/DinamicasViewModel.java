package com.tesis.app_v_1.ui.dinamicas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DinamicasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DinamicasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dinamicas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}