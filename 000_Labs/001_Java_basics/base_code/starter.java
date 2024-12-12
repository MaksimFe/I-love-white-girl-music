package pkg;

public class Movie{
    String movie;// 1
    double rating; //1
    int revenue;//1
    int numRatings;//1
    
public Movie(){//1
    movie = "Avengers"; //1
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;
    
}
public Movie(String a, double b, int c, int d){//1
    movie = a;//1
    rating = b;
    numRatings = c;
    revenue = d;
}
// Part 2
public void movieToString(String a, double b, int c, int d){
    System.out.println("Movie: " + movie);//1
    System.out.println("Rating: " + rating);
    System.out.println("Number of ratings: " + numRatings);
    System.out.println("Revenue: " + revenue);
}
// Part 3
public String getMovieName(){//1
    return movie;//1
}
public double getRevenue(){
    return rating;
}
public int getNumber(){
    return numRatings;
}
//public int getRevenue(){
   // return revenue;
//}
// Part 4

public double addRating(double a){//0
    rating = ((rating * numRatings + a)/(numRatings + 1));//2
    
    numRatings++;//1
    return rating;
}

// Part 5
public double getRatings(){//1
    return rating;
}

public boolean compareRatings(Movie a){//2
    return a.getRatings < rating;
}

}