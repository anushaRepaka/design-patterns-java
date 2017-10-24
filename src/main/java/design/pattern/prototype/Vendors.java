package design.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vendors implements Cloneable
{
    private List<String> vendorList;

    public Vendors()
    {
        vendorList = new ArrayList<String>();
    }

    public Vendors(List<String> vendorList)
    {
        this.vendorList = vendorList;
    }

    public void loadData(){
        //read all vendors from database and put into the list
        vendorList.add("ALIE & CO.");
        vendorList.add("CBS RADIO");
        vendorList.add("Lights Rentals");
    }

    public List<String> getVendorList()
    {
        return vendorList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getVendorList()){
            temp.add(s);
        }
        return new Vendors(temp);
    }
}
