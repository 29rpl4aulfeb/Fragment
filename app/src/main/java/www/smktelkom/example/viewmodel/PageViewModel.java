package www.smktelkom.example.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();
    private MutableLiveData<String> mPhone = new MutableLiveData<>();

    public void setmName(String name){
        mName.setValue(name);
    }
    public LiveData<String>getName(){
        return mName;
    }

    public void setmAddress(String address){
        mAddress.setValue(address);
    }
    public LiveData<String>getAddress(){
        return mAddress;
    }

    public void setmPhone(String phone){
        mPhone.setValue(phone);
    }
    public LiveData<String>getPhone(){
        return mPhone;
    }
}
