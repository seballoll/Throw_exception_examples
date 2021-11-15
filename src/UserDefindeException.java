public class UserDefindeException {
    public static void thrower(){
     try
    {
        //excepcion definida por el usuario
        System.out.println("Running the code to throw an user defined exceptio"+"\n");
        throw new UserDefinedException("This is user-defined exception");
    }
        catch (UserDefinedException ude)
    {
        System.out.println("Caught the exception"+"\n");

        System.out.println(ude.getMessage());
    }
    }
    public static void main(String args[]){
        thrower();
    }
}
