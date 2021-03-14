/**
 * This class creates hurricane objects with years, names, months, categories,
 * pressures, and windspeed
 *
 * @author Andrew Martin
 * @version 1.0
 * @since 3/13/2021
 */

public class Hurricane {
   private String name, month;
   private int year;
   private int cat;
   private int pressure;
   private double windspeed;

   // constructor - all private instance variables initialized
   public Hurricane(int y, String n, String m, int c, int p, double w) {
      this.year = y;
      this.name = n;
      this.month = m;
      this.cat = c;
      this.pressure = p;
      this.windspeed = w;
   }

   // accessor for year
   public int getYear() {
      return year;
   }

   // accessor for name
   public String getName() {
      return name;
   }

   // accessor for month
   public String getMonth() {
      return month;
   }

   // accessor for category
   public int getCat() {
      return cat;
   }

   // accessor for pressure
   public int getPressure() {
      return pressure;
   }

   // accessor for windspeed
   public double getWindspeed() {
      return windspeed;
   }

   public void calcCat() {
      if (windspeed >= 74 && windspeed <= 95) {
         cat = 1;
      } else if (windspeed >= 96 && windspeed <= 110) {
         cat = 2;
      } else if (windspeed >= 111 && windspeed <= 129) {
         cat = 3;
      } else if (windspeed >= 130 && windspeed <= 156) {
         cat = 4;
      } else if (windspeed >= 157) {
         cat = 5;
      } else {
         cat = 1;
      }
   }

   public void calcWindSpeedMPH() {
      windspeed = windspeed * 1.15078;
   }

   // mutator for year
   public void setYear(int y) {
      year = y;
   }

   // mutator for name
   public void setName(String n) {
      name = n;
   }

   // mutator for month
   public void setMonth(String m) {
      month = m;
   }

   // mutator for category
   public void setCat(int c) {
      cat = c;
   }

   // mutator for pressure
   public void setPressure(int p) {
      pressure = p;
   }

   // mutator for windspeed
   public void setWindspeed(double w) {
      windspeed = w;
   }

   public String toString() {
      return String.format(" %4d     %-16s%1d%14d%21.2f", year, name, cat, pressure, windspeed);
   }

}
