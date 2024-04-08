package com.mycompany.parcial1.box;

public class PackageSend {
    private String ID;
    private boolean delivered;

    public PackageSend(String ID) {
        this.ID = ID;
        this.delivered = false;
    }

    public String getID() {
        return ID;
    }
    

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
    
    
    
    
    
}
