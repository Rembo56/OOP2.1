package Transport;

public class Car {

    public class Key {
        private final String remoutLounch;
        private final String keyLess;

        public Key (String remoutLounch, String keyLess){

            if (remoutLounch != " " && remoutLounch != null) {
                this.remoutLounch = remoutLounch;
            } else {
                this.remoutLounch = "Default";
            }

            if (keyLess != " " && keyLess != null) {
                this.keyLess = keyLess;
            } else {
                this.keyLess = "Default";
            }
        }
    }
    public static final String BRAND="Lada";
    // this.brand = brand;
    public static final String MODEL="Granta";

    public static final String PROD_COUNTRY = "Russia";
    public static final int PROD_YEAR = 2000;
    public float engineVolume;
    public String colour;
    public String transmission;
    public static final String TYPE_BODY="Sedan";
    public int registerNumber;
    public static final int PLACE_COUNT=5;

    public boolean typeTire;

    public int mounth;


    public String getBrand() {
        return BRAND;
    }

    public String getModel() {
        return MODEL;
    }

    public String getProductionCountry() {
        return PROD_COUNTRY;
    }

    public int getProductionYear() {
        return PROD_YEAR;
    }

    public void printTires() {
        System.out.println(typeTire);}

    public String getTypeBodyCar() {

        return TYPE_BODY;
    }

    public final int getNumberPlace() {

        return PLACE_COUNT;
    }

    public Car(String colour, float engineVolume, String transmission, int registerNumber, boolean typeTire) {


        if (transmission != " " && transmission != null) {
            this.transmission = transmission;
        } else {
            this.transmission = "Default";
        }

        if (registerNumber>0) {
            this.registerNumber = registerNumber;
        } else {
            this.registerNumber = 1;
        }


        if (colour != " " && colour != null) {
            this.colour = colour;
        } else {
            this.colour = "White";
        }


        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5F;
        }
    }


    public void seasonTyre(int mounth) {
        if (mounth > 12 || mounth <=0)
        {
            System.out.println("???????????????????????? ????????????");
        }
        else
        {
            if (mounth > 4 && mounth < 10) {
                this.typeTire = true;
                System.out.println(this.typeTire);
            } else {
                this.typeTire = false;
                System.out.println(this.typeTire);
            }
        }
    }

    public void info () {

        System.out.println("?????????? ???????????? " + BRAND);
        System.out.println("???????????? " + MODEL);
        System.out.println("???????????? ?????????????????????????? " + PROD_COUNTRY);
        System.out.println("?????? ?????????????? " + PROD_YEAR);
        System.out.println("???????? " + colour);
        System.out.println("?????????? ?????????????????? " + engineVolume);
        System.out.println("?????????????? ?????????????? " + transmission);
        System.out.println("?????? ???????????? " + TYPE_BODY);
        System.out.println("?????????????????????????????? ?????????? " + registerNumber);
        System.out.println("???????????????????? ???????? " + PLACE_COUNT);
        System.out.println("?????????????? ?????????????? " + transmission);
        System.out.println();

    }
}


