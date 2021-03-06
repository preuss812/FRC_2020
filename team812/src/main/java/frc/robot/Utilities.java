/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class Utilities {

    public static double scaleDouble(final double input, final double to_min, final double to_max) {
            final double from_min = -1.0;
            final double from_max = 1.0;
        double x;
        double scaled_x = 0.0;
        if( to_max > to_min  && from_max > from_min )
        {
            x =  input;
            scaled_x = ((x - from_min) * (to_max - to_min)) / 
                        (to_max - to_min) +
                        to_min;
        }
        return scaled_x;    
    }
}