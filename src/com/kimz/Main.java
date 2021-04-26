package com.kimz;

public class Main {

    public static void main(String[] args) {
	 Theatre theatre = new Theatre("Fox", 8, 12);
	 //theatre.getSeats();
        if (theatre.reserveSeat("C03")){
            System.out.println("seat reserved " + "please pay!");
        }else{
            System.out.println("seat already reserved");
        }

        if (theatre.reserveSeat("C03")){
            System.out.println("seat reserved " + "please pay!");
        }else{
            System.out.println("seat already reserved");
        }


    }
}
