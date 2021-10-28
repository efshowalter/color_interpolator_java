# Java Color Interpolator


This program is designed to allow for experimentation with colors and how their RGBA values interact. On launch, the window will show a rectangle with four colors - red, grene, blue, and yellow - and by clicking on the corners, the user can edit the RGBA values in each corner. The rectangle will automatically update all values in between the corners to be accurate interpolations of all colors. Bogus input (non-integers, invalid number values, etc.) will cause the program to default to the color white for that corner.

The algorithm used interpolates first the X values in the top two corners, taking into account the relative distance to each, and then does the same for the bottom two corners. The Y value is then interpolated between these two new values, arriving at the desired color.
