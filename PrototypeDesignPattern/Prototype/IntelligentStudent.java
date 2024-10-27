package PrototypeDesignPattern.Prototype;

public class IntelligentStudent extends Student{

    private int iq;


    public IntelligentStudent clone(){
        IntelligentStudent copy = new IntelligentStudent();
        copy.setName(this.getName());
        copy.setAge(getAge());
        copy.setPsp(getPsp());
        copy.setBatchName(getBatchName());
        copy.setAvgBatchPSP(getAvgBatchPSP());
        copy.iq = this.iq;
        return copy;
    }

    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }    
}
