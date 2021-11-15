public class Throw_example {
    //codigo para revisar si una persona puede votar
    public static void validate(int age) {
        if(age<18) {

            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String args[]){
        System.out.println("code before the try block"+"\n");
        try{
            System.out.println("inside the try block"+"\n");
        validate(13);
        }finally {
            System.out.println("rest of the code...");
        }

    }

}
