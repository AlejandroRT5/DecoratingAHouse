public class Decorator {


    public static void main(String[] args)
    {
    int[] X = DecoratorConcise.WallSizes(5,10,6);
        // Set budget
        int budget = 580;
        System.out.println("The long walls each have an area of " + X[0] + "m^2");
        System.out.println("The wide walls each have an area of " + X[1] + "m^2");
        // Set Wall Parameters
        float North_Wall_Length_Metres = 7f;
        float North_Wall_Height_Metres = 4f;
        float South_Wall_Length_Metres = 7f;
        float South_Wall_Height_Metres = 4f;
        float East_Wall_Length_Metres = 10f;
        float East_Wall_Height_Metres = 4f;
        float West_Wall_Length_Metres = 10f;
        float West_Wall_Height_Metres = 4f;

        // Find Wall Areas
        double North_Wall_Area = North_Wall_Height_Metres * North_Wall_Length_Metres;
        double South_Wall_Area = South_Wall_Height_Metres * South_Wall_Length_Metres;
        double East_Wall_Area = East_Wall_Height_Metres * East_Wall_Length_Metres;
        double West_Wall_Area = West_Wall_Height_Metres * West_Wall_Length_Metres;
        double Total_Area = North_Wall_Area + South_Wall_Area + East_Wall_Area + West_Wall_Area;

        // Various Paint Prices 2.5L
        // Data Source https://www.screwfix.com/c/decorating/gloss-paints/cat850172#:~:text=Gloss%20paints%20are%20used%20to,to%20interior%20or%20exterior%20surfaces.&text=Most%20can%20be%20used%20on,application%20and%20achieve%20better%20results.
        float Dulux_Satinwood_White_2500ml_Price = 31.99f;
        float Leyland_Satinwood_White_2500ml_Price = 17.99f;
        float Dulux_HighGloss_White_2500ml_Price = 14.99f;

        // Paint Price Per Litre
        float Dulux_Satinwood_White_Price_Litre = (float) (Dulux_Satinwood_White_2500ml_Price / 2.5);
        float Leyland_Satinwood_White_Price_Litre = (float) (Leyland_Satinwood_White_2500ml_Price / 2.5);
        float Dulux_HighGloss_White_Price_Litre = (float) (Dulux_HighGloss_White_2500ml_Price / 2.5);

        // Paint Required & Price per Area
        float Paint_Thickness_Metres = 0.001f;
        float Price_DuluxWhite_North_Wall = (float) (Dulux_Satinwood_White_Price_Litre * North_Wall_Area * Paint_Thickness_Metres);
        float Price_LeylandWhite_North_Wall = (float) (Leyland_Satinwood_White_Price_Litre * North_Wall_Area * Paint_Thickness_Metres);
        float Price_DuluxGlossWhite_North_Wall = (float) (Dulux_HighGloss_White_Price_Litre * North_Wall_Area * Paint_Thickness_Metres);
        float Price_DuluxWhite_South_Wall = (float) (Dulux_Satinwood_White_Price_Litre * South_Wall_Area * Paint_Thickness_Metres);
        float Price_LeylandWhite_South_Wall = (float) (Leyland_Satinwood_White_Price_Litre * South_Wall_Area * Paint_Thickness_Metres);
        float Price_DuluxGlossWhite_South_Wall = (float) (Dulux_HighGloss_White_Price_Litre * South_Wall_Area * Paint_Thickness_Metres);
        float Price_DuluxWhite_East_Wall = (float) (Dulux_Satinwood_White_Price_Litre * East_Wall_Area * Paint_Thickness_Metres);
        float Price_LeylandWhite_East_Wall = (float) (Leyland_Satinwood_White_Price_Litre * East_Wall_Area * Paint_Thickness_Metres);
        float Price_DuluxGlossWhite_East_Wall = (float) (Dulux_HighGloss_White_Price_Litre * East_Wall_Area * Paint_Thickness_Metres);
        float Price_DuluxWhite_West_Wall = (float) (Dulux_Satinwood_White_Price_Litre * West_Wall_Area * Paint_Thickness_Metres);
        float Price_LeylandWhite_West_Wall = (float) (Leyland_Satinwood_White_Price_Litre * West_Wall_Area * Paint_Thickness_Metres);
        float Price_DuluxGlossWhite_West_Wall = (float) (Dulux_HighGloss_White_Price_Litre * West_Wall_Area * Paint_Thickness_Metres);

        float Price_DuluxWhite_Total = Price_DuluxWhite_North_Wall + Price_DuluxWhite_South_Wall + Price_DuluxWhite_East_Wall + Price_DuluxWhite_West_Wall;
        float Price_LeylandWhite_Total = Price_LeylandWhite_North_Wall + Price_LeylandWhite_South_Wall + Price_LeylandWhite_East_Wall + Price_LeylandWhite_West_Wall;
        float Price_DuluxGlossWhite_Total = Price_DuluxGlossWhite_East_Wall + Price_DuluxGlossWhite_North_Wall + Price_DuluxGlossWhite_West_Wall + Price_DuluxGlossWhite_South_Wall;


        // Estimate Labour Prices
        float Decorator_Hourly_Rate = 15.60f;
        float Estimated_Hours_Per_Metre_Squared = 0.2f;
        float Estimated_Labour_Price_Per_Metre_Squared = Decorator_Hourly_Rate * Estimated_Hours_Per_Metre_Squared;
        float Estimated_Labour_Total = (float) (Estimated_Labour_Price_Per_Metre_Squared * Total_Area);

        // Estimated Total Price (Labour + Paint)
        float Using_DuluxWhite_Price = (float) ((Estimated_Labour_Price_Per_Metre_Squared + Price_DuluxWhite_Total) * Total_Area);
        float Using_LeylandWhite_Price = (float) ((Estimated_Labour_Price_Per_Metre_Squared + Price_LeylandWhite_Total) * Total_Area);
        float Using_DuluxGlossWhite_Price = (float) ((Estimated_Labour_Price_Per_Metre_Squared + Price_DuluxGlossWhite_Total) * Total_Area);

        // Round Prices for Quote
        int DuluxWhite_Paint_Quote = Math.round(Using_DuluxWhite_Price);
        int LeylandWhite_Paint_Quote = Math.round(Using_LeylandWhite_Price);
        int DuluxGlossWhite_Paint_Quote = Math.round(Using_DuluxGlossWhite_Price);

        // Print Cost for each Paint
        String Labour_Hourly = "The hourly rate for the decorator is ";
        String Labour_Total = "The estimated cost of labour is ";
        String DuluxWhite_Total = "The total cost of using Dulux White Paint including labour is ";
        String LeylandWhite_Total = "The total cost of using Leyland White Paint including labour is ";
        String DuluxGlossWhite_Total = "The total cost of using Dulux Gloss White Paint including labour is ";

        // Print details
        System.out.println(Labour_Hourly + "£" + Decorator_Hourly_Rate);
        System.out.println(Labour_Total + "£" + Estimated_Labour_Total);
        System.out.println(DuluxWhite_Total + "£" + DuluxWhite_Paint_Quote);
        System.out.println(LeylandWhite_Total + "£" + LeylandWhite_Paint_Quote);
        System.out.println(DuluxGlossWhite_Total + "£" + DuluxGlossWhite_Paint_Quote);

        // Budget Test
        if (DuluxWhite_Paint_Quote > budget) {
            System.out.println("Dulux White Paint is too costly");
        } else if (DuluxWhite_Paint_Quote == budget) {
            System.out.println("Dulux White Paint is suitable");
        } else {
            System.out.println("Dulux White Paint is suitable");
        }

        String Leyland_Budget_Test = (budget <= LeylandWhite_Paint_Quote) ? "Leyland White Paint is too costly" : "Leyland White Paint is suitable";
        String DuluxGloss_Budget_Test = (budget <= DuluxGlossWhite_Paint_Quote) ? "Dulux Gloss White Paint is too costly" : "Dulux Gloss White Paint is suitable";
        System.out.println(Leyland_Budget_Test);
        System.out.println(DuluxGloss_Budget_Test);

        // Quantity to test (Case switch practice):


        // Next thing to do is while, for, for each
         //String[] Paints = new String[3];
         String[] Paints = {"Leyland White Paint" , "Dulux White Paint" , "Dulux Gloss White Paint"};
         int[] Quotes = new int[3];
         Quotes[0] = LeylandWhite_Paint_Quote;
         Quotes[1] = DuluxWhite_Paint_Quote;
         Quotes[2]= DuluxGlossWhite_Paint_Quote;

         for (int S=0; S < 3; S++) {
             if (budget < Quotes[S]) {
                 System.out.println("You can't afford to use " + Paints[S]);
             } else {
                 System.out.println("You can afford to use " + Paints[S]);

             }
         }
         }







    }






