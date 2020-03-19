package loose.oose.fis.newPackage;

public class newClass
{
    private int numar;
    private String name;

    public newClass (int numar, String name)
    {
        this.name = name;
        this.numar = numar;
    }

    public int getNumar()
    {
        return numar;
    }

    public String getName()
    {
        return name;
    }

    public void testMethod()
    {
        System.out.println("Clasa facuta in branch nou");
    }
}
