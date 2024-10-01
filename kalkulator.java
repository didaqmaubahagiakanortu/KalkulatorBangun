import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) throws InterruptedException {

        // greetings

        System.out.println("Selamat datang di Project Dimension. \nKalkulator yang dapat menghitung keliling, luas, dan volume tiap bangun datar maupun ruang.");
        System.out.println("===========================================================================================");

        // 2d or 3d

        Scanner input = new Scanner(System.in);
        System.out.println("Apakah bangun ini berupa bangun datar atau bangun ruang? (Y untuk bangun datar, N untuk bangun ruang)");
        char dimension = input.next().charAt(0);
        System.out.println("===========================================================================================");

        // 2d time

        if (dimension == 'Y' || dimension == 'y') {

            System.out.println("Bangun datar apakah yang ingin anda gunakan? Tulis saja nomornya berdasarkan list di bawah text ini. \n1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran");
            int flatShape = input.nextInt();

            int keliling;
            int luas;

            System.out.println("===========================================================================================");

            switch (flatShape) {

            // square time

                case 1 -> {

                    System.out.println("Masukkan nilai sisinya.");
                    double squareLength = input.nextDouble();
                    keliling = (int) Math.round(4 * squareLength);
                    luas = (int) Math.round(Math.pow(squareLength, 2));

                    System.out.println("===========================================================================================");
                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(5000);
                    System.out.println("===========================================================================================");

                    System.out.println("Keliling dari persegi tersebut adalah " + keliling + " cm.");
                    System.out.println("Luas dari persegi tersebut adalah " + luas + " cm2.");

                }

            // rectangle time
                
                case 2 -> {

                    System.out.println("Masukkan nilai panjangnya.");
                    double rectangleLength = input.nextDouble();
                    System.out.println("===========================================================================================");
                    System.out.println("Masukkan nilai lebarnya.");
                    double rectangleWidth = input.nextDouble();

                    keliling = (int) Math.round(2 * (rectangleLength + rectangleWidth));
                    luas = (int) Math.round(rectangleLength * rectangleWidth);

                    System.out.println("===========================================================================================");
                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(5000);
                    System.out.println("===========================================================================================");

                    System.out.println("Keliling dari persegi panjang tersebut adalah " + keliling + " cm.");
                    System.out.println("Luas dari persegi panjang tersebut adalah " + luas + " cm2.");

                }

            // triangle time

                case 3 -> {

                    System.out.println("Masukkan nilai alasnya.");
                    double triangleLength = input.nextDouble();
                    System.out.println("===========================================================================================");
                    System.out.println("Masukkan nilai tingginya.");
                    double triangleHeight = input.nextDouble();

                    int sisiMiring = (int) Math.round(Math.sqrt(Math.pow(triangleLength, 2) + Math.pow(triangleHeight, 2)));
                    keliling =(int) Math.round(triangleLength + triangleHeight + sisiMiring);
                    luas = (int) Math.round(0.5 * triangleLength * triangleHeight);

                    System.out.println("===========================================================================================");
                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(5000);
                    System.out.println("===========================================================================================");

                    System.out.println("Sisi miring dari segitiga tersebut adalah " + sisiMiring + " cm.");
                    System.out.println("Keliling dari segitiga tersebut adalah " + keliling + " cm.");
                    System.out.println("Luas dari segitiga tersebut adalah " + luas + " cm2.");

                }

            // circle time

                case 4 -> {

                    System.out.println("Apakah anda menggunakan nilai jari-jari atau diameter? (Y untuk jari-jari dan N untuk diameter)");
                    char radiusDetermine = input.next().charAt(0);
                    System.out.println("===========================================================================================");

                    if (radiusDetermine == 'Y' || radiusDetermine == 'y') {
                        System.out.println("Masukkan nilai jari-jarinya. (Tanpa desimal)");
                    } else {
                        System.out.println("Masukkan nilai diameternya. (Tanpa desimal)");
                    }

                    double circleRadius = input.nextDouble();

                    if (radiusDetermine != 'Y' || radiusDetermine != 'y') {
                        circleRadius /= 2;
                    }

                    keliling = (int) ((int) Math.PI * (circleRadius * 2));
                    luas = (int) (Math.PI * Math.pow(circleRadius, 2));

                    System.out.println("===========================================================================================");
                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(5000);
                    System.out.println("===========================================================================================");

                    System.out.println("Keliling dari lingkaran tersebut adalah " + keliling + " cm.");
                    System.out.println("Luas dari lingkaran tersebut adalah " + luas + " cm2.");

                }
            
            // unidentified time

                default -> {

                    System.out.println("Bentuk tidak dapat dikenal.");
                    System.out.println("Pastikan anda memasukkan nilai yang benar.");

                }        
            }
        } else if (dimension == 'N' || dimension == 'n') {
            
            System.out.println("Bangun datar apakah yang ingin anda gunakan? Tulis saja nomornya berdasarkan list di bawah text ini. \n1. Kubus \n2. Balok \n3. Tabung \n4. Bola");
            int thickShape = input.nextInt();

            int luas;
            int volume;

            System.out.println("===========================================================================================");

            switch (thickShape) {

                // cube time

                case 1 -> {

                    System.out.println("Masukkan nilai sisinya.");
                    double cubeLength = input.nextDouble();
                    System.out.println("===========================================================================================");

                    luas = (int) Math.round(Math.pow(cubeLength, 2));
                    volume = (int) Math.round(Math.pow(cubeLength, 3));

                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(10000);
                    System.out.println("===========================================================================================");

                    System.out.println("Luas permukaan dari kubus tersebut adalah " + luas + " cm2.");
                    System.out.println("Volume dari kubus tersebut adalah " + volume + " cm3");

                }

                // block time

                case 2 -> {

                    System.out.println("Masukkan nilai panjangnya.");
                    double blockLength = input.nextDouble();
                    System.out.println("===========================================================================================");

                    System.out.println("Masukkan nilai lebarnya.");
                    double blockWidth = input.nextDouble();
                    System.out.println("===========================================================================================");

                    System.out.println("Masukkan nilai tingginya.");
                    double blockHeight = input.nextDouble();
                    System.out.println("===========================================================================================");

                    luas = (int) Math.round(2 * (blockLength * blockWidth + blockLength * blockHeight + blockWidth * blockHeight));
                    volume = (int) Math.round(blockLength * blockWidth * blockHeight);

                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(10000);
                    System.out.println("===========================================================================================");

                    System.out.println("Luas permukaan dari balok tersebut adalah " + luas + " cm2.");
                    System.out.println("Volume dari balok tersebut adalah " + volume + " cm3");

                }

                // barrel time

                case 3 -> {

                    System.out.println("Apakah anda menggunakan nilai jari-jari atau diameter? (Y untuk jari-jari dan N untuk diameter)");
                    char radiusDetermine = input.next().charAt(0);
                    System.out.println("===========================================================================================");

                    if (radiusDetermine == 'Y' || radiusDetermine == 'y') {
                        System.out.println("Masukkan nilai jari-jarinya. (Tanpa desimal)");
                    } else {
                        System.out.println("Masukkan nilai diameternya. (Tanpa desimal)");
                    }
                    double barrelRadius = input.nextDouble();
                    System.out.println("===========================================================================================");

                    System.out.println("Masukkan nilai tingginya.");
                    double barrelHeight = input.nextDouble();
                    System.out.println("===========================================================================================");

                    if (radiusDetermine != 'Y' || radiusDetermine != 'y') {
                        barrelRadius /= 2;
                    }

                    luas = (int) Math.round(2 * Math.PI * barrelRadius * (barrelRadius + barrelHeight));
                    volume = (int) Math.round(Math.PI * barrelRadius * barrelHeight);

                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(10000);
                    System.out.println("===========================================================================================");

                    System.out.println("Luas permukaan dari tabung tersebut adalah " + luas + " cm2.");
                    System.out.println("Volume dari tabung tersebut adalah " + volume + " cm3");

                }

                // ball time

                case 4 -> {

                    System.out.println("Apakah anda menggunakan nilai jari-jari atau diameter? (Y untuk jari-jari dan N untuk diameter)");
                    char radiusDetermine = input.next().charAt(0);
                    System.out.println("===========================================================================================");

                    if (radiusDetermine == 'Y' || radiusDetermine == 'y') {
                        System.out.println("Masukkan nilai jari-jarinya. (Tanpa desimal)");
                    } else {
                        System.out.println("Masukkan nilai diameternya. (Tanpa desimal)");
                    }
                    double ballRadius = input.nextDouble();

                    if (radiusDetermine != 'Y' || radiusDetermine != 'y') {
                        ballRadius /= 2;
                    }

                    luas = (int) Math.round(4 * Math.PI * Math.pow(ballRadius, 2));
                    volume = (int) Math.round((4 / 3) * Math.PI * Math.pow(ballRadius, 3));

                    System.out.println("Mohon menunggu nilai anda yang sedang diproses.");
                    Thread.sleep(10000);
                    System.out.println("===========================================================================================");

                    System.out.println("Luas permukaan dari bola tersebut adalah " + luas + " cm2.");
                    System.out.println("Volume dari bola tersebut adalah " + volume + " cm3");

                }

                // undefined time

                default -> {

                    System.out.println("Bentuk tidak dapat dikenal.");
                    System.out.println("Pastikan anda memasukkan nilai yang benar.");

                }
            }
        } else {

            System.out.println("Input anda tidak bisa saya terima. \nMohon coba lagi.");
            
        }

        // credits

        System.out.println("===========================================================================================");
        System.out.println("Sekian, terimakasih.");
        System.out.println("Code written by @kurniawandidaw");

    }
        
}