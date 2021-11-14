package com.company;

public class test_2D_array {
    public static void main(String[] args) {
        int [][] flats;
        flats = new int[8][8]; // 8-8 2-D Array means 8 rows and 8 columns;

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[0][3] = 104;
        flats[0][4] = 105;
        flats[0][5] = 106;
        flats[0][6] = 107;
        flats[0][7] = 108;

        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        flats[1][3] = 204;
        flats[1][4] = 205;
        flats[1][5] = 206;
        flats[1][6] = 207;
        flats[1][7] = 208;

        flats[2][0] = 301;
        flats[2][1] = 302;
        flats[2][2] = 303;
        flats[2][3] = 304;
        flats[2][4] = 305;
        flats[2][5] = 306;
        flats[2][6] = 307;
        flats[2][7] = 308;

        flats[3][0] = 301;
        flats[3][1] = 302;
        flats[3][2] = 303;
        flats[3][3] = 304;
        flats[3][4] = 305;
        flats[3][5] = 306;
        flats[3][6] = 307;
        flats[3][7] = 308;

        flats[4][0] = 401;
        flats[4][1] = 402;
        flats[4][2] = 403;
        flats[4][3] = 404;
        flats[4][4] = 405;
        flats[4][5] = 406;
        flats[4][6] = 407;
        flats[4][7] = 408;



        flats[5][0] = 501;
        flats[5][1] = 502;
        flats[5][2] = 503;
        flats[5][3] = 504;
        flats[5][4] = 505;
        flats[5][5] = 506;
        flats[5][6] = 507;
        flats[5][7] = 508;

        flats[6][0] = 601;
        flats[6][1] = 602;
        flats[6][2] = 603;
        flats[6][3] = 604;
        flats[6][4] = 605;
        flats[6][5] = 606;
        flats[6][6] = 607;
        flats[6][7] = 608;

        flats[7][0] = 701;
        flats[7][1] = 702;
        flats[7][2] = 703;
        flats[7][3] = 704;
        flats[7][4] = 705;
        flats[7][5] = 706;
        flats[7][6] = 707;
        flats[7][7] = 708;

//        flats[8][0] = 801;
//        flats[8][1] = 802;
//        flats[8][2] = 803;

        for(int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
