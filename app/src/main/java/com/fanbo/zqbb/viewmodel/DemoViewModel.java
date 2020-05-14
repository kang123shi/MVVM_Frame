package com.fanbo.zqbb.viewmodel;

import com.fanbo.zqbb.bean.LoginBean;
import com.fanbo.zqbb.network.DataRepository;
import java.util.Observable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Eason Time 2020/5/13
 * <p>
 * Describe:
 */
public class DemoViewModel extends ViewModel {

    public final ObservableField<String> userID = new ObservableField<>();

    public LiveData<LoginBean> getPhoneLogin(String phone, String pass){

        return DataRepository.getInstance().getPhoneLoginData(phone,pass);
    }

}
