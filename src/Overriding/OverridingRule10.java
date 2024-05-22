package Overriding;
/* Rule No:10 Constructors cannot be overridden */
class ABC{
    public ABC()
    {
    }
    int test()
    {
        return 1;
    }
    String Show()
    {
        String s=new String();
        return s;
    }
    void objcetretrunmethod()
    {
        objcetretrunmethod();
    }
    public class XYZ extends ABC
    {
        public XYZ()
        {
            super();
        }
        int test()
        {
            return super.test();
        }
        String Show()
        {
            return super.Show();
        }
        void objcetretrunmethod()
        {
            super.objcetretrunmethod();
        }
    }
    public static void main(String[] args)
    {
    }
}


