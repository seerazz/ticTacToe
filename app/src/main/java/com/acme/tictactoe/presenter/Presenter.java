package com.acme.tictactoe.presenter;


public interface Presenter {

    void onCreate();
    void onPause();
    void onResume();
    void onDestroy();
    void onButtonSelected(int row, int col);
    void onResetSelected();
}
