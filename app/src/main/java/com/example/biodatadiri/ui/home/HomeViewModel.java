//tgl pengerjaan : 11 Mei 2020
//NIM : 10117250
//Nama : Muhammad Syahrul Ramadan
//Kelas : IF-8

package com.example.biodatadiri.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
