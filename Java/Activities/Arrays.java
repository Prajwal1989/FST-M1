package Examples;

public class Arrays {
        public static void main(String[] args) {
            String [] carMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
            String [] carModel = {"330i","m3", "m5"};

            //This is to store the size of the Array
            int iLength = carMake.length;
            System.out.println("Length of the Array is: " + iLength);

            int jLength = carModel.length;
            System.out.println("Length of the Array is: " + jLength);

            //This is to access the first element of an array directly with it's position
            String sBMW = carMake[0];
            System.out.println("First value of the Array is ==> " + sBMW);

            //This is to access the last element of an Array
            String sHonda = carMake[iLength-1];
            System.out.println("Last value of the Array is ==> " + sHonda);
        }
}
