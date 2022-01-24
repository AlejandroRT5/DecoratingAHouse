public class DecoratorConcise {
public static int[] WallSizes(int Width, int Length, int Height)
        {


        // Set Wall Parameters
        int Length_Walls_Area = Length * Height;
        int Width_Walls_Area = Width * Height;

return new int[] {Length_Walls_Area, Width_Walls_Area};
        }
        }