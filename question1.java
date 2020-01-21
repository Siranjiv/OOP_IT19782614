class Q1
{
    public static void main (String[] args)
    {
        int miles,yards;
        double km;
        miles=26;
        yards=385;
        km=miles*1.609 + yards*(1.609/1760);
        System.out.println("kilometers = "+km);
    }
}