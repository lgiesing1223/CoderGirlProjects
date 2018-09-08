import java.text.DecimalFormat;

import static java.lang.System.out;

public class PracticeTemperatures {

    public static void main(String[] args) {

        DecimalFormat numFormat = new DecimalFormat("#.##");

        int temps[][] = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        String days[] = new String [7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        String times[] = new String [4];
        times[0] = "7:00 AM";
        times[1] = "3:00 PM";
        times[2] = "7:00 PM";
        times[3] = "3:00 AM";

  float dayTotal=0;
  float total=0;
  float dayAvg = 0;

  out.println("THE AVERAGE TEMPERATURE FOR EACH DAY OF THE WEEK IS: ");

for (int column = 0; column < 7; column++) {     //CALCULATE/DISPLAY AVERAGES OF EACH DAY OF THE WEEK
    dayTotal = 0;
    total = 0;
    for(int row = 0; row <4; row++) {
        dayTotal = temps[row][column];
        total += dayTotal ;
        }
        dayAvg = total/4;
    out.println(days[column] + ": "+dayAvg);
}

out.println();
out.println();
out.println("THE AVERAGE TEMPERATURE FOR EACH TIME IS: ");

float timeTotal = 0;
float tTotal = 0;
float timeAvg = 0;

for(int row = 0; row <4; row++) {        //calculate avg per each time
    timeTotal = 0;
    tTotal= 0;
    for (int column = 0; column < 7; column ++){
        timeTotal = temps[row][column];
        tTotal += timeTotal;
    }
    timeAvg = tTotal/7;
    out.println(times[row] + ": " + numFormat.format(timeAvg));
}

out.println();
out.println();

float allTotal = 0;
float allAvg= 0;
int counter = 0;

for (int row = 0; row <4; row++) {
    for (int column = 0; column < 7; column++) {
        allTotal += temps[row][column];
        counter++;
    }
}
allAvg = allTotal / counter;
out.println("The average overall is " + numFormat.format(allAvg));

    }
}
















