public class WrapperClassConvert{

    public static Object convertToWrapper(int value){
       
        Integer object = Integer.valueOf(value);
       
        try{

            if(object instanceof Integer){
                return object;
            }

            else{
                System.out.println("Give proper primitive as input");
            }
              
        }     
       
        catch (Exception e){
            System.out.println(e);

        }
       
        return object;
    }
    public static void main(String[] args) {
       
        int value = 10;
        System.out.println(convertToWrapper(value));
    }
}