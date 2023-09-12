


    class sport{
        void show(){
            System.out.println("type of sport");
    }
    }
    class football extends sport{
        void show(){
            System.out.println("this is game football");
        }
    }
    class cricket extends sport{
        void show(){
            System.out.println("this is game cricket");
        }
    }
    public class Main
{
	public static void main(String[] args) {
	    sport r=new football();
	    r.show();
	}
}
