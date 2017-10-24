package design.pattern.prototype;

import java.util.List;

public class PrototypePatternTest
{

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Vendors vendors = new Vendors();
        vendors.loadData();

        //Use the clone method to get the Vendor object
        Vendors vendorNew = (Vendors) vendors.clone();
        List<String> list = vendorNew.getVendorList();
        list.add("Alex Dress Rentals");

        System.out.println("Vendor List: "+ vendors.getVendorList());
        System.out.println("VendorNew List: "+list);

    }

}
