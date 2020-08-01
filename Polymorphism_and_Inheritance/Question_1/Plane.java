
class Plane extends Vehicle
{
    //System.out.println (new Plane ("White", 416, "Boeing", 737));

    String manufact;
    int model_num;
    Plane(String color,int doors,String manufactoror,int model_n)
    {
    super(doors,color);   
this.manufact=manufactoror;
this.model_num=model_n;
    }
   
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" "+manufact+" "+model_num;
    }
   
   
}



