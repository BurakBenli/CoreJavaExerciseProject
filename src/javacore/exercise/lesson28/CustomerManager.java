package javacore.exercise.lesson28;

public class CustomerManager {

    private ICustomerDal ıCustomerDal;

    public CustomerManager(ICustomerDal ıCustomerDal){
        this.ıCustomerDal = ıCustomerDal;
    }

    public void add(){
        //İş Kodları Yazılır
        ıCustomerDal.Add();

    }
}
