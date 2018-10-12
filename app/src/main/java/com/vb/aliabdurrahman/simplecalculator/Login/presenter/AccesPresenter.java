package com.vb.aliabdurrahman.simplecalculator.Login.presenter;

import com.vb.aliabdurrahman.simplecalculator.Base.BasePresenter;
import com.vb.aliabdurrahman.simplecalculator.Login.view.AccessView;

/**
 * Created by AliAbdurrahman on 10/11/18.
 */

public class AccesPresenter implements BasePresenter<AccessView>{

    AccessView accessView;

    public void tambah (String bilSatu, String bilDua) {
        Double bilangan1 = Double.parseDouble(bilSatu);
        Double bilangan2 = Double.parseDouble(bilDua);
        double hasil = bilangan1 + bilangan2;
        accessView.onSuccess(String.valueOf(hasil));
    }

    public void kurang (String bilSatu, String bilDua) {
        Double bilangan1 = Double.parseDouble(bilSatu);
        Double bilangan2 = Double.parseDouble(bilDua);
        double hasil = bilangan1 - bilangan2;
        accessView.onSuccess(String.valueOf(hasil));
    }

    public void kali (String bilSatu, String bilDua) {
        Double bilangan1 = Double.parseDouble(bilSatu);
        Double bilangan2 = Double.parseDouble(bilDua);
        double hasil = bilangan1 * bilangan2;
        accessView.onSuccess(String.valueOf(hasil));
    }

    public void bagi (String bilSatu, String bilDua) {
        Double bilangan1 = Double.parseDouble(bilSatu);
        Double bilangan2 = Double.parseDouble(bilDua);
        double hasil = bilangan1 / bilangan2;
        accessView.onSuccess(String.valueOf(hasil));
    }

    public void clear(String bil1,String bil2){
        bil1 = "";
        bil2 = "";
    }


    @Override
    public void onAttach(AccessView v) {
        accessView = v;
    }
}
