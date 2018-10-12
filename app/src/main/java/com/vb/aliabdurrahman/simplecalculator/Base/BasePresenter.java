package com.vb.aliabdurrahman.simplecalculator.Base;

/**
 * Created by AliAbdurrahman on 10/11/18.
 */

public interface BasePresenter <T extends BaseView> {

    void onAttach(T v);

}
