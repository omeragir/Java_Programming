package day34_abstraction.deviceTask;

public class DeviceShop {
    public static void main(String[] args) {
        //Phone phone =new Phone("Phone","Ph1",850,"Black",'L',true,true);    abstract can not obj

        Samsung samsung=new Samsung("Samsung","S22",750,"White",'M',true,true);
        samsung.downloadApp();
        System.out.println(samsung);

        Laptop laptop=new Laptop("Lenovo","S22",550,"Black",'L',true,true);
        System.out.println(laptop);


    }
}
