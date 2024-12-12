package pkg;

public class Movie{
    String name;
    double rating;
    int numRating;
    int revenue;
    int sum =0;
    public Movie()
    {
      name = "Avengers";
      rating = 8.0;
      numRating = 33;
      revenue = 623357910;
    }
    public Movie(String name, double rating, int numRating, int revenue)
    {
        this.name = name;
        this.rating = rating;
        this.numRating = numRating;
        this.revenue = revenue;
    }
    public void movieToString()
    {
        System.out.println(name);
        System.out.println(rating);
        System.out.println(numRating);
        System.out.print(revenue);
        System.out.println('\n');
    }
    public String getMovieName(){
        return name;
    }
    public int getRevenue(){
     return revenue;
    }
    public double addRating(double a)
    {
        int numRating2;
        numRating2 = numRating+1;
        rating = ((rating*numRating)+a)/numRating2;
        numRating++;
        return rating;
    }
    public double getRating()
    {
        return rating;
    }
    public boolean compareRatings(Movie a)
    {
    return a.getRating()<getRating();
    }
    
}
